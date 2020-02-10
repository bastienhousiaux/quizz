package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListInfoModel;
import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListModel;
import be.bastienhousiaux.quizz.dal.entities.MemoryCardListEntity;
import be.bastienhousiaux.quizz.dal.mappers.MemoryCardListEntityMapper;
import be.bastienhousiaux.quizz.dal.mappers.MemoryCardListInfoEntityMapper;
import be.bastienhousiaux.quizz.dal.repositories.MemoryCardListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemoryCardListService {
    @Autowired
    private MemoryCardListRepository memoryCardListRepository;
    @Autowired
    private MemoryCardListEntityMapper memoryCardListEntityMapper;
    @Autowired
    private MemoryCardListInfoEntityMapper memoryCardListInfoEntityMapper;

    public MemoryCardListModel getMemoryCardListById(long id){
        Optional<MemoryCardListEntity> memoryCardListEntity = memoryCardListRepository.findById(id);

        if(!memoryCardListEntity.isPresent())return null;

        return memoryCardListEntityMapper.toDistant(memoryCardListEntity.get());

    }

    public MemoryCardListModel createMemoryCardList(String name){
        MemoryCardListEntity memoryCardListEntity=new MemoryCardListEntity();
        memoryCardListEntity.setName(name);

        this.memoryCardListRepository.save(memoryCardListEntity);

        return this.memoryCardListEntityMapper.toDistant(memoryCardListEntity);
    }

    public List<MemoryCardListInfoModel> getMemoryCardListDescriptors(){
        List<MemoryCardListInfoModel> memoryCardListInfoModels=new ArrayList<>();
        memoryCardListRepository.findAll().forEach(
                memoryCardListInfoEntity -> {
                    memoryCardListInfoModels.add(
                        memoryCardListInfoEntityMapper.toDistant(memoryCardListInfoEntity)
                    );
                }
        );
        return memoryCardListInfoModels;
    }
}
