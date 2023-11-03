package com.example.splitwise.Command;

public class ExpenseCommand implements ICommand{
    @Override
    public boolean matches(String input) {
        if(getCommand(input).equals(Constants.EXPENSE_CREATE_COMMAND))
        {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {

    }
}
