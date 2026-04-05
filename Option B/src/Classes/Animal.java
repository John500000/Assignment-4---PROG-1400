package Classes;

public abstract class Animal {

    private String species;
    private String habitat;
    private int maxWeight;
    private boolean isEndangered;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public Animal(String species, String habitat, int maxWeight, boolean isEndangered) {
        this.species = species;
        this.habitat = habitat;
        this.maxWeight = maxWeight;
        this.isEndangered = isEndangered;
    }

    public abstract String toString();

    // Or do it like this and use report = super.toString() + String.format("")
//    public String toString() {
//        String danger ="";
//            if (this.isEndangered() == true) {
//            danger = "an endangered";
//        } else {
//            danger = "not an endangered";
//        }
//        String report = String.format("I am a %dlb %s that lives in the %s. I am %s species.", this.getMaxWeight(), this.getSpecies(), this.getHabitat(), danger);
//        return report;
//    }
}
