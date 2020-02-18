import { Component, OnInit, Input } from '@angular/core';
import { DataChunkModel } from 'src/app/models/DataChunkModel';

@Component({
  selector: 'app-data-chunk-play',
  templateUrl: './data-chunk-play.component.html',
  styleUrls: ['./data-chunk-play.component.scss']
})
export class DataChunkPlayComponent implements OnInit {

  @Input() dataChunk:DataChunkModel;

  constructor() { }

  ngOnInit(): void {
  }

}
