package be.bastienhousiaux.quizz.dal.entities;


import be.bastienhousiaux.quizz.common.enums.DataTypeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "typed_data")
@Data
@NoArgsConstructor
public class TypedDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;
    private DataTypeEnum type;

    public TypedDataEntity(String data, DataTypeEnum type) {
        this.data = data;
        this.type = type;
    }
}
