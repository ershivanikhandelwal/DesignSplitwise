package com.example.splitwise;

import com.example.splitwise.Command.CommandExecuter;
import com.example.splitwise.Command.GroupCommand;
import com.example.splitwise.Command.RegisterCommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication implements CommandLineRunner {

    private CommandExecuter _commandExecuter;
    private Scanner scanner;
    public SplitwiseApplication(CommandExecuter commandExecuter, RegisterCommand registerCommand, GroupCommand groupCommand)
    {
        this._commandExecuter=commandExecuter;
        this._commandExecuter.addCommand(registerCommand);
        this._commandExecuter.addCommand(groupCommand);
        this.scanner= new Scanner(System.in);
    }
    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while(true)
        {
            System.out.println("Enter your input: ");
            String input= scanner.nextLine();
            this._commandExecuter.execute(input);
        }
    }
}
