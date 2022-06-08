public class Mammal {
    // member variables
    protected int energyLevel;

    // cosntructor
    public Mammal() {
        this.energyLevel = 100;
    }

    // display energy level
    public int displayEnergy() {
        System.out.printf("Energy level is at %s\n", energyLevel);
        return energyLevel;
    }
}