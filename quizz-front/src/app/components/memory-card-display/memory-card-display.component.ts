import { Component, OnInit, Input } from '@angular/core';
import { MemoryCardModel } from 'src/app/models/MemoryCardModel';

@Component({
  selector: 'app-memory-card-display',
  templateUrl: './memory-card-display.component.html',
  styleUrls: ['./memory-card-display.component.scss']
})
export class MemoryCardDisplayComponent implements OnInit {

  @Input() memoryCard:MemoryCardModel;

  constructor() { }

  ngOnInit(): void {
  }

}
