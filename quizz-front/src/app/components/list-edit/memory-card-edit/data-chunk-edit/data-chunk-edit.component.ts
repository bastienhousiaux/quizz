import { Component, OnInit, Input } from '@angular/core';
import { DataChunkModel } from 'src/app/models/DataChunkModel';

@Component({
  selector: 'app-data-chunk-edit',
  templateUrl: './data-chunk-edit.component.html',
  styleUrls: ['./data-chunk-edit.component.scss']
})
export class DataChunkEditComponent implements OnInit {
  @Input() dataChunk:DataChunkModel;

  constructor() { }

  ngOnInit(): void {
  }

  onChange(){
    
  }
}
