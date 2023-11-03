package com.example.splitwise.Command;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommandExecuter {
    private List<ICommand> commands= new ArrayList<>();
    public void addCommand(ICommand input)
    {
        commands.add(input);
    }

    public void removeCommand(ICommand input)
    {
        commands.remove(input);
    }

    public void execute(String command)
    {
        for(ICommand cmd: commands)
        {
            if(cmd.matches(command))
            {
                cmd.execute(command);
                break;
            }
        }
    }
}
