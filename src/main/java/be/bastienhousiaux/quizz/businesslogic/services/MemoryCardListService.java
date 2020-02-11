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

//    @Autowired
//    private MemoryCardListRepository memoryCardListRepository;
//    @Autowired
//    private MemoryCardListEntityMapper memoryCardListEntityMapper;
//    @Autowired
//    private MemoryCardListInfoEntityMapper memoryCardListInfoEntityMapper;
//    @Autowired
//    private MemoryCardRepository memoryCardRepository;
//    @Autowired
//    private MemoryCardEntityMapper memoryCardEntityMapper;
//
//    public MemoryCardListModel getMemoryCardListById(long id){
//        Optional<MemoryCardListEntity> memoryCardListEntity = memoryCardListRepository.findById(id);
//
//        if(!memoryCardListEntity.isPresent())return null;
//
//        return memoryCardListEntityMapper.toDistant(memoryCardListEntity.get());
//
//    }
//
//    public MemoryCardListModel createMemoryCardList(String name){
//        MemoryCardListEntity memoryCardListEntity=new MemoryCardListEntity();
//        memoryCardListEntity.setName(name);
//
//        this.memoryCardListRepository.save(memoryCardListEntity);
//
//        return this.memoryCardListEntityMapper.toDistant(memoryCardListEntity);
//    }
//
//    public List<MemoryCardListInfoModel> getMemoryCardListDescriptors(){
//        List<MemoryCardListInfoModel> memoryCardListInfoModels=new ArrayList<>();
//        memoryCardListRepository.findAll().forEach(
//                memoryCardListInfoEntity -> {
//                    memoryCardListInfoModels.add(
//                        memoryCardListInfoEntityMapper.toDistant(memoryCardListInfoEntity)
//                    );
//                }
//        );
//        return memoryCardListInfoModels;
//    }
//
//    public void deleteMemoryCardList(long id){
//        this.memoryCardListRepository.deleteById(id);
//    }
//
//    public MemoryCardModel createCardInQuizz(long idQuizz){
//        MemoryCardModel memoryCardModel=new MemoryCardModel();
//        this.memoryCardListRepository.findById(idQuizz);
//        if()
////        MemoryCardEntity memoryCardEntity =this.memoryCardRepository.save(memoryCardEntityMapper.toSource(memoryCardModel));
////
////        MemoryCardModel addedModel=this.memoryCardEntityMapper.toDistant(
////
////        );
//
//        return null;
//    }
}
