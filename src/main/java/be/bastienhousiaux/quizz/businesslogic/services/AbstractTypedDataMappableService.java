package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class AbstractTypedDataMappableService<OutType> extends AbstractMappableService<TypedDataModel,OutType> {
    public AbstractTypedDataMappableService(Mapper<TypedDataModel, OutType> mapper, AbstractMappableDAO<?, TypedDataModel> dao) {
        super(mapper, dao);
    }
}
