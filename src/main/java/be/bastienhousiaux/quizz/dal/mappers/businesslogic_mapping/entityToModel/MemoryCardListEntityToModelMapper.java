package be.bastienhousiaux.quizz.dal.mappers.businesslogic_mapping.entityToModel;

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
public class MemoryCardListEntityToModelMapper extends AbstractMemoryCardListMapper<MemoryCardListModel> {

    @Autowired
    private MemoryCardEntityToModelMapper memoryCardEntityMapper;

    @Override
    public MemoryCardListModel map(MemoryCardListEntity toMap) {
        MemoryCardListModel memoryCardListModel=new MemoryCardListModel();
        if(toMap.getId()!=null)
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
}

