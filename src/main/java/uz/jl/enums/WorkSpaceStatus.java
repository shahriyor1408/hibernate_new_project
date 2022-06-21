package uz.jl.enums;

import jakarta.persistence.AttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum WorkSpaceStatus {
    PUBLIC(-10),
    PRIVATE(-100);

    public final int priority;

    public static class WorkspaceStatusConvertor implements AttributeConverter<WorkSpaceStatus, String> {
        @Override
        public String convertToDatabaseColumn(WorkSpaceStatus attribute) {
            if (Objects.isNull(attribute))
                return null;
            return switch (attribute) {
                case PUBLIC -> "Public workspace";
                case PRIVATE -> "Private workspace";
            };
        }

        @Override
        public WorkSpaceStatus convertToEntityAttribute(String dbData) {
            if (Objects.isNull(dbData))
                return null;
            return switch (dbData) {
                case "Public workspace" -> PUBLIC;
                case "private workspace" -> PRIVATE;
                default -> PUBLIC;
            };
        }
    }
}
