package Classes;

public class Dog extends Animal{
    private String breed;

    public Dog(String species, String habitat, int maxWeight, boolean isEndangered, String breed) {
        super(species, habitat, maxWeight, isEndangered);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        String report = super.toString() + String.format(" My dog breed is: %s", this.getBreed());
        return report;
    }
}
