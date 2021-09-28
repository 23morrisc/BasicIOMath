import java.util.Scanner;

/**
 * This is class that does basic math with user input and will output the results
 * @version 27/9/2021
 * @author 23morrisc
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    private int smallestPrime(int num) {
        for(int i = 2; i <= (int)(Math.sqrt(num))+1; i++) {
            if (num % i == 0)
                return i;
        }
        return num;
    }

    /**
     * does literally nothing
     */

    public void promptUser() {
        System.out.println("cheese");
    }

    /**
     * does literally nothing
     * @param i
     */

    public void printInfo(int i) {
        return smallestPrime(i);
    }

    /**
     * takes user input and outputs it with correct math being done
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.println("Question 1: What is your name?");

        String name = input.nextLine();

        System.out.println("Question 2: How old are you?");

        int age = input.nextInt();

        System.out.println("Question 3: What is your favorite number?");

        int favNumber = input.nextInt();

        System.out.println("Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
        System.out.println("At your next birthday, you will turn " + (age+1));

        System.out.println("The first prime factor of " + (age+1) + " is: "+ (3));

        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (favNumber*favNumber));
        System.out.println("* end of program *");
    }
}
