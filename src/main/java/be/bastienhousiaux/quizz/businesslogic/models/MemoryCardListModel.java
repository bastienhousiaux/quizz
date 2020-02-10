package be.bastienhousiaux.quizz.businesslogic.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
public class MemoryCardListModel {
    private long id;
    private String name;
    private List<MemoryCardModel> cards;

    public MemoryCardListModel() {
        this.cards=new ArrayList<>();
    }
}
