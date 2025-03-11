package org.example.Controller.Command;


import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Pants;

public class SetLengthCommand implements ClothingCommand{
    private String length;

    public SetLengthCommand(String length) {
        this.length = length;
    }

    @Override
    public void execute(Clothing clothing) {
        if (clothing instanceof Pants) {
            ((Pants) clothing).length = length;
        }
    }
}
