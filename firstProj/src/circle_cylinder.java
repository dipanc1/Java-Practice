
class Circled{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(){
        System.out.println(Math.PI * radius * radius);
    }


}

public class circle_cylinder {
    public static void main(String[] args) {
        Circled c = new Circled();

        c.setRadius(25);
        c.area();
    }
}
