package org.example.Controller.Command;

import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Skirt;

public class SetWaistlineCommand implements ClothingCommand{
    private String waistline;

    public SetWaistlineCommand(String waistline) {
        this.waistline = waistline;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).waistline = waistline;
        }
    }
}
