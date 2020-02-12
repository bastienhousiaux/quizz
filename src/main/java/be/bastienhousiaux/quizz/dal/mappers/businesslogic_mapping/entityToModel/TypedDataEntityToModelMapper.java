package be.bastienhousiaux.quizz.dal.mappers.businesslogic_mapping.entityToModel;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.AbstractTypedDataEntityMapper;
import org.springframework.stereotype.Service;

@Service
public class TypedDataEntityToModelMapper extends AbstractTypedDataEntityMapper<TypedDataModel> {
    @Override
    public TypedDataModel map(TypedDataEntity toMap) {
        TypedDataModel typedDataModel=new TypedDataModel();
        typedDataModel.setData(toMap.getData());
        typedDataModel.setType(toMap.getType());
        typedDataModel.setId(toMap.getId());
        return typedDataModel;
    }
}
