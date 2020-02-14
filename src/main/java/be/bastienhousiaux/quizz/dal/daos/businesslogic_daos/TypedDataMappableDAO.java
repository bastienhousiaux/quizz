package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.to.AbstractTypedDataEntityToMapper;
import be.bastienhousiaux.quizz.dal.repositories.TypedDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypedDataMappableDAO extends AbstractMappableDAO<TypedDataEntity, TypedDataModel> {
    @Autowired
    public TypedDataMappableDAO(AbstractTypedDataEntityToMapper mapper, TypedDataRepository repository) {
        super(mapper, repository);
    }

    @Override
    public TypedDataEntity returnsNewEntity() {
        return new TypedDataEntity();
    }

    public void changeTypedDataType(long id, String type){
        Optional<TypedDataEntity> typedDataEntity=this.getRepository().findById(id);
        if(typedDataEntity.isPresent()){
            typedDataEntity.get().setType(DataTypeEnum.fromString(type));
            this.getRepository().save(typedDataEntity.get());
        }
    }

    public void changeData(long id,String data){
        Optional<TypedDataEntity> typedDataEntity=this.getRepository().findById(id);
        if(typedDataEntity.isPresent()){
            typedDataEntity.get().setData(data);
            this.getRepository().save(typedDataEntity.get());
        }
    }
}
