package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable.TypedDataModelToPresentableMapper;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.MemoryCardMappableDAO;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import be.bastienhousiaux.quizz.routes.models.MemoryCardPresentable;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
public abstract class AbstractMemoryCardMappableService<OutType> extends AbstractMappableService<MemoryCardModel,OutType> {
    @Autowired
    private TypedDataModelToPresentableMapper typedDataModelToPresentableMapper;

    public AbstractMemoryCardMappableService(Mapper<MemoryCardModel, OutType> mapper, MemoryCardMappableDAO dao) {
        super(mapper, dao);
    }

    public MemoryCardMappableDAO getDao(){
        return (MemoryCardMappableDAO)super.getDao();
    }

    public DataChunkPresentable createDataInCard(long idCard, String face){
        switch(face){
            case "recto":
                return typedDataModelToPresentableMapper.map(
                        this.getDao().createDataOnRecto(idCard)
                );
            case "verso":
                return typedDataModelToPresentableMapper.map(
                        this.getDao().createDataOnVerso(idCard)
                );
            default:
                return null;
        }
    }
}
