import { DataChunkModel } from './DataChunkModel';

export interface MemoryCardModel{
    id?:number;
    recto,verso:DataChunkModel[];
}