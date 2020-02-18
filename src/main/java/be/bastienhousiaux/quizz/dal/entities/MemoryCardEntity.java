package be.bastienhousiaux.quizz.dal.entities;

import be.bastienhousiaux.quizz.businesslogic.models.MemoryCardModel;
import be.bastienhousiaux.quizz.utils.mapping.Mapper;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="memory_card")
@Data
public class MemoryCardEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="recto")
    @JoinColumn(name="recto_card_id")
    private List<TypedDataEntity> recto;
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="verso")
    @JoinColumn(name="verso_card_id")
    private  List<TypedDataEntity> verso;

    public MemoryCardEntity() {
        this.recto=new ArrayList<TypedDataEntity>();
        this.verso=new ArrayList<TypedDataEntity>();
    }

}
