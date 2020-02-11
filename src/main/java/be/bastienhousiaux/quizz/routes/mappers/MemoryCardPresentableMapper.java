//package be.bastienhousiaux.quizz.routes.mappers;
//
//import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
//import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
//import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
//import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
//import be.bastienhousiaux.quizz.utils.mapping.Mapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class MemoryCardPresentableMapper implements Mapper<MemoryCardPresentable, MemoryCardModel> {
//    @Autowired
//    private DataChunkPresentableMapper dataChunkPresentableMapper;
//
//    @Override
//    public MemoryCardPresentable toSource(MemoryCardModel memoryCardModel) {
//        MemoryCardPresentable memoryCardPresentable=new MemoryCardPresentable();
//
//        memoryCardPresentable.setId(memoryCardModel.getId());
//
//        memoryCardPresentable.setRecto(
//                memoryCardFaceToSource(
//                        memoryCardModel.getRecto()
//                )
//        );
//
//        memoryCardPresentable.setVerso(
//                memoryCardFaceToSource(
//                        memoryCardModel.getVerso()
//                )
//        );
//
//        return memoryCardPresentable;
//    }
//
//    public List<DataChunkPresentable> memoryCardFaceToSource(List<TypedDataModel> distantFace){
//        List<DataChunkPresentable> sourceFace=new ArrayList<>();
//
//        distantFace.forEach(
//                typedDataModel ->{
//                    sourceFace.add(
//                            dataChunkPresentableMapper.toSource(typedDataModel)
//                    );
//                }
//        );
//
//        return sourceFace;
//    }
//
//    @Override
//    public MemoryCardModel toDistant(MemoryCardPresentable memoryCardPresentable) {
//        MemoryCardModel memoryCardModel=new MemoryCardModel();
//
//        memoryCardModel.setId(memoryCardPresentable.getId());
//
//        memoryCardModel.setRecto(
//                memoryCardFaceToDistant(
//                        memoryCardPresentable.getRecto()
//                )
//        );
//
//        memoryCardModel.setVerso(
//                memoryCardFaceToDistant(
//                        memoryCardPresentable.getVerso()
//                )
//        );
//
//        return memoryCardModel;
//    }
//
//    public List<TypedDataModel> memoryCardFaceToDistant(List<DataChunkPresentable> sourceFace){
//        List<TypedDataModel> distantFace=new ArrayList<>();
//
//        sourceFace.forEach(
//                dataChunkPresentable -> {
//                    distantFace.add(
//                            dataChunkPresentableMapper.toDistant(dataChunkPresentable)
//                    );
//                }
//        );
//
//        return distantFace;
//    }
//}
