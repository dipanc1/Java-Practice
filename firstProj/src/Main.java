import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        String name = "Dipan";
        System.out.println("Hello world! \n "+ name);
         */

        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int input = scan.nextInt();
//        System.out.println(input);

        switch (input){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
        }

    }

}