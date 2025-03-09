package org.example.Command;

import org.example.Model.Clothing;
import org.example.Model.Skirt;

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
