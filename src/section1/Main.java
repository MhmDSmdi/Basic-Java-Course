// Package path for class
package section1;

// All classes you need to import
import section2.Circle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class Deceleration
public class Main {
    public static void main(String[] args) {
        // Object Instantiation
        Calculator calculator = new Calculator();
        // Method Call using dot(.)
        double result = calculator.division(5, 0);
        System.out.println("Result is : " + result);

        // Convert String to Integer
        int num = Integer.parseInt("15");
        System.out.println("Your integer number is : " + num);

        // Convert Integer to String
        String numString = String.valueOf(40);
        System.out.println("String of your Integer is : " + numString);

        //Array Instantiation
        // Using array as List, Note you can't edit!
        int[] fixNumbers = new int[]{1, 2, 3, 4, 5};
        char[] charArray = new char[255];
        Person[] persons = new Person[5];
        persons[0] = new Person("Ali", 20);
        persons[2] = new Person("Sara", 18);
        persons[1] = new Person("Saeed", 18);
        persons[3] = new Person("Zahra", 23);
        persons[4] = new Person("Nasim", 21);

        // In the tag (<>) Most Insert a Object Like Integer not int (and other primitive type) !!
        //List<int> wrongList = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(233);
        System.out.println(integers);
        // Remove by Object
        integers.remove(new Integer(2));
        System.out.println(integers);
        //Remove by index
        integers.remove(0);
        System.out.println(integers);

        // Getting input from user using Scanner class, System.in means we get input from keyboard.
        System.out.println("PLEASE ENTER A SENTENCE:");
        Scanner scanner = new Scanner(System.in);
        // nextLine Method return Write in Consul
        String input = scanner.nextLine();
        System.out.println("Your Input is : " + input);

        // PROGRAM FLOW
        // if example
        boolean flag = false;
        if (flag) {
            System.out.println("flag is TRUE");
        }
        else {
            System.out.println("flag is FALSE");
        }

        // for example
        int counter = 0;
        for (int i = 0 ; i < 10 ; i++) {
            counter++;
        }
        System.out.println("Counter : " + counter);

        // while example
        boolean condition = false;
        while (condition) {
            //Instruction
            System.out.println("IN WHILE");
        }
        System.out.println("While Condition is False");

        // for each example
        for (Person p : persons) {
            p.sayHello();
        }

        // Switch case example
        System.out.println("PLEASE ENTER A NUMBER BETWEEN 1 - 5");
        int in = scanner.nextInt();
        switch (in) {
            case 1:
                System.out.println("Your Input is One");
                break;
            case 2:
                System.out.println("Your Input is Two");
                break;
            case 3:
                System.out.println("Your Input is Three");
                break;
            case 4:
                System.out.println("Your Input is Four");
                break;
            case 5:
                System.out.println("Your Input is Five");
                break;
            default:
                System.out.println("Your Input is out of range");
        }

        // Inheritance and Polymorphism (Method Overriding)
        int radios = 5;
        Circle circle = new Circle(radios);
        System.out.println("Area of circle with radios " + radios + " is " + circle.calArea());
    }

}
