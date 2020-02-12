package be.bastienhousiaux.quizz.businesslogic.services;

import be.bastienhousiaux.quizz.dal.daos.AbstractMappableDAO;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class AbstractMappableService<LayerType,OutType> extends AbstractService<LayerType,OutType>{

    private Mapper<LayerType,OutType> mapper;
    private AbstractMappableDAO<?,LayerType> dao;

    public AbstractMappableService(Mapper<LayerType, OutType> mapper, AbstractMappableDAO<?, LayerType> dao) {
        this.mapper = mapper;
        this.dao = dao;
    }

    public List<OutType> getAll(){
        List<OutType> result=new ArrayList<>();
        this.dao.getAll().forEach(
                element->{
                    result.add(this.mapper.map(element));
                }
        );
        return result;
    }

    public OutType getById(long id){
        return this.mapper.map(this.dao.getOne(id));
    }

    public OutType create(){
        return this.mapper.map(
            this.dao.create()
        );
    }

    public void deleteById(Long id){
        this.dao.deleteById(id);
    }

}
