import { Component, OnInit, Input } from '@angular/core';
import { MemoryCardListModel } from 'src/app/models/MemoryCardListModel';
import { RouterLink, RouterLinkActive, ActivatedRoute, Router } from '@angular/router';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';

@Component({
  selector: 'app-list-edit',
  templateUrl: './list-edit.component.html',
  styleUrls: ['./list-edit.component.scss']
})
export class ListEditComponent implements OnInit {
  
  list:MemoryCardListModel;

  constructor(private route:ActivatedRoute,
    private memoryCardListService:MemoryCardListService,
    private router:Router) { }

  ngOnInit(): void {
    this.list=this.memoryCardListService.getListById(parseInt(this.route.snapshot.paramMap.get("id")));
    console.log(this.list);
  }

  goBack(){
    this.router.navigateByUrl("/lists");
  }

}
