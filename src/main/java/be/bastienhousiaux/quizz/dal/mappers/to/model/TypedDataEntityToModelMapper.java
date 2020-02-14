package be.bastienhousiaux.quizz.dal.mappers.to.model;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.to.AbstractTypedDataEntityToMapper;
import org.springframework.stereotype.Service;

@Service
public class TypedDataEntityToModelMapper extends AbstractTypedDataEntityToMapper<TypedDataModel> {
    @Override
    public TypedDataModel map(TypedDataEntity toMap) {
        if(toMap==null)return null;
        TypedDataModel typedDataModel=new TypedDataModel();
        typedDataModel.setData(toMap.getData());
        typedDataModel.setType(toMap.getType());
        typedDataModel.setId(toMap.getId());
        return typedDataModel;
    }
}
