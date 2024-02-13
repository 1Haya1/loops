import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// EX1
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //EX2
// //      Scanner scanner = new Scanner(System.in);
        // System.out.print("أدخل نصًا: ");
        // String inputString = scanner.nextLine();

        // //عكس النص 
        // System.out.print("النص المعكوس: ");
        // for (int i = inputString.length() - 1; i >= 0; i--) {
        //     System.out.print(inputString.charAt(i));

//EX3
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("ادخل العدد: ");
//        int number = scanner.nextInt();
//
//        long factorial = calculateFactorial(number); // حساب العامل التسلسلي
//
//        System.out.println("قيمة العامل التسلسلي لـ " + number + " هو: " + factorial);
//    }
//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * calculateFactorial(n - 1);
//
//    }
//

        //EX4
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter the base number: ");
//        int base = s.nextInt();
//
//        System.out.print("Enter the exponent: ");
//        int exponent = s.nextInt();
//
//        long result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
//    }


//EX5

//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter integers (enter 0 to finish):");
//        int number;
//        int sumEven = 0;
//        int sumOdd = 0;
//        while ((number = s.nextInt()) != 0) {
//            if (number % 2 == 0) {
//                sumEven += number;
//            } else {
//                sumOdd += number;
//            }
//        }
//        System.out.println("Sum of even integers: " + sumEven);
//        System.out.println("Sum of odd integers: " + sumOdd);
//
//    }}

//EX6
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a positive integer: ");
//        int number = s.nextInt();
//
//        boolean isPrime = number > 1;
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
//    }}

//EX7
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("Day" + day);
//            }}}}

//EX8
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a word: ");
//        String word = s.nextLine();
//
//        boolean isPalindrome = new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);//equalsIgnoreCase(word)يقارن الكلمة المعكوسة مع الكلمة الأصلية، متجاهلاً حالة الأحرف
//
//        System.out.println(word + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
//    }}
