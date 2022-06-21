package uz.jl.enums;

import jakarta.persistence.AttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.jl.domains.WorkSpace;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum WorkSpaceStatus {
    PUBLIC(-10),
    PRIVATE(-100);

    public final int priority;

    public static class WorkspaceStatusConvertor implements AttributeConverter<WorkSpaceStatus,String> {
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
                case "Active User" -> PUBLIC;
                case "User that have not reset password" -> PRIVATE;
                default -> PUBLIC;
            };
        }
    }
}
