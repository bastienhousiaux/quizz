package be.bastienhousiaux.quizz.dal.repositories;

import be.bastienhousiaux.quizz.dal.entities.MemoryCardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryCardRepository extends CrudRepository<MemoryCardEntity,Long> {
}
