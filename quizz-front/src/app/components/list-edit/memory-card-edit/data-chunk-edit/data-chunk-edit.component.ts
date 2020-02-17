import { Component, OnInit, Input } from '@angular/core';
import { DataChunkModel } from 'src/app/models/DataChunkModel';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';

@Component({
  selector: 'app-data-chunk-edit',
  templateUrl: './data-chunk-edit.component.html',
  styleUrls: ['./data-chunk-edit.component.scss']
})
export class DataChunkEditComponent implements OnInit {
  @Input() dataChunk:DataChunkModel;

  constructor(
    private memoryCardService:MemoryCardListService
  ) { }

  ngOnInit(): void {
  }

  onChange(){
    
  }

  

  
}
