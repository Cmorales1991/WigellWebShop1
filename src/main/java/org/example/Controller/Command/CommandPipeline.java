package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;

import java.util.ArrayList;
import java.util.List;

public class CommandPipeline {
    private List<ClothingCommand> commands = new ArrayList<>();

    //metoden för att lägga till commands i pipeline listan
    public void addCommand(ClothingCommand command) {
        commands.add(command);
    }
    // metod för att utföra commandon i ordning från listan
    public void executeCommands(Clothing clothing) {
        for (ClothingCommand command : commands) {
            command.execute(clothing);
        }
    }
}
