package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.businesslogic_mapping.entityToModel.MemoryCardListEntityToModelMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardListRepository;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardListMappableDAO extends AbstractMappableDAO<MemoryCardListEntity, MemoryCardListModel> {
    public MemoryCardListMappableDAO(MemoryCardListEntityToModelMapper mapper, MemoryCardListRepository repository) {
        super(mapper, repository);
    }

    @Override
    public MemoryCardListEntity returnsNewEntity() {
        return new MemoryCardListEntity();
    }
}
