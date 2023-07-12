package lk.ijse.dep10.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private int id;
    private String name;
    private String email;
    private String password;
    private int groupId;

    public CustomerDTO(String name, String email, String password, int groupId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.groupId = groupId;
    }
}
