package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.MemoryCardListEntityMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemoryCardListService {
    @Autowired
    private MemoryCardListRepository memoryCardListRepository;
    @Autowired
    private MemoryCardListEntityMapper memoryCardListEntityMapper;

    public MemoryCardListModel getMemoryCardListById(long id){
        Optional<MemoryCardListEntity> memoryCardListEntity = memoryCardListRepository.findById(id);

        if(!memoryCardListEntity.isPresent())return null;

        return memoryCardListEntityMapper.toDistant(memoryCardListEntity.get());

    }
}
