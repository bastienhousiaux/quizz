package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable.MemoryCardModelToPresentableMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.MemoryCardListMappableDAO;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractMemoryCardListMappableService<OutType> extends AbstractMappableService<MemoryCardListModel,OutType> {
    @Autowired
    private MemoryCardModelToPresentableMapper memoryCardModelToPresentableMapper;

    public AbstractMemoryCardListMappableService(Mapper<MemoryCardListModel, OutType> mapper, MemoryCardListMappableDAO dao) {
        super(mapper, dao);
    }

    public MemoryCardListMappableDAO getDao(){
        return (MemoryCardListMappableDAO)super.getDao();
    }


    public MemoryCardPresentable addCardToQuizz(long quizzId){
        return memoryCardModelToPresentableMapper.map((getDao()).createCardInQuizz(quizzId));
    }

//    public void deleteCardFromQuizz(long quizzId,long cardId){
//        this.getDao().
//    }

}
