package be.bastienhousiaux.quizz.dal.daos;

import java.util.List;

public interface GetAllEntitiesInterface<T> {
    public List<T> getAll();
}
