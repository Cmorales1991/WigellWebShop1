package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Tshirt;

public class SetNeckCommand implements ClothingCommand{
    private String neck;

    public SetNeckCommand(String neck) {
        this.neck = neck;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Tshirt) {
            ((Tshirt) clothing).neck = neck;
        }
    }
}
