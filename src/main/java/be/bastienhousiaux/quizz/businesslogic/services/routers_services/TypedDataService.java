package be.bastienhousiaux.quizz.businesslogic.services.routers_services;

import be.bastienhousiaux.quizz.businesslogic.mappers.to.presentable.TypedDataModelToPresentableMapper;
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

    public TypedDataMappableDAO getDao(){
        return (TypedDataMappableDAO)super.getDao();
    }

    public void changeTypedDataType(long id,String type){
        this.getDao().changeTypedDataType(id,type);
    }

    public void changeTypedDataData(long id,String data){
        this.getDao().changeData(id,data);
    }

    public void deleteTypedDataById(long id){
        this.getDao().deleteById(id);
    }
}
