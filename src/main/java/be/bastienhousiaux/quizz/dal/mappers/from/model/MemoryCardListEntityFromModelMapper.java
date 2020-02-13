package be.bastienhousiaux.quizz.dal.mappers.from.model;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.from.AbstractMemoryCardListEntityFromMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardListEntityFromModelMapper extends AbstractMemoryCardListEntityFromMapper<MemoryCardListModel> {
    @Autowired
    private MemoryCardEntityFromModelMapper memoryCardMapper;

    @Override
    public MemoryCardListEntity map(MemoryCardListModel toMap) {
        MemoryCardListEntity memoryCardListEntity=new MemoryCardListEntity();
        memoryCardListEntity.setId(toMap.getId());
        memoryCardListEntity.setName(toMap.getName());
        memoryCardListEntity.setCards(
                toMap.getCards().stream().map(
                        memoryCardMapper::map
                ).collect(Collectors.toList())
        );
        return memoryCardListEntity;
    }
}
