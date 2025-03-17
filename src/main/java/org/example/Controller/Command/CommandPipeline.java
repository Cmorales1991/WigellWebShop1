package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;

import java.util.ArrayList;
import java.util.List;

public class CommandPipeline {
    private List<ClothingCommand> commands = new ArrayList<>();

    public void addCommand(ClothingCommand command) {
        commands.add(command);
    }

    public void executeCommands(Clothing clothing) {
        for (ClothingCommand command : commands) {
            command.execute(clothing);
        }
    }
}
