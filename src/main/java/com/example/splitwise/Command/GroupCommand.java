package com.example.splitwise.Command;

import com.example.splitwise.Controller.GroupController;
import com.example.splitwise.DTO.GroupDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class GroupCommand implements ICommand{
    private GroupController _groupController;
    @Override
    public boolean matches(String input) {
        if(getCommand(input).equals(Constants.GROUP_CREATE_COMMAND))
        {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        List<String> tokens= getTokens(input);
        List<Long> admins= getTokens(tokens.get(2)).stream().map(Long::valueOf).collect(Collectors.toList());
        List<Long> members= getTokens(tokens.get(3)).stream().map(Long::valueOf).collect(Collectors.toList());
        Long createdBy = Long.parseLong(tokens.get(4));
        GroupDTO request=GroupDTO.builder().groupName(tokens.get(0))
                        .admins(admins)
                                .members(members)
                                        .createdBy(createdBy).build();
        _groupController.createGroup(request);
    }
}
