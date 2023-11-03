package com.example.splitwise.Controller;

import com.example.splitwise.DTO.GroupDTO;
import com.example.splitwise.Models.Group;
import com.example.splitwise.Services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GroupController {
    private GroupService _groupService;
    public Group createGroup(GroupDTO request)
    {
        return _groupService.createGroup(request);
    }
}
