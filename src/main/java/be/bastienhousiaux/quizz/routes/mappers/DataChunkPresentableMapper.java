package be.bastienhousiaux.quizz.routes.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.stereotype.Service;

//@Service
//public class DataChunkPresentableMapper implements Mapper<DataChunkPresentable, TypedDataModel> {
//
//    @Override
//    public DataChunkPresentable toSource(TypedDataModel typedDataModel) {
//        DataChunkPresentable dataChunkPresentable=new DataChunkPresentable();
//        dataChunkPresentable.setData(typedDataModel.getData());
//        dataChunkPresentable.setType(typedDataModel.getType().getTypeName());
//        dataChunkPresentable.setId(typedDataModel.getId());
//        return dataChunkPresentable;
//    }
//
//    @Override
//    public TypedDataModel toDistant(DataChunkPresentable dataChunkPresentable) {
//        TypedDataModel typedDataModel=new TypedDataModel();
//        typedDataModel.setId(dataChunkPresentable.getId());
//        typedDataModel.setType(DataTypeEnum.valueOf(dataChunkPresentable.getType()));
//        typedDataModel.setData(dataChunkPresentable.getData());
//        return typedDataModel;
//    }
//}
