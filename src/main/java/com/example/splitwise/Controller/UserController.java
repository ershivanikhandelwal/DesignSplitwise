package com.example.splitwise.Controller;

import com.example.splitwise.DTO.UserDTO;
import com.example.splitwise.Models.User;
import com.example.splitwise.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserController {
    private UserService _userService;
    public User createUser(UserDTO request)
    {
        return _userService.createUser(request.toUser());
    }
}
