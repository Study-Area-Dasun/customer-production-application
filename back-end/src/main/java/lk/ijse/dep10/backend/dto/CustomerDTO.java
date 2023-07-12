package lk.ijse.dep10.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private int id;
    @NotBlank(message = "Name can't be empty")
    private String name;
    @NotBlank(message = "Email can't be empty")
    private String email;
    @NotBlank(message = "Password can't be empty")
    private String password;
    @NotBlank(message = "GroupId can't be empty")
    private int groupId;

    public CustomerDTO(String name, String email, String password, int groupId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.groupId = groupId;
    }
}
