package be.bastienhousiaux.quizz.businesslogic.services.routers_services;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable.MemoryCardListModelToPresentatableMapper;
import be.bastienhousiaux.quizz.businesslogic.services.AbstractMemoryCardListMappableService;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.MemoryCardListMappableDAO;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardListService extends AbstractMemoryCardListMappableService<MemoryCardListPresentable> {
    @Autowired
    public MemoryCardListService(MemoryCardListModelToPresentatableMapper mapper, MemoryCardListMappableDAO dao) {
        super(mapper, dao);
    }
}
