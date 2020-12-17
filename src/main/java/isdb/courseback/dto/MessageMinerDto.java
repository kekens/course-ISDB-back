package isdb.courseback.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class MessageMinerDto {

    @NotNull
    private int minerId;
    @NotBlank
    private String status;
    @NotBlank
    private String description;

}
