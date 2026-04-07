package Classes;

import javax.swing.*;

public class Dog extends Animal{
    private String breed;
    private ImageIcon dogPic;

    public Dog(String species, String habitat, int maxWeight, boolean isEndangered, String breed) {
        super(species, habitat, maxWeight, isEndangered);
        this.breed = breed;

        dogPic = new ImageIcon(this.getClass().getResource("/Images/dog.jpg"));
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        String report = super.toString() + String.format(" My dog breed is %s", this.getBreed());
        return report;
    }

    public ImageIcon getDogPic() {
        return dogPic;
    }

    public void setDogPic(ImageIcon dogPic) {
        this.dogPic = dogPic;
    }
}
