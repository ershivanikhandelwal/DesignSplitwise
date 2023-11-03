package com.example.splitwise.DTO;

import com.example.splitwise.Models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    private String name;
    private String email;
    private String password;
    public User toUser()
    {
        return User.builder().email(email).name(name).password(password).build();
    }
}
