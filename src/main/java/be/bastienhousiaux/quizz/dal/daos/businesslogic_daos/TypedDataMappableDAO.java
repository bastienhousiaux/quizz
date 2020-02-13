package be.bastienhousiaux.quizz.dal.daos.businesslogic_daos;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import be.bastienhousiaux.quizz.dal.mappers.to.AbstractTypedDataEntityToMapper;
import be.bastienhousiaux.quizz.dal.repositories.TypedDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
