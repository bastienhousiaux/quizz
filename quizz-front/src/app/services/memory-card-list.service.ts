import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { MemoryCardListModel } from '../models/MemoryCardListModel';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MemoryCardListService {

  constructor(public httpClient:HttpClient) { }

  getTestList():Observable<MemoryCardListModel>{
    return this.httpClient.get<MemoryCardListModel>(environment.apiUrl+"/lists/test",{
      headers:new HttpHeaders({
        "Access-Control-Allow-Origin":"http://localhost:8080",
        "Access-Control-Allow-Methods": "GET",
        "Access-Control-Allow-Headers":"Origin, X-Requested-With, Content-Type, Accept"
      })
    });
  }
}
