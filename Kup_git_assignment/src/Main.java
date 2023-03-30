import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nHello, world!");
        //Taking name and age as an input from user, to check whether a person is adult or not.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of person: ");
        String name = scan.nextLine();
        System.out.println("Please enter the age of the person: ");
        Integer age = scan.nextInt();
        Person person = new Person(name, age);
        System.out.println("Is the person adult ? "+person.isAdult(name, age));
    }
}