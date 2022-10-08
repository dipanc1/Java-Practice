
abstract class Pen{
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Likho...");
    }

    @Override
    void refill() {
        System.out.println("Bharooo....");
    }

    void changeNib(){
        System.out.println("Badlo...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping jumpaan jumpung jumpung");
    }

    void bite(){
        System.out.println("Thumping thumpaang thumpug thumpung");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat() {
        System.out.println("Khaate jao khaate jao.. ");
    }

    public void sleep(){
        System.out.println("Sote rahoooo");
    }
}

public class abstract_class_and_interfaces {
    public static void main(String[] args) {
        /*
        FountainPen fountainPen = new FountainPen();
        fountainPen.changeNib();
        fountainPen.refill();
        fountainPen.write();
         */

        Human hooman = new Human();

        hooman.jump();
        hooman.bite();


    }
}
