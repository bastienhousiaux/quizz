package be.bastienhousiaux.quizz.routes.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataChunkPresentable {
    private String type;
    private String data;
}
