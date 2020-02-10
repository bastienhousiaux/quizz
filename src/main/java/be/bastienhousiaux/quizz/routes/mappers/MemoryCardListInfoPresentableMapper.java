package be.bastienhousiaux.quizz.routes.mappers;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardListInfoModel;
import be.bastienhousiaux.quizz.routes.models.MemoryCardListInfoPresentable;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import org.springframework.stereotype.Service;

@Service
public class MemoryCardListInfoPresentableMapper implements Mapper<MemoryCardListInfoPresentable, MemoryCardListInfoModel> {
    @Override
    public MemoryCardListInfoPresentable toSource(MemoryCardListInfoModel memoryCardListInfoModel) {
        MemoryCardListInfoPresentable memoryCardListInfoPresentable=new MemoryCardListInfoPresentable();
        memoryCardListInfoPresentable.setId(memoryCardListInfoModel.getId());
        memoryCardListInfoPresentable.setName(memoryCardListInfoModel.getName());
        return memoryCardListInfoPresentable;
    }

    @Override
    public MemoryCardListInfoModel toDistant(MemoryCardListInfoPresentable memoryCardListInfoPresentable) {
        MemoryCardListInfoModel memoryCardListInfoModel=new MemoryCardListInfoModel();
        memoryCardListInfoModel.setId(memoryCardListInfoPresentable.getId());
        memoryCardListInfoModel.setName(memoryCardListInfoPresentable.getName());
        return memoryCardListInfoModel;
    }
}
