package be.bastienhousiaux.quizz.dal.mappers.businesslogic_mapping;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.AbstractMemoryCardListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryCardListEntityMapper extends AbstractMemoryCardListMapper<MemoryCardListModel> {

    @Autowired
    private MemoryCardEntityMapper memoryCardEntityMapper;

    @Override
    public MemoryCardListModel map(MemoryCardListEntity toMap) {
        MemoryCardListModel memoryCardListModel=new MemoryCardListModel();

        memoryCardListModel.setId(toMap.getId());
        memoryCardListModel.setName(toMap.getName());

        memoryCardListModel.setCards(
                this.mapMemoryCardList(
                        toMap.getCards()
                )
        );
        return memoryCardListModel;
    }

    public List<MemoryCardModel> mapMemoryCardList(List<MemoryCardEntity> memoryCardEntities){
        List<MemoryCardModel> memoryCardModels=new ArrayList<>();

        memoryCardEntities.forEach(
                memoryCardEntity -> {
                    memoryCardModels.add(
                            memoryCardEntityMapper.map(memoryCardEntity)
                    );
                }
        );

        return memoryCardModels;
    }

//    @Override
//    public MemoryCardListEntity toSource(MemoryCardListModel memoryCardListModel) {
//        MemoryCardListEntity memoryCardListEntity=new MemoryCardListEntity();
//        memoryCardListEntity.setId(memoryCardListModel.getId());
//        memoryCardListEntity.setName(memoryCardListEntity.getName());
//
//        memoryCardListEntity.setCards(
//                this.memoryCardListToSource(
//                        memoryCardListModel.getCards()
//                )
//        );
//
//        return memoryCardListEntity;
//    }
//
//    public List<MemoryCardEntity> memoryCardListToSource(List<MemoryCardModel> memoryCardModels){
//        List<MemoryCardEntity> memoryCardEntities=new ArrayList<>();
//
//        memoryCardModels.forEach(
//            memoryCardModel -> {
//                memoryCardEntities.add(
//                        memoryCardEntityMapper.toSource(memoryCardModel)
//                );
//            }
//        );
//
//        return memoryCardEntities;
//    }
//
//    @Override
//    public MemoryCardListModel toDistant(MemoryCardListEntity memoryCardListEntity) {
//
//    }


}

