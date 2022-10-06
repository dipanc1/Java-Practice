class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

class Square{
    int side;
    public int area(){
       return side*side;
    }

    public int perimeter(){
        return 4* side;
    }
}

public class oops_basic {
    public static void main(String[] args) {
        /*
        // Problem 1
        Employee jatt =  new Employee();
        jatt.setName("Jatt");
        // jatt.name = "Jatt2";
        jatt.salary = 340;
        // System.out.println(jatt.getSalary());
        // System.out.println(jatt.getName());

        // Problem 2
        CellPhone oppof19 = new CellPhone();

        oppof19.ring();
        oppof19.vibrate();

        // Problem 3
        Square dabba = new Square();
        dabba.side = 5;
        System.out.println(dabba.area());
        System.out.println(dabba.perimeter());
         */


    }
}
