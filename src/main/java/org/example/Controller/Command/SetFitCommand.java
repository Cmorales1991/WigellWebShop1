package org.example.Controller.Command;


import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Pants;

public class SetFitCommand implements ClothingCommand {
    private String fit;

    public SetFitCommand(String fit) {
        this.fit = fit;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Pants) {
            ((Pants) clothing).setFit(fit);
        }
    }
}
