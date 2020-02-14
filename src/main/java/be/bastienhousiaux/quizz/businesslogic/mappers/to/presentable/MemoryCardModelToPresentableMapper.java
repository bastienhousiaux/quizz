package be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.AbstractMemoryCardModelToMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardModelToPresentableMapper extends AbstractMemoryCardModelToMapper<MemoryCardPresentable> {

    @Autowired
    private TypedDataModelToPresentableMapper typedDataMapper;

    @Override
    public MemoryCardPresentable map(MemoryCardModel toMap) {
        if(toMap==null)return null;
        MemoryCardPresentable memoryCardPresentable=new MemoryCardPresentable();
        memoryCardPresentable.setId(toMap.getId());
        memoryCardPresentable.setRecto(
            toMap.getRecto().stream().map(typedDataModel -> typedDataMapper.map(typedDataModel)).collect(Collectors.toList())
        );
        memoryCardPresentable.setVerso(
                toMap.getVerso().stream().map(typedDataModel -> typedDataMapper.map(typedDataModel)).collect(Collectors.toList())
        );
        return memoryCardPresentable;
    }

}
