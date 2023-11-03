package com.example.splitwise.DTO;

import com.example.splitwise.Enum.ExpenseStatus;
import com.example.splitwise.Models.User;
import com.example.splitwise.Models.UserExpense;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ExpenseDTO {
    private String description;
    private Double amount;
    private Date createdDate;
    private List<User> users = new ArrayList<>();
    private List<UserExpense> paidBy= new ArrayList<>();
    private List<UserExpense> oweBy= new ArrayList<>();
    private ExpenseStatus status;
}
