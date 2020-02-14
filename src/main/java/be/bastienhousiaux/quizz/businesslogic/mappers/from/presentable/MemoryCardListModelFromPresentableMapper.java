package be.bastienhousiaux.quizz.businesslogic.mappers.from.presentable;

import be.bastienhousiaux.quizz.businesslogic.mappers.from.AbstractMemoryCardListModelFromMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MemoryCardListModelFromPresentableMapper extends AbstractMemoryCardListModelFromMapper<MemoryCardListPresentable> {
    @Autowired
    private MemoryCardModelFromPresentableMapper memoryCardMapper;

    @Override
    public MemoryCardListModel map(MemoryCardListPresentable toMap) {
        if(toMap==null)return null;
        MemoryCardListModel memoryCardListModel=new MemoryCardListModel();
        memoryCardListModel.setId(toMap.getId());
        memoryCardListModel.setName(toMap.getName());
        memoryCardListModel.setCards(
                toMap.getCards().stream().map(memoryCardMapper::map).collect(Collectors.toList())
        );
        return memoryCardListModel;
    }
}
