package be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.AbstractTypedDataModelToMapper;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import org.springframework.stereotype.Service;

@Service
public class TypedDataModelToPresentableMapper extends AbstractTypedDataModelToMapper<DataChunkPresentable> {
    @Override
    public DataChunkPresentable map(TypedDataModel toMap) {
        if(toMap==null)return null;
        DataChunkPresentable dataChunkPresentable=new DataChunkPresentable();
        dataChunkPresentable.setData(toMap.getData());
        dataChunkPresentable.setType(toMap.getType().getTypeName());
        dataChunkPresentable.setId(toMap.getId());
        return dataChunkPresentable;
    }
}
