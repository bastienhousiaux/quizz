package be.bastienhousiaux.quizz.businesslogic.mappers.from.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.from.AbstractMemoryCardModelFromMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardModelFromPresentableMapper extends AbstractMemoryCardModelFromMapper<MemoryCardPresentable> {
    @Autowired
    private TypedDataModelFromPrensentableMapper typedDataMapper;

    @Override
    public MemoryCardModel map(MemoryCardPresentable toMap) {
        MemoryCardModel memoryCardModel=new MemoryCardModel();
        memoryCardModel.setId(toMap.getId());
        memoryCardModel.setRecto(
            toMap.getRecto().stream().map(typedDataMapper::map).collect(Collectors.toList())
        );
        memoryCardModel.setVerso(
                toMap.getVerso().stream().map(typedDataMapper::map).collect(Collectors.toList())
        );
        return memoryCardModel;
    }
}
