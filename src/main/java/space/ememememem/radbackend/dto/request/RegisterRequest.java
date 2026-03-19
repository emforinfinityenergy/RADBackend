package space.ememememem.radbackend.dto.request;

import lombok.Data;
import space.ememememem.radbackend.enums.UserRole;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private UserRole userRole;
}
