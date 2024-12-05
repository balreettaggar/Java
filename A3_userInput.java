// import java.util.Scanner; // we imported external code
 
// public class A3_userInput {
//     public static void main(String[] args) {
//         System.out.print("Enter the input from : ");
//         // scanner is a class and to use it we need to make its object, scanner object
//         Scanner sc = new Scanner(System.in); // sc is the name of object, it can be anything 
//         // system.in means we want to take input from key
//         // scanner class has a lot of methods to take input and one is nextInt() = to take input of an integer
//         int num = sc.nextInt(); // the input from user is stored in a variable named num
//         System.out.print("The number is : " + num);
//     }
// }

// java has a scanner class in order to take input from user
// to use scanner class we need to import its class

// import java.util.Scanner;

// public class A3_userInput {

//     public static void main(String[] args) {
        
//         System.out.print("Enter the numbers : ");
//         Scanner sc = new Scanner(System.in); // throught system.in scanner class read from input source
//         // new keyword tells java to create a new object in reference to Scanner class
//         int a = sc.nextInt(); // nextInt() is a method of Scanner class to read input from user and store it as integer
//         int b = sc.nextInt(); // if we input any non-integer then Input mismatch error
//         // can take multiple inputs with a single object, like only with "sc" object we can take as many inputs
//         // we just need to call nextInt() exactly the number of variables we want to create
//         int sum = a+b;
//         System.out.print("The sum is : " + sum);
//     }
    
// }

// IN objected oriented programming
// classes are like blueprint (templates), blank sheets with examiner are like classes
// and submission of answer sheets like different objects 

// Think of new as ordering a pizza:
// The Scanner class is like the pizza shop (a blueprint for making pizza).
// The new keyword is like calling the shop and asking them to make you a pizza.
// The sc variable is like the delivery box that holds the pizza you ordered.
// Without calling the shop (new), you won't get a pizza (object).

// without new keywords java wouldn't know that we are trying to make an object

import java.util.Scanner;

public class A3_userInput {

    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // String str = sc.next(); // next method ignores spaces, doesn't print whole sentence
        //boolean b1 = sc.hasNext(); // to check whether user has entered int datatype or not;
        String str = sc.nextLine(); // to read whole line
        System.out.println(str); // 
    }
}