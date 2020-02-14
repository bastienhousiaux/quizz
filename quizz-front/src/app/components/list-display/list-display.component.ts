import { Component, OnInit } from '@angular/core';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MemoryCardListModel } from 'src/app/models/MemoryCardListModel';
import { Router } from '@angular/router';
@Component({
  selector: 'app-list-display',
  templateUrl: './list-display.component.html',
  styleUrls: ['./list-display.component.scss']
})
export class ListDisplayComponent implements OnInit {

  lists:MemoryCardListModel[];
  newList:FormGroup;

  constructor(private memoryCardListService:MemoryCardListService,private router:Router) { }

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
    this.memoryCardListService.getAllDescriptors();
  }

  createList(){
    this.memoryCardListService.createList(this.newList.value);
  }

  deleteList(descriptor:MemoryCardListModel){
    this.memoryCardListService.deleteList(descriptor);
  }

  editQuizz(quizz:MemoryCardListModel){
    this.router.navigateByUrl("/lists/"+quizz.id+"/edit");
  }

}
