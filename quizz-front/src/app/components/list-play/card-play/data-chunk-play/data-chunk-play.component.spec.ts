import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DataChunkPlayComponent } from './data-chunk-play.component';

describe('DataChunkPlayComponent', () => {
  let component: DataChunkPlayComponent;
  let fixture: ComponentFixture<DataChunkPlayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataChunkPlayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataChunkPlayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
