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
public class MemoryCardListEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany
    private List<MemoryCardEntity> cards=new ArrayList<>();
}
