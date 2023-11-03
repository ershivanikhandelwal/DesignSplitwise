package com.example.splitwise.Command;

public class SettleUpCommand implements ICommand {
    @Override
    public boolean matches(String input) {
        if(getCommand(input).equals(Constants.SETTLE_UP_COMMAND))
        {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {

    }
}
