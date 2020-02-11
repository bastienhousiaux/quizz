package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.MemoryCardMappableDAO;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AbstractMemoryCardMappableService<OutType> extends AbstractMappableService<MemoryCardModel,OutType> {
    public AbstractMemoryCardMappableService(Mapper<MemoryCardModel, OutType> mapper, MemoryCardMappableDAO dao) {
        super(mapper, dao);
    }
}
