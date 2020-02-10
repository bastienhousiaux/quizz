import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { MemoryCardListModel } from '../models/MemoryCardListModel';
import { Observable, BehaviorSubject } from 'rxjs';
import { environment } from 'src/environments/environment';
import { MemoryCardListDescriptorModel } from '../models/MemoryCardListDescriptorModel';

@Injectable({
  providedIn: 'root'
})
export class MemoryCardListService {

  private _listsDecriptors:BehaviorSubject<MemoryCardListDescriptorModel[]>;


  constructor(public httpClient:HttpClient) {
    this._listsDecriptors=new BehaviorSubject<MemoryCardListDescriptorModel[]>([]);
    this.getAllDescriptors();
   }

   public get listDescriptors():Observable<MemoryCardListDescriptorModel[]>{
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
    this.httpClient.post<MemoryCardListModel>(environment.apiUrl+"/lists",{
      "name":memoryCardList.name
    }).subscribe(x=>{this.getAllDescriptors()});
  }

  getAllDescriptors(){
    this.httpClient.get<MemoryCardListDescriptorModel[]>(environment.apiUrl+"/lists").subscribe(
      x=>this._listsDecriptors.next(x)
    );
  }
}
