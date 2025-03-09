package org.example.Command;


import org.example.Model.Clothing;
import org.example.Model.Pants;

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
