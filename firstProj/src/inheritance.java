
class Animal {
    public String legs;


    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

}

class Dog extends Animal{
    public int number_of_eyes;

    public int getNumber_of_eyes() {
        return number_of_eyes;
    }

    public void setNumber_of_eyes(int number_of_eyes) {
        this.number_of_eyes = number_of_eyes;
    }

}

public class inheritance
{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setLegs("Chaar");
        System.out.println(animal.getLegs());

        Dog dog = new Dog();

        dog.setLegs("Ath");
        System.out.println(dog.getLegs());
    }
}
