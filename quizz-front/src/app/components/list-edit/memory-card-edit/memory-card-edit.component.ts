import { Component, OnInit, Input } from '@angular/core';
import { MemoryCardModel } from 'src/app/models/MemoryCardModel';

@Component({
  selector: 'app-memory-card-edit',
  templateUrl: './memory-card-edit.component.html',
  styleUrls: ['./memory-card-edit.component.scss']
})
export class MemoryCardEditComponent implements OnInit {
  @Input() memoryCard:MemoryCardModel;
  constructor() { }

  ngOnInit(): void {
  }

}
