package be.bastienhousiaux.quizz.dal.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.stereotype.Service;

@Service
public class TypedDataEntityMapper implements Mapper<TypedDataEntity, TypedDataModel> {
    @Override
    public TypedDataEntity toSource(TypedDataModel typedDataModel) {
        TypedDataEntity typedDataEntity=new TypedDataEntity();
        typedDataEntity.setData(typedDataModel.getData());
        typedDataEntity.setType(typedDataModel.getType());
        typedDataEntity.setId(typedDataModel.getId());
        return typedDataEntity;
    }

    @Override
    public TypedDataModel toDistant(TypedDataEntity typedDataEntity) {
        TypedDataModel typedDataModel=new TypedDataModel();
        typedDataModel.setData(typedDataEntity.getData());
        typedDataModel.setType(typedDataEntity.getType());
        typedDataModel.setId(typedDataEntity.getId());
        return typedDataModel;
    }
}
