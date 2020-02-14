package be.bastienhousiaux.quizz.businesslogic.mappers.from.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.from.AbstractTypedDataModelFromMapper;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import org.springframework.stereotype.Service;

@Service
public class TypedDataModelFromPrensentableMapper extends AbstractTypedDataModelFromMapper<DataChunkPresentable> {
    @Override
    public TypedDataModel map(DataChunkPresentable toMap) {
        if(toMap==null)return null;
        TypedDataModel typedDataModel=new TypedDataModel();
        typedDataModel.setId(toMap.getId());
        typedDataModel.setData(toMap.getData());
        typedDataModel.setType(DataTypeEnum.valueOf(toMap.getType()));
        return typedDataModel;
    }
}
