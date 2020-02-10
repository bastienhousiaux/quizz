package be.bastienhousiaux.quizz.dal.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryCardEntityMapper implements Mapper<MemoryCardEntity, MemoryCardModel> {

    @Autowired
    private TypedDataEntityMapper typedDataEntityMapper;

    @Override
    public MemoryCardEntity toSource(MemoryCardModel memoryCardModel) {
        MemoryCardEntity memoryCardEntity=new MemoryCardEntity();
        memoryCardEntity.setId(memoryCardModel.getId());

        memoryCardEntity.setRecto(
                this.memoryCardFaceToSource(
                        memoryCardModel.getRecto()
                )
        );

        memoryCardEntity.setVerso(
                this.memoryCardFaceToSource(
                        memoryCardModel.getVerso()
                )
        );

        return memoryCardEntity;
    }

    public List<TypedDataEntity> memoryCardFaceToSource(List<TypedDataModel> modelFace){
        List<TypedDataEntity> entityFace=new ArrayList<>();
        modelFace.forEach(typedDataModel -> {
            entityFace.add(typedDataEntityMapper.toSource(typedDataModel));
        });
        return entityFace;
    }

    @Override
    public MemoryCardModel toDistant(MemoryCardEntity memoryCardEntity) {
        MemoryCardModel memoryCardModel=new MemoryCardModel();
        memoryCardModel.setId(memoryCardEntity.getId());

        memoryCardModel.setRecto(
                memoryCardFaceToDistant(
                        memoryCardEntity.getRecto()
                )
        );

        memoryCardModel.setVerso(
                memoryCardFaceToDistant(
                        memoryCardEntity.getVerso()
                )
        );

        return memoryCardModel;
    }

    public List<TypedDataModel> memoryCardFaceToDistant(List<TypedDataEntity> entityFace){
        List<TypedDataModel> modelFace=new ArrayList<>();

        entityFace.forEach(typedDataEntity -> {
            modelFace.add(
                    typedDataEntityMapper.toDistant(typedDataEntity)
            );
        });

        return modelFace;
    }
}
