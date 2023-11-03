package com.example.splitwise.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
@Table(name="usergroup")
public class Group extends BaseModel{
    private String groupName;
    @ManyToMany
    private List<User> members= new ArrayList<>();
    @ManyToOne
    private User createdBy;
    @ManyToMany
    private List<User> admins= new ArrayList<>();
}
