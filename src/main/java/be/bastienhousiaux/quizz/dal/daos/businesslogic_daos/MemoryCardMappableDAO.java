package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.mappers.businesslogic_mapping.MemoryCardEntityMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardMappableDAO extends AbstractMappableDAO<MemoryCardEntity, MemoryCardModel> {
    @Autowired
    public MemoryCardMappableDAO(MemoryCardEntityMapper mapper, MemoryCardRepository repository) {
        super(mapper, repository);
    }

    @Override
    public MemoryCardEntity returnsNewEntity() {
        return new MemoryCardEntity();
    }
}
