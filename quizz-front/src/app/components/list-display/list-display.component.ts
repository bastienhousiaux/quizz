import { Component, OnInit } from '@angular/core';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';
import { MemoryCardListModel } from 'src/app/models/MemoryCardListModel';

@Component({
  selector: 'app-list-display',
  templateUrl: './list-display.component.html',
  styleUrls: ['./list-display.component.scss']
})
export class ListDisplayComponent implements OnInit {

  lists:MemoryCardListModel[];

  constructor(private memoryCardListService:MemoryCardListService) { }

  ngOnInit(): void {
    this.lists=[];
    this.memoryCardListService.getTestList().subscribe(
      data=>{
        this.lists.push(data);
      }
    )
  }

}
