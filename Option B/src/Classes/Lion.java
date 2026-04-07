package Classes;

import javax.swing.*;

public class Lion extends Animal{
    private int tailsLength;

    private ImageIcon lionPic;

    public Lion(String species, String habitat, int maxWeight, boolean isEndangered, int tailsLength) {
        super(species, habitat, maxWeight, isEndangered);
        this.tailsLength = tailsLength;

        lionPic = new ImageIcon(this.getClass().getResource("/Images/lion.jpg"));
    }

    public int getTailsLength() {
        return tailsLength;
    }

    public void setTailsLength(int tailsLength) {
        this.tailsLength = tailsLength;
    }

    public String toString() {
        String report = super.toString() + String.format(" My tail length is %d CM", this.getTailsLength());
        return report;
    }

    public ImageIcon getLionPic() {
        return lionPic;
    }

    public void setLionPic(ImageIcon lionPic) {
        this.lionPic = lionPic;
    }
}
