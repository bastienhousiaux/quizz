import { Component, OnInit, Input } from '@angular/core';
import { MemoryCardModel } from 'src/app/models/MemoryCardModel';

@Component({
  selector: 'app-card-play',
  templateUrl: './card-play.component.html',
  styleUrls: ['./card-play.component.scss']
})
export class CardPlayComponent implements OnInit {

  @Input() memoryCard:MemoryCardModel;

  flipped:boolean=false;

  constructor() { }

  ngOnInit(): void {
  }

}
