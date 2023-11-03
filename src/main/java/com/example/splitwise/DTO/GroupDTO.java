package com.example.splitwise.DTO;

import com.example.splitwise.Models.Group;
import com.example.splitwise.Models.User;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class GroupDTO {
    private String groupName;
    private List<Long> members= new ArrayList<>();
    private Long createdBy;
    private List<Long> admins= new ArrayList<>();
}
