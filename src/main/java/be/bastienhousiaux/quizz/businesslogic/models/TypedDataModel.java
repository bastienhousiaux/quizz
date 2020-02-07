package be.bastienhousiaux.quizz.businesslogic.models;

import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TypedDataModel {
    private long id;

    private String data;
    private DataTypeEnum type;
}
