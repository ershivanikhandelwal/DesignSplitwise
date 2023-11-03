package com.example.splitwise.Command;

import java.util.Arrays;
import java.util.List;

public interface ICommand {
    public boolean matches(String input);
    public void execute(String input);
    default String getCommand(String input)
    {
        return getTokens(input).get(0);
    }

    default List<String> getTokens(String input)
    {
        return Arrays.stream(input.split(" ")).toList();
    }

}
