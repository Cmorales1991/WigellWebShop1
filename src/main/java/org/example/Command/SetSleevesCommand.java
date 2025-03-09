package org.example.Command;

import org.example.Model.Clothing;
import org.example.Model.Tshirt;

public class SetSleevesCommand implements ClothingCommand{
    private String sleeves;

    public SetSleevesCommand(String sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Tshirt) {
            ((Tshirt) clothing).sleeves = sleeves;
        }
    }
}
