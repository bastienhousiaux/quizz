package be.bastienhousiaux.quizz.businesslogic.mappers.routers_mapping.modelToPresentation;

import be.bastienhousiaux.quizz.businesslogic.mappers.AbstractTypedDataModelMapper;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import org.springframework.stereotype.Service;

@Service
public class TypedDataModelToPresentationMapper extends AbstractTypedDataModelMapper<DataChunkPresentable> {
    @Override
    public DataChunkPresentable map(TypedDataModel toMap) {
        DataChunkPresentable dataChunkPresentable=new DataChunkPresentable();
        dataChunkPresentable.setData(toMap.getData());
        dataChunkPresentable.setType(toMap.getType().getTypeName());
        dataChunkPresentable.setId(toMap.getId());
        return dataChunkPresentable;
    }
}
