package be.bastienhousiaux.quizz.businesslogic.services;
import be.bastienhousiaux.quizz.businesslogic.models.TypedDataModel;
import be.bastienhousiaux.quizz.dal.daos.businesslogic_daos.TypedDataMappableDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryCardListService {

    @Autowired
    private TypedDataMappableDAO typedDataDao;


    public List<TypedDataModel> getAll() {
        return typedDataDao.getAll();
    }
}
