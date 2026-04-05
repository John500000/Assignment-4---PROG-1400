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
        String danger ="not an endangered";
        if (this.isEndangered()) {
            danger = "an endangered";
        }
        String report = String.format("I am a %dlb %s that lives in the %s. I am %s species. My tails's length is %d CM.", this.getMaxWeight(), this.getSpecies(), this.getHabitat(), danger, this.tailsLength);

        return report;
    }
}
