import { MemoryCardModel } from './MemoryCardModel';

export interface MemoryCardListModel{
    id?:number;
    name:string;
    cards:MemoryCardModel[];
}