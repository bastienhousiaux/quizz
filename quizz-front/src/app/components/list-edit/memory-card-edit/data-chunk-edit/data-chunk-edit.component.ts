import { Component, OnInit, Input } from '@angular/core';
import { DataChunkModel } from 'src/app/models/DataChunkModel';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-data-chunk-edit',
  templateUrl: './data-chunk-edit.component.html',
  styleUrls: ['./data-chunk-edit.component.scss']
})
export class DataChunkEditComponent implements OnInit {
  @Input() dataChunk:DataChunkModel;

  // dataChunkEditForm:FormGroup;

  constructor(
    private memoryCardService:MemoryCardListService
  ) { }

  ngOnInit(): void {
    // this.dataChunkEditForm=new FormGroup({
    //   "dataChunkData":new FormControl(this.dataChunk.data,Validators.compose([]));
    // })
  }

  onChange(evt){
    this.memoryCardService.editDataContent(this.dataChunk.id,evt.srcElement.value).subscribe();
  }

  onTypeChange(type){
    this.memoryCardService.editDataType(this.dataChunk.id,type).subscribe();
  }
  
}
