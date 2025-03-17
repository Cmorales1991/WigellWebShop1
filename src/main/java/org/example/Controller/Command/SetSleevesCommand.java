package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Tshirt;

public class SetSleevesCommand implements ClothingCommand{
    private String sleeves;

    public SetSleevesCommand(String sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Tshirt) {
            ((Tshirt) clothing).setSleeves(sleeves);
        }
    }
}
