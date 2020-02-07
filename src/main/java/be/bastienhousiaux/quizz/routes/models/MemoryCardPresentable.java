package be.bastienhousiaux.quizz.routes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryCardPresentable {
    private int id;
    private List<DataChunkPresentable> recto,verso;
}
