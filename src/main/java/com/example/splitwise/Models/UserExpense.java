package com.example.splitwise.Models;
import com.example.splitwise.Enum.ExpenseType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    private Double amount;
    private String Note;
    @Enumerated
    private ExpenseType type;
    @ManyToOne
    @JoinColumn(name="expense_id")
    private Expense expense;
}
