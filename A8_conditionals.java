// public class A8_conditionals {
//     public static void main(String[] args) {
//         // to make decisions we use conditional statements
//         // decision making instructions - if else and switch statements

//         int age = 12;

//         boolean condition = (age==18);
//         if(condition) { // only boolean values are allowed in if(condition)
//             // age >= 18 will eventually convert into boolean value
//             System.out.println("you can drive");
//         } else {
//             System.out.println("not yet!");
//         }
//         // else is optional
//         // only one block whether if or else is executed only

//         // condition true - if statement evluates otherwise else
//         // we use relational operators to check whether the condition is evaluated
//         // true or false

//         // "=" for assignment operator
//         // "==" to check equality
//     }
// }

// Relational and Logical Operators
// for logical AND all condtions must be true
// for logical OR a single true condition would work

// public class A8_conditionals {

//     public static void main(String[] args) {
//         boolean a = true;
//         boolean b = false;
//         boolean c = true;
//         // if(a && b && c) { // evaluated left to right
//         //     System.out.println("true");
//         // } else {
//         //     System.out.println("false");
//         // }
//         // if(a || b && c) {
//         //     System.out.println("true");
//         // } else {
//         //     System.out.println("false");
//         // }

//         // Logical NOT
//         System.out.println("Not(a) is " + !a); // changes a to false if it is true already

//     }
// }

// import java.util.Scanner;

// public class A8_conditionals {

//     // to check multiple conditions we use else if clause

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         // if(age > 55) {
//         //     System.out.println("near retirement");
//         // } else if (age > 45) {
//         //     System.out.println("experienced");
//         // } else {
//         //     System.out.println("fresher");
//         // }

//         // this is if-elseif-else ladder , and there can be multiple else if statements
//         // if I write if again, then it is checked, every if is checked or evaluated

//         // Switch Case Control Instruction
//         // when we have to make a choice between different alternatives

//         // switch(age) {
//         //     // age = the var we are using in switch statement can be int, char or string
//         //     case 18 :
//         //     System.out.println("Adulthood");
//         //     break;
//         //     case 35 :
//         //     System.out.println("MidLife");
//         //     break;
//         //     case 13 :
//         //     System.out.println("Teenage");
//         //     break;
//         //     default :
//         //     System.out.println("Enjoy life");

//         // }
//         // if none of the casees match then default statement is going to run
//         // break statement is necessary otherwise all other case statements after true case 
//         // statement will execute
//         // break statement comes out of the switch statement block


//     }
// }

// Practice Set

import java.util.Scanner;

public class A8_conditionals {

    public static void main(String[] args) {
        // int a = 10;
        // if(a==10) { // this is wrong, we are assigning in if statement itself rthat is wrong 
        //     System.out.println("I am 11");
        // } else {
        //     System.out.println("I am not 11");
        // }

        // Scanner se = new Scanner(System.in);
        // float a = se.nextFloat();
        // float b = se.nextFloat();
        // float c = se.nextFloat();

        // float totalPercentage = (a+b+c)/3.0f;
        // System.out.println(totalPercentage);
        // if(totalPercentage >= 40 && a >= 33 && b>=33 && c>=33) {
        //     System.out.println("pass");
        // } else {
        //     System.out.println("fail");
        // }

        // Scanner se = new Scanner(System.in);
        // double a = se.nextDouble();

        // if(a<=500000 && a>=250000) {
        //     System.out.println(a - a*(5.0f/100)); // if I write 5/100 it will perform 
        //     // integer operation i.e. 5/100 becomes zero
        //     // 5.0f/100 in this we wrote float, it has 32-bit precision, so there can be some
        //     // minute errors
        //     // float round off errors
        //     // 5.0d/100, double has 64-bit precision so the output will be more precise
        // } else if (a>500000 && a<=1000000) {
        //     System.out.println(a - a*(20.0d/100));
        // } else {
        //     System.out.println(a - a*(30.0d/100));
        // }

        // Scanner se = new Scanner(System.in);
        // int day = se.nextInt();

        // switch(day) {
        //     case 1 :
        //     System.out.println("Monday");
        //     break;
        //     case 2 :
        //     System.out.println("Tuesday");
        //     break;
        //     case 3 :
        //     System.out.println("Wednesday");
        //     break;
        //     case 4 :
        //     System.out.println("Thursday");
        //     break;
        //     case 5 :
        //     System.out.println("Friday");
        //     break;
        //     case 6 :
        //     System.out.println("Saturday");
        //     break;
        //     default :
        //     System.out.println("Sunday");
        // }

        //Leap year
        // Scanner se = new Scanner(System.in);
        // long year = se.nextLong();
        // if(year%4==0 && year%100!=0 || year%400==0) {
        //     System.out.println(year + " is a leap year");
        // } else {
        //     System.out.println(year + " is not leap");
        // }

        Scanner se = new Scanner(System.in);
        String website = se.next();
        if(website.endsWith(".com")) {
            System.out.println("commericial website");
        } else if (website.endsWith(".org")) {
            System.out.println("organisation website");
        } else {
            System.out.println("indian website");
        }

    }
}