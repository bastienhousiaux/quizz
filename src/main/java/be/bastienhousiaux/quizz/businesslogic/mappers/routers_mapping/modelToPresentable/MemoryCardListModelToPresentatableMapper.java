package be.bastienhousiaux.quizz.businesslogic.mappers.routers_mapping.modelToPresentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.AbstractMemoryCardListModelMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemoryCardListModelToPresentatableMapper extends AbstractMemoryCardListModelMapper<MemoryCardListPresentable> {
    @Autowired
    private MemoryCardModelToPresentableMapper memoryCardMapper;

    @Override
    public MemoryCardListPresentable map(MemoryCardListModel toMap) {
        MemoryCardListPresentable memoryCardListPresentable=new MemoryCardListPresentable();
        memoryCardListPresentable.setId(toMap.getId());
        memoryCardListPresentable.setName(toMap.getName());
        memoryCardListPresentable.setCards(
            toMap.getCards().stream().map(
                    memoryCardMapper::map
            ).collect(Collectors.toList())
        );
        return memoryCardListPresentable;
    }
}
