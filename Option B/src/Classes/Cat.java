package Classes;

public class Cat extends Animal {
    private int whiskersLength;

    public Cat(String species, String habitat, int maxWeight, boolean isEndangered, int whiskersLength) {
        super(species, habitat, maxWeight, isEndangered);
        this.whiskersLength = whiskersLength;
    }

    public int getWhiskersLength() {
        return whiskersLength;
    }

    public void setWhiskersLength(int whiskersLength) {
        this.whiskersLength = whiskersLength;
    }

    public String toString() {
        String report = super.toString() + String.format(" My whiskers length is: %d CM", this.getWhiskersLength());
        return report;
    }
}
