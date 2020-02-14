import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DataChunkEditComponent } from './data-chunk-edit.component';

describe('DataChunkEditComponent', () => {
  let component: DataChunkEditComponent;
  let fixture: ComponentFixture<DataChunkEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataChunkEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataChunkEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
