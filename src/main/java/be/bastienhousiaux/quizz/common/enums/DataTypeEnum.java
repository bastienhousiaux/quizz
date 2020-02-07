package be.bastienhousiaux.quizz.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum DataTypeEnum {
    TEXT_DATA("textData"),
    IMAGE_URL_DATA("imageUrlData");
    @Getter private String typeName;
}
