package be.bastienhousiaux.quizz.dal.mappers.from.model;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.from.AbstractTypedDataEntityFromMapper;
import org.springframework.stereotype.Service;

@Service
public class TypedDataEntityFromModelMapper extends AbstractTypedDataEntityFromMapper<TypedDataModel> {
    @Override
    public TypedDataEntity map(TypedDataModel toMap) {
        TypedDataEntity typedDataEntity=new TypedDataEntity();
        typedDataEntity.setId(toMap.getId());
        typedDataEntity.setData(toMap.getData());
        typedDataEntity.setType(toMap.getType());
        return typedDataEntity;
    }
}
