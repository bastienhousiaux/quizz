package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.to.model.MemoryCardEntityToModelMapper;
import be.bastienhousiaux.quizz.dal.mappers.to.model.TypedDataEntityToModelMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardRepository;
import be.bastienhousiaux.quizz.dal.repositories.TypedDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class MemoryCardMappableDAO extends AbstractMappableDAO<MemoryCardEntity, MemoryCardModel> {

    @Autowired
    private TypedDataRepository typedDataRepository;

    @Autowired
    private TypedDataEntityToModelMapper typedDataEntityToModelMapper;

    @Autowired
    public MemoryCardMappableDAO(MemoryCardEntityToModelMapper mapper, MemoryCardRepository repository) {
        super(mapper, repository);
    }

    @Override
    public MemoryCardEntity returnsNewEntity() {
        return new MemoryCardEntity();
    }


    public TypedDataModel createDataOnRecto(long idCard){
        Optional<MemoryCardEntity> memoryCardEntity=this.getRepository().findById(idCard);
        if(!memoryCardEntity.isPresent())return null;

        TypedDataEntity tr = typedDataRepository.save(new TypedDataEntity());
        tr.setType(DataTypeEnum.TEXT_DATA);
        memoryCardEntity.get().getRecto().add(tr);
        this.getRepository().save(memoryCardEntity.get());
        return typedDataEntityToModelMapper.map(tr);
    }

    public TypedDataModel createDataOnVerso(long idCard){
        Optional<MemoryCardEntity> memoryCardEntity=this.getRepository().findById(idCard);
        if(!memoryCardEntity.isPresent())return null;

        TypedDataEntity tr = typedDataRepository.save(new TypedDataEntity());
        tr.setType(DataTypeEnum.TEXT_DATA);
        memoryCardEntity.get().getVerso().add(tr);
        this.getRepository().save(memoryCardEntity.get());
        return typedDataEntityToModelMapper.map(tr);
    }
}
