package be.bastienhousiaux.quizz.dal.daos;

import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractMappableDAO<EntityType,OutType> extends AbstractDAO<EntityType,OutType> {
    private Mapper<EntityType,OutType> mapper;
    private CrudRepository<EntityType,Long> repository;

    /*
    READ
     */
    public List<OutType> getAll(){
        List<OutType> outs=new ArrayList<>();

        this.repository.findAll().forEach(
                entity->{
                    outs.add(mapper.map(entity));
                }
        );
        return outs;
    }

    public OutType getOne(long id){
        return this.mapper.map(
                this.repository.findById(id).orElse(null)
        );
    }

    /*
    CREATE
    */
    public OutType create(){
        EntityType entity=this.returnsNewEntity();
        this.repository.save(entity);
        OutType mappedEntity=this.mapper.map(entity);
        return mappedEntity;
    }

    public abstract EntityType returnsNewEntity();

    /*
    UPDATE
     */
    public OutType update(EntityType entity){
        return this.mapper.map(
            this.repository.save(entity)
        );
    }

    /*
    DELETE
     */
    public void deleteById(long id){
        this.repository.deleteById(id);
    }
}
