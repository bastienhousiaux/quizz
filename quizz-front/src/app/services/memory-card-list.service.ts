import { Injectable, Optional } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { MemoryCardListModel } from '../models/MemoryCardListModel';
import { Observable, BehaviorSubject } from 'rxjs';
import { environment } from 'src/environments/environment';
import { MemoryCardModel } from '../models/MemoryCardModel';

@Injectable({
  providedIn: 'root'
})
export class MemoryCardListService {

  private _listsDecriptors:BehaviorSubject<MemoryCardListModel[]>;


  constructor(public httpClient:HttpClient) {
    this._listsDecriptors=new BehaviorSubject<MemoryCardListModel[]>([]);
    this.getAllDescriptors();
   }

   public get listDescriptors():Observable<MemoryCardListModel[]>{
      return this._listsDecriptors.asObservable();
   }

  getTestList():Observable<MemoryCardListModel>{
    return this.httpClient.get<MemoryCardListModel>(environment.apiUrl+"/lists/test",{
      headers:new HttpHeaders({
        "Access-Control-Allow-Origin":"http://localhost:8080",
        "Access-Control-Allow-Methods": "GET",
        "Access-Control-Allow-Headers":"Origin, X-Requested-With, Content-Type, Accept"
      })
    });
  }

  createList(memoryCardList:MemoryCardListModel){
    this.httpClient.post<MemoryCardListModel>(environment.apiUrl+"/lists"+(memoryCardList.name?"?name="+memoryCardList.name:""),{}).subscribe(x=>{this.getAllDescriptors()});
  }

  getAllDescriptors(){
    this.httpClient.get<MemoryCardListModel[]>(environment.apiUrl+"/lists").subscribe(
      x=>this._listsDecriptors.next(x)
    );
  }

  deleteList(memoryCardList:MemoryCardListModel){
    this.httpClient.delete<never>(environment.apiUrl+"/lists/"+memoryCardList.id).subscribe(
      x=>this.getAllDescriptors()
    );
  }

  getListById(id:number):MemoryCardListModel{
      for(let i=0;i<this._listsDecriptors.value.length;i++){
        if(this._listsDecriptors.value[i].id==id)return this._listsDecriptors.value[i];
      }
      return null;
  }

  createCard(quizzId:number):Observable<MemoryCardModel>{
    console.log(quizzId);
    return this.httpClient.post<MemoryCardModel>(environment.apiUrl+"/lists/"+quizzId+"/cards",{},{headers:{
      "Content-type":"application/json"
    }});
  }
}
