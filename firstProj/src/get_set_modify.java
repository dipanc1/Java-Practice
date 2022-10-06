
class Circle{
    private int radius;
    private double area, circumference;

    public void setRadius(int r){
        this.radius = r;
    }

    public double getArea(){
        this.area = 3.14*radius*radius;
        return this.area;
    }

    public double getCircumference(){
        this.circumference = 2*3.14*radius;
        return this.circumference;
    }
}

public class get_set_modify {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
