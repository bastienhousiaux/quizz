package be.bastienhousiaux.quizz.dal.repositories;


import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryCardListRepository extends CrudRepository<MemoryCardListEntity,Long> {
}
