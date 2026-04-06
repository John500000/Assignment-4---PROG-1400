package Classes;

public class Lion extends Animal{
    private int tailsLength;

    public Lion(String species, String habitat, int maxWeight, boolean isEndangered, int tailsLength) {
        super(species, habitat, maxWeight, isEndangered);
        this.tailsLength = tailsLength;
    }

    public int getTailsLength() {
        return tailsLength;
    }

    public void setTailsLength(int tailsLength) {
        this.tailsLength = tailsLength;
    }

    public String toString() {
        String report = super.toString() + String.format(" My tail length is: %d", this.getTailsLength());
        return report;
    }
}
