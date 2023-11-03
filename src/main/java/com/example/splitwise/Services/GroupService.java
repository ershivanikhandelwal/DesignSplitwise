package com.example.splitwise.Services;

import com.example.splitwise.DTO.GroupDTO;
import com.example.splitwise.Models.Group;
import com.example.splitwise.Models.User;
import com.example.splitwise.Repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository _groupRepository;
    private UserService _userService;
    public Group createGroup(GroupDTO grp)
    {
        List<User> admins= _userService.getUsersByIds(grp.getAdmins());
        List<User> members=_userService.getUsersByIds(grp.getMembers());
        User createdBy=_userService.getUserById(grp.getCreatedBy());
        Group _group = Group.builder().groupName(grp.getGroupName())
                .admins(admins)
                .members(members)
                .createdBy(createdBy)
                .build();
        return _groupRepository.save(_group);
    }
}
