public class Gorilla extends Mammal{
    
    // throw something, lose 5 energy
    public void throwSomething() {
        System.out.println("The gorilla has thrown 'something' at you");
        energyLevel -= 5;
    }

    // eat a banana, gain 10 energy
    public void eatBananas() {
        System.out.println("The gorilla is enjoying his bananas");
        energyLevel += 10;
    }

    // climb, lose 10 energy
    public void climb() {
        System.out.println("The gorilla has climbed into a tree");
        energyLevel -= 10;
    }
}
