package be.bastienhousiaux.quizz.businesslogic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryCardListModel {
    private long id;
    private String name;
    private List<MemoryCardModel> cards;
}
