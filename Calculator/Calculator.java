import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type m for Multiply, a for Addition, s for Subtraction and d for Division: ");
        String sign = sc.nextLine();
        System.out.println("Enter a Number: ");
        int firstNum  = sc.nextInt();
        if(firstNum >= 100000){
            throw new Exception("Input cannot be more than 100000");
        }
        System.out.println("Enter another Number: ");
        int secondNum = sc.nextInt();
        if(secondNum >= 100000){
            throw new Exception("Input cannot be more than 100000");
        }

        switch (sign){
            case "m":
                if(firstNum* secondNum >= 7000){
                    throw new Exception("Output cannot be more than 7000");
                }
                System.out.println(firstNum + " multiplied by "+ secondNum + " is: " + (firstNum * secondNum));
                break;
            case "a":
                System.out.println(firstNum + " added to "+ secondNum + " is: " + (firstNum + secondNum));
                break;
            case "s":
                System.out.println(firstNum + " subtracted from "+ secondNum + " is: " + (firstNum - secondNum));
                break;
            case "d":
                try {
                    System.out.println(firstNum + " divided by "+ secondNum + " is: " + (firstNum/ secondNum));
                    break;
                }
                catch (Exception e){
                    System.out.println(e);
                    break;
                }
            default:
                throw new Exception("Enter valid input");
        }
    }
}
