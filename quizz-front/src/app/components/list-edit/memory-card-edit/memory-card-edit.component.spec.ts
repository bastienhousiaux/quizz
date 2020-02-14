import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MemoryCardEditComponent } from './memory-card-edit.component';

describe('MemoryCardEditComponent', () => {
  let component: MemoryCardEditComponent;
  let fixture: ComponentFixture<MemoryCardEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MemoryCardEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MemoryCardEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
