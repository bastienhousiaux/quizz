package be.bastienhousiaux.quizz.dal.mappers.to.model;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.to.AbstractMemoryCardEntityToMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryCardEntityToModelMapper extends AbstractMemoryCardEntityToMapper<MemoryCardModel> {

    @Autowired
    private TypedDataEntityToModelMapper typedDataEntityMapper;

    @Override
    public MemoryCardModel map(MemoryCardEntity toMap) {
        MemoryCardModel memoryCardModel=new MemoryCardModel();
        if(toMap.getId()!=null)
            memoryCardModel.setId(toMap.getId());

        memoryCardModel.setRecto(
                mapDatas(
                        toMap.getRecto()
                )
        );

        memoryCardModel.setVerso(
                mapDatas(
                        toMap.getVerso()
                )
        );

        return memoryCardModel;
    }

    public List<TypedDataModel> mapDatas(List<TypedDataEntity> entityFace){
        List<TypedDataModel> modelFace=new ArrayList<>();

        entityFace.forEach(typedDataEntity -> {
            modelFace.add(
                    typedDataEntityMapper.map(typedDataEntity)
            );
        });

        return modelFace;
    }


}
