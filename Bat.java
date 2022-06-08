public class Bat extends Mammal {

    // constructor
    public Bat() {
        this.energyLevel = 300;
    }

    // fly, lose 50 energy
    public void fly() {
        System.out.println("Flap flap flap...the bat takes off into the night");
        energyLevel -= 50;
    }

    // eat human, increase energy by 25
    public void eatHumans() {
        System.out.println("The bat is enjoying their...uhhh...meal....");
        energyLevel += 25;
    }

    // attack town, lose 100 energy
    public void attackTown() {
        System.out.println("The screams of villagers fleeing from their burning town can be hard");
        energyLevel -= 100;
    }
}