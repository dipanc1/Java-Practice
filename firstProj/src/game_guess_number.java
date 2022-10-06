import java.util.Scanner;

class RandomNumber{
    int upperBound = 20;
    int lowerBound = 0;
    int range = (upperBound - lowerBound) + 1;
    private int number, input, counter;
    public boolean right;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public RandomNumber(){ this.number = (int)(Math.random() * range) + lowerBound;}

    public void takeUserInput(int i){
        this.input = i;
    }

    public String isCorrectNumber(){
        System.out.println(this.number);
        if(this.number == this.input){
            setCounter(0);
            right = true;
            return "Correct!";
        }
        setCounter(counter+1);
        right = false;
        return "Try again!";
    }

}

public class game_guess_number
{
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 to 20: ");

        while(randomNumber.right == false){
//            if(randomNumber.getCounter() > 0){
//                System.out.println("Enter a number between 0 to 20: ");
//            }
            int a = sc.nextInt();

            randomNumber.takeUserInput(a);

            System.out.println("Number of guesses: "+ randomNumber.getCounter());
        }
        System.out.println(randomNumber.isCorrectNumber());

    }
}
