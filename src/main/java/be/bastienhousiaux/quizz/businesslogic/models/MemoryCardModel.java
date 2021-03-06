package be.bastienhousiaux.quizz.businesslogic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryCardModel {
    private long id;
    private List<TypedDataModel> recto =new ArrayList<>();
    private List<TypedDataModel> verso =new ArrayList<>();
}
