package org.example.Command;

import org.example.Model.Clothing;
import org.example.Model.Tshirt;

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
