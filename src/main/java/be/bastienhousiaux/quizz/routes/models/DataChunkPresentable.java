package be.bastienhousiaux.quizz.routes.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataChunkPresentable {
    private long id;
    private String type;
    private String data;

    public DataChunkPresentable(String data, String type) {
        this.type=type;
        this.data=data;
    }
}
