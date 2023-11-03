package com.example.splitwise.Command;

import com.example.splitwise.Controller.UserController;
import com.example.splitwise.DTO.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class RegisterCommand implements ICommand  {
    private UserController _userController;
    @Override
    public boolean matches(String input) {
        if(getCommand(input).equals(Constants.REGISTER_COMMAND))
        {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        List<String> tokens=getTokens(input);
        UserDTO request= UserDTO.builder().name(tokens.get(0)).email(tokens.get(1)).password(tokens.get(2)).build();
        _userController.createUser(request);
    }
}
