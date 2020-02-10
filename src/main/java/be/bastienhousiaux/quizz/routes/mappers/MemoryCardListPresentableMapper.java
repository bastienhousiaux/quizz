package be.bastienhousiaux.quizz.routes.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryCardListPresentableMapper implements Mapper<MemoryCardListPresentable, MemoryCardListModel> {

    @Autowired
    private MemoryCardPresentableMapper memoryCardPresentableMapper;

    @Override
    public MemoryCardListPresentable toSource(MemoryCardListModel memoryCardListModel) {
        MemoryCardListPresentable memoryCardListPresentable=new MemoryCardListPresentable();
        memoryCardListPresentable.setId(memoryCardListModel.getId());
        memoryCardListPresentable.setName(memoryCardListModel.getName());

        memoryCardListPresentable.setCards(
                cardsToSource(
                        memoryCardListModel.getCards()
                )
        );

        return memoryCardListPresentable;
    }

    public List<MemoryCardPresentable> cardsToSource(List<MemoryCardModel> memoryCardModels){
        List<MemoryCardPresentable> memoryCardPresentables=new ArrayList<>();

        memoryCardModels.forEach(
                memoryCardModel -> {
                    memoryCardPresentables.add(
                        memoryCardPresentableMapper.toSource(memoryCardModel)
                    );
                }
        );

        return memoryCardPresentables;
    }

    @Override
    public MemoryCardListModel toDistant(MemoryCardListPresentable memoryCardListPresentable) {

        MemoryCardListModel memoryCardListModel=new MemoryCardListModel();

        memoryCardListModel.setId(memoryCardListModel.getId());
        memoryCardListModel.setName(memoryCardListPresentable.getName());



        return memoryCardListModel;
    }

    public List<MemoryCardModel> cardsToDistant(List<MemoryCardPresentable> memoryCardPresentables){
        List<MemoryCardModel> memoryCardModels=new ArrayList<>();

        memoryCardPresentables.forEach(
                memoryCardPresentable -> {
                    memoryCardModels.add(
                            memoryCardPresentableMapper.toDistant(memoryCardPresentable)
                    );
                }
        );

        return memoryCardModels;
    }
}
