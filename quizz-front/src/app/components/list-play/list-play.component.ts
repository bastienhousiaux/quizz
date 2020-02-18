import { Component, OnInit } from '@angular/core';
import { MemoryCardListModel } from 'src/app/models/MemoryCardListModel';
import { ActivatedRoute, Router } from '@angular/router';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';

@Component({
  selector: 'app-list-play',
  templateUrl: './list-play.component.html',
  styleUrls: ['./list-play.component.scss']
})
export class ListPlayComponent implements OnInit {



  list:MemoryCardListModel;

  constructor(private route:ActivatedRoute,
    private memoryCardListService:MemoryCardListService,
    private router:Router) {}

  ngOnInit(): void {
    this.list=this.memoryCardListService.getListById(parseInt(this.route.snapshot.paramMap.get("id"))); 
  }

  goBack(){
    this.router.navigateByUrl("/lists");
  }

}
