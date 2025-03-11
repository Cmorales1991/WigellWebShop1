package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Skirt;

public class SetPatternCommand implements ClothingCommand{
    private String pattern;

    public SetPatternCommand(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).pattern = pattern;
        }
    }
}
