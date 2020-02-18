import { Component, OnInit, Input } from '@angular/core';
import { MemoryCardModel } from 'src/app/models/MemoryCardModel';
import { MemoryCardListService } from 'src/app/services/memory-card-list.service';

@Component({
  selector: 'app-memory-card-edit',
  templateUrl: './memory-card-edit.component.html',
  styleUrls: ['./memory-card-edit.component.scss']
})
export class MemoryCardEditComponent implements OnInit {
  @Input() memoryCard:MemoryCardModel;
  constructor(
    private memoryCardListService:MemoryCardListService
  ) { }

  ngOnInit( ): void {
  }

  addDataToRecto(cardId:number){
      this.memoryCardListService.addDataToRecto(cardId).subscribe(data=>{
        this.memoryCard.recto.push(data);
      });
  }

  addDataToVerso(cardId:number){
    this.memoryCardListService.addDataToVerso(cardId).subscribe(data=>{
      this.memoryCard.verso.push(data);
    })
  }

  deleteDataChunkFromRecto(idCard:number,idChunk:number){
    this.memoryCardListService.deleteDataFromRecto(idCard,idChunk).subscribe(
      ()=>{
        let index=this.memoryCard.recto.findIndex(x=>x.id==idChunk);
        if(index>=0)this.memoryCard.recto.splice(index,1);
      }
    );
  }

  deleteDataChunkFromVerso(idCard:number,idChunk:number){
    this.memoryCardListService.deleteDataFromVerso(idCard,idChunk).subscribe(
      ()=>{
        let index=this.memoryCard.verso.findIndex(x=>x.id==idChunk);
        if(index)this.memoryCard.verso.splice(index,1);
      }
    );
  }

}
