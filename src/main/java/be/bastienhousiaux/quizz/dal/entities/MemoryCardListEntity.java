package be.bastienhousiaux.quizz.dal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="memory_card_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MemoryCardListEntity extends MemoryCardListInfoEntity{

    @OneToMany
    private List<MemoryCardEntity> cards=new ArrayList<>();
}
