import { Component } from '@angular/core';

import {MemoryCardModel} from "./models/MemoryCardModel";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'quizz-front';
  memoryCard:MemoryCardModel={
    recto:[
      {data:"test",type:"text"},
      {data:"recto2",type:"text"}
    ],
    verso:[
      {data:"verso1",type:"text"}
    ]
  }
}
