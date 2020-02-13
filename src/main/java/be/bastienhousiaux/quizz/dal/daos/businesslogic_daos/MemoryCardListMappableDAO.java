package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.from.model.MemoryCardEntityFromModelMapper;
import be.bastienhousiaux.quizz.dal.mappers.to.model.MemoryCardEntityToModelMapper;
import be.bastienhousiaux.quizz.dal.mappers.to.model.MemoryCardListEntityToModelMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardListRepository;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardListMappableDAO extends AbstractMappableDAO<MemoryCardListEntity, MemoryCardListModel> {
    @Autowired
    private MemoryCardRepository memoryCardRepository;
    @Autowired
    private MemoryCardEntityToModelMapper memoryCardMapper;

    public MemoryCardListMappableDAO(MemoryCardListEntityToModelMapper mapper, MemoryCardListRepository repository) {
        super(mapper, repository);
    }

    @Override
    public MemoryCardListEntity returnsNewEntity() {
        return new MemoryCardListEntity();
    }

    public MemoryCardModel createCardInQuizz(long idQuizz){
        MemoryCardListEntity memoryCardListEntity=this.getRepository().findById(idQuizz).orElse(null);
        if(memoryCardListEntity!=null){
            MemoryCardEntity memoryCardEntity=memoryCardRepository.save(new MemoryCardEntity());
            memoryCardListEntity.getCards().add(memoryCardEntity);
            this.getRepository().save(memoryCardListEntity);
            return memoryCardMapper.map(memoryCardEntity);
        }
        return null;
    }
}
