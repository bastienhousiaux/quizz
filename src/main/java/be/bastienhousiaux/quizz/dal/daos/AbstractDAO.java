package be.bastienhousiaux.quizz.dal.daos;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<EntityType,Out> implements GetAllEntitiesInterface<Out> {


//    @Override
//    public List<EntityType> getAll() {
//        List<EntityType> entities=new ArrayList<>();
//        this.repository.findAll().forEach(entity->{
//            entities.add(entity);
//        });
//        return entities;
//    }
}
