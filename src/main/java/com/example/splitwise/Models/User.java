package com.example.splitwise.Models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
}
