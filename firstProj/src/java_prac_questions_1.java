public class java_prac_questions_1 {

    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void starPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    static void starPatternReverse(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibonacci(int n) {
//        if(n ==1){
//            return 0;
//        }
//        else if(n ==2){
//            return 1;
//        }
        if (n == 2 || n == 1) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static void findAverage(int... args) {
        int sum = 0;
        int length = args.length;
        for (int i : args) {
            sum += i;
        }
        System.out.println(sum / length);
    }

    static void starPatternRecursion(int n) {
        // base Case
        if (n > 0) {
            starPatternRecursion(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void celtoFar(float n) {
        System.out.println((n * 9 / 5) + 32);
    }

    public static void main(String[] args) {
//         Problem 1 -> multiplication table of a number
//        multiplication(7);

//         Problem 2 -> Print start pattern up to 4 lines
//        starPattern(4);

//         Problem 3 -> Sum of First n Natural Numbers
        /*


        int sum = sumOfNaturalNumbers(5);
        System.out.println(sum);
        */

//        Problem 4 -> Print Star Pattern Upside Down
//          starPatternReverse(4);

//        Problem 5 -> Nth term of fibonacci series using recursion
        /*
        int fib = fibonacci(10);
        System.out.println(fib);
         */

//        Problem 6 -> Average of set of numbers as arguments using varargs
//        findAverage(1,2,3,4,5);

//        Problem 8 -> star pattern using recursion
//        starPatternRecursion(4);

        // Problem 9 -> convert celsius to fahrenheit
        celtoFar(16);
    }
}
