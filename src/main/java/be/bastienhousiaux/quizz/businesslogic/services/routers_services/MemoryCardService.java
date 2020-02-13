package be.bastienhousiaux.quizz.businesslogic.services.routers_services;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable.MemoryCardModelToPresentableMapper;
import be.bastienhousiaux.quizz.businesslogic.services.AbstractMemoryCardMappableService;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.MemoryCardMappableDAO;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardService extends AbstractMemoryCardMappableService<MemoryCardPresentable> {
    @Autowired
    public MemoryCardService(MemoryCardModelToPresentableMapper mapper, MemoryCardMappableDAO dao) {
        super(mapper, dao);
    }
}
