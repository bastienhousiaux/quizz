package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;

public class AbstractMemoryCardListMappableService<OutType> extends AbstractMappableService<MemoryCardListModel,OutType> {
    public AbstractMemoryCardListMappableService(Mapper<MemoryCardListModel, OutType> mapper, AbstractMappableDAO<?, MemoryCardListModel> dao) {
        super(mapper, dao);
    }

    //todo : specific methods should be here but typing between service and daos are not designed the same
}
