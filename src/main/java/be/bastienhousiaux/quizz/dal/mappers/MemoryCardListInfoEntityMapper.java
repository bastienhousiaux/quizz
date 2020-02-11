package be.bastienhousiaux.quizz.dal.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListInfoModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardListInfoEntityMapper implements Mapper<MemoryCardListEntity, MemoryCardListInfoModel> {
    @Override
    public MemoryCardListInfoModel map(MemoryCardListEntity toMap) {
        return null;
    }
//    @Override
//    public MemoryCardListEntity toSource(MemoryCardListInfoModel memoryCardListInfoModel) {
//        MemoryCardListEntity memoryCardListInfoEntity=new MemoryCardListEntity();
//        memoryCardListInfoEntity.setId(memoryCardListInfoModel.getId());
//        memoryCardListInfoEntity.setName(memoryCardListInfoModel.getName());
//        return memoryCardListInfoEntity;
//    }
//
//    @Override
//    public MemoryCardListInfoModel toDistant(MemoryCardListEntity memoryCardListInfoEntity) {
//        MemoryCardListInfoModel memoryCardListInfoModel=new MemoryCardListInfoModel();
//        memoryCardListInfoModel.setId(memoryCardListInfoEntity.getId());
//        memoryCardListInfoModel.setName(memoryCardListInfoEntity.getName());
//        return memoryCardListInfoModel;
//    }
}
