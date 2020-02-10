import { Component, OnInit } from '@angular/core';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';
import { MemoryCardListModel } from 'src/app/models/MemoryCardListModel';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MemoryCardListDescriptorModel } from 'src/app/models/MemoryCardListDescriptorModel';

@Component({
  selector: 'app-list-display',
  templateUrl: './list-display.component.html',
  styleUrls: ['./list-display.component.scss']
})
export class ListDisplayComponent implements OnInit {

  lists:MemoryCardListDescriptorModel[];
  newList:FormGroup;

  constructor(private memoryCardListService:MemoryCardListService) { }

  ngOnInit(): void {
    this.newList=new FormGroup({
      "name":new FormControl(null,Validators.compose([
        Validators.required,
        Validators.minLength(2)
      ]))
    })
    this.lists=[];
    this.memoryCardListService.listDescriptors.subscribe(
      data=>{
        this.lists=data;
      }
    )
  }

  createList(){
    this.memoryCardListService.createList(this.newList.value);
  }

}
