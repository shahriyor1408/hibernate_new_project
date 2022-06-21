package uz.jl.enums;

import jakarta.persistence.AttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum BoardStatus {
    PUBLIC(-10),
    PRIVATE(-100);

    public final int priority;

    public static class BoardStatusConvertor implements AttributeConverter<BoardStatus, String> {
        @Override
        public String convertToDatabaseColumn(BoardStatus attribute) {
            if (Objects.isNull(attribute))
                return null;
            return switch (attribute) {
                case PUBLIC -> "Public board";
                case PRIVATE -> "Private board";
            };
        }

        @Override
        public BoardStatus convertToEntityAttribute(String dbData) {
            if (Objects.isNull(dbData))
                return null;
            return switch (dbData) {
                case "Public board" -> PUBLIC;
                case "Private board" -> PRIVATE;
                default -> PUBLIC;
            };
        }
    }
}
