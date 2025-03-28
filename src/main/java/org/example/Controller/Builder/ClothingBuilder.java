package org.example.Controller.Builder;

import org.example.Model.Clothing.Clothing;
import org.example.Model.Clothing.Pants;
import org.example.Model.Clothing.Skirt;
import org.example.Model.Clothing.Tshirt;

public class ClothingBuilder {
    private Clothing clothing;

    public ClothingBuilder(String type) {
        switch (type.toLowerCase()) {
            case "byxor":
                clothing = new Pants();
                break;
            case "tshirt":
                clothing = new Tshirt();
                break;
            case "kjol":
                clothing = new Skirt();
                break;
        }
    }

    public ClothingBuilder setSize(String size) {
        clothing.size = size;
        return this;
    }

    public ClothingBuilder setMaterial(String material) {
        clothing.material = material;
        return this;
    }

    public ClothingBuilder setColor(String color) {
        clothing.color = color;
        return this;
    }

    public ClothingBuilder setType(String type) {
        clothing.type = type;
        return this;
    }

    public Clothing build() {
        return clothing;
    }
}
