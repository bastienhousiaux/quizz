package be.bastienhousiaux.quizz.routes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryCardListPresentable {
    private long id;
    private String name;
    private List<MemoryCardPresentable> cards;
}
