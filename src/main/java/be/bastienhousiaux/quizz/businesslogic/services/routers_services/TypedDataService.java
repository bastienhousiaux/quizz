package be.bastienhousiaux.quizz.businesslogic.services.routers_services;

import be.bastienhousiaux.quizz.businesslogic.mappers.routers_mapping.modelToPresentable.TypedDataModelToPresentableMapper;
import be.bastienhousiaux.quizz.businesslogic.services.AbstractTypedDataMappableService;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.TypedDataMappableDAO;
import be.bastienhousiaux.quizz.routes.models.DataChunkPresentable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypedDataService extends AbstractTypedDataMappableService<DataChunkPresentable> {
    @Autowired
    public TypedDataService(TypedDataModelToPresentableMapper mapper, TypedDataMappableDAO dao) {
        super(mapper, dao);
    }
}
