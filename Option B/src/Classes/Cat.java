package Classes;

import javax.swing.*;

public class Cat extends Animal {
    private int whiskersLength;

    private ImageIcon catPic;

    public Cat(String species, String habitat, int maxWeight, boolean isEndangered, int whiskersLength) {
        super(species, habitat, maxWeight, isEndangered);
        this.whiskersLength = whiskersLength;

        catPic = new ImageIcon(this.getClass().getResource("/Images/cat.jpg"));
    }

    public int getWhiskersLength() {
        return whiskersLength;
    }

    public void setWhiskersLength(int whiskersLength) {
        this.whiskersLength = whiskersLength;
    }

    public String toString() {
        String report = super.toString() + String.format(" My whiskers length is %d CM", this.getWhiskersLength());
        return report;
    }

    public ImageIcon getCatPic() {
        return catPic;
    }

    public void setCatPic(ImageIcon catPic) {
        this.catPic = catPic;
    }
}
