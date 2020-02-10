import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MemoryCardDisplayComponent } from './memory-card-display.component';

describe('MemoryCardDisplayComponent', () => {
  let component: MemoryCardDisplayComponent;
  let fixture: ComponentFixture<MemoryCardDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MemoryCardDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MemoryCardDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
