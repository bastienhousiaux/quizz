package be.bastienhousiaux.quizz.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum DataTypeEnum {
    TEXT_DATA("textData"),
    IMAGE_URL_DATA("imageUrlData");
    @Getter private String typeName;

    public static DataTypeEnum fromString(String type){
        switch (type){
            case "textData":
                return TEXT_DATA;
            case "imageUrlData":
                return IMAGE_URL_DATA;
            default:
                return null;
        }
    }
}
