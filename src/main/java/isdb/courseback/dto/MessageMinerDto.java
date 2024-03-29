package isdb.courseback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageMinerDto {
    @NotNull
    private int minerId;
    @NotBlank
    private String status;
    @NotBlank
    private String description;

}
