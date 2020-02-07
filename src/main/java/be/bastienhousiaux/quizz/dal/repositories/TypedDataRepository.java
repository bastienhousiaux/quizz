package be.bastienhousiaux.quizz.dal.repositories;

import be.bastienhousiaux.quizz.dal.entities.TypedDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypedDataRepository extends CrudRepository<TypedDataEntity,Long> {
}
