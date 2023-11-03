package com.example.splitwise.Models;
import com.example.splitwise.Enum.ExpenseStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense extends BaseModel{
    private String description;
    private Double amount;
    private Date createdDate;
    @ManyToMany
    private List<User> users = new ArrayList<>();
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> paidBy= new ArrayList<>();
    @OneToMany(mappedBy = "expense")
    private List<UserExpense> oweBy= new ArrayList<>();
    @Enumerated
    private ExpenseStatus status;
}
