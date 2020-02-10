package be.bastienhousiaux.quizz.routes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryCardListInfoPresentable {
    private long id;
    private String name;
}
