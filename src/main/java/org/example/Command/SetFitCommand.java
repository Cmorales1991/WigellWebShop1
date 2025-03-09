package org.example.Command;


import org.example.Model.Clothing;
import org.example.Model.Pants;

public class SetFitCommand implements ClothingCommand {
    private String fit;

    public SetFitCommand(String fit) {
        this.fit = fit;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Pants) {
            ((Pants) clothing).fit = fit;
        }
    }
}
