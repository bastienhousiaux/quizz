package be.bastienhousiaux.quizz.dal.mappers.from.model;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.mappers.from.AbstractMemoryCardEntityFromMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardEntityFromModelMapper extends AbstractMemoryCardEntityFromMapper<MemoryCardModel> {

    @Autowired
    private TypedDataEntityFromModelMapper typeDataMapper;

    @Override
    public MemoryCardEntity map(MemoryCardModel toMap) {
        if(toMap==null)return null;
        MemoryCardEntity memoryCardEntity=new MemoryCardEntity();
        memoryCardEntity.setId(toMap.getId());
        memoryCardEntity.setRecto(
                toMap.getRecto().stream().map(
                            typeDataMapper::map
                ).collect(Collectors.toList())
        );
        memoryCardEntity.setVerso(
                toMap.getVerso().stream().map(
                        typeDataMapper::map
                ).collect(Collectors.toList())
        );
        return memoryCardEntity;
    }
}
