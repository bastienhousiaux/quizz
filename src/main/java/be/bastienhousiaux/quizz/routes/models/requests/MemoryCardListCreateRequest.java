package be.bastienhousiaux.quizz.routes.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryCardListCreateRequest {
    private String name;
}
