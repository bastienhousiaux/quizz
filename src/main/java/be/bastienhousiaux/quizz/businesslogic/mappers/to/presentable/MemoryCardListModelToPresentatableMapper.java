package be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.AbstractMemoryCardListModelToMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardListModelToPresentatableMapper extends AbstractMemoryCardListModelToMapper<MemoryCardListPresentable> {
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
