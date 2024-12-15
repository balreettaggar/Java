// strings are sequence of characters
// to write name and some characters sequencially we use String datatype and double quotes
// String is a class in java not a primitive datatype but java has a special support for
// string so we can use it as primitive datatype as well
// strings are immutable and cannot be changed
// we can't change same object of that string but we can make a copy of that string and 
// can change it, can't change the original one, the memory slot for that string

// import java.util.Scanner;

// public class A7_strings {
//     public static void main(String[] args) {
//         // as we can make scanner object using new keyword
//         // as same we can do with strings as well
//         // String name = new String("Balreet"); // used same as Scanner class
//         // String name = "balreet"; // but java has special support for string so we can use
//         // it as a datatype as well
//         // System.out.println(name);

//         // int a=5;
//         // float b=5.7f;
//         // System.out.printf("The value of a is %d and the value of b is %f", a, b);
//         // %d is for integers and %f is for floating point numbers 
//         // %d, %f = these are format specifiers
//         // %s for string, %c for char

//         // if we write %.2f it will print floating number upto two decimal places
//         // if we write %8.2f it will take 8 places including floating number

//         // System.out.format("The value of a is %d and the value of b is %f",a,b);
//         // format works same as printf

//         Scanner se = new Scanner(System.in);
//         String a = se.nextLine();
//         System.out.println(a);

//     }
// }

// diffierent methods to print in java
// System.out.println(name); adds a new line
// System.out.print(name); doesn't add a new line
// System.out.printf(name); as we used to in c language

// STRING METHODS
// java supports some methods of strings like to find length, f=to convert to uppercase
// or lowercase, existing string won't be changed because they are inmutable
// we can change a string and return its copy

// public class A7_strings {

//     public static void main(String[] args) {

//         String name = "Balreet Singh";
//         // indexing start from zero
//         // int value = name.length(); // returns the length of the string
//         // System.out.print(value);

//         // String lowerString = name.toLowerCase(); // returns a new string converting all
//         // alphabets to lowercase
//         // System.out.println(lowerString);

//         // String upperString = name.toUpperCase(); // the original string is not changed
//         // if I write name = name.toUpperCase() then it will not change original string
//         // but it will point to a string of value "BALREET SINGH", somewhere else in
//         // the memory
//        // System.out.println(upperString);

//         // String trimmedString = name.trim(); // removes all whitespaces before and after
//         // not in between
//         // System.out.println(trimmedString);

//         // System.out.println(name.substring(3)); // starts from index number 3
//         // and will go till end of the string, it also returns a new string
//         // System.out.println(name.substring(3, 13)); // start index is
//         // included but end index is not included
//         // also endindex is allowed to have max value of length of string, if endIndex is 14
//         // then it would show out of bounds

//         // System.out.println(name.replace('e', 'o')); // replaces all 'e' with 'o'
//         // System.out.println(name.replace("Singh", "Taggar"));
//         // changes the string
//        // System.out.println(name.replace("e", "Hello")); // replaces all e with
//         // new string

//        // System.out.println(name.startsWith("B")); // returns true or false
//         // we can't input a character here, have to do with strings

//        // System.out.println(name.endsWith("H")); // these are case senstive

//        // System.out.println(name.charAt(3)); // returns char at that index
//        // System.out.println(name.indexOf('S')); // can pass a character and it will return
//        // an integer value

//        // System.out.println(name.indexOf("Balreet")); // in this case it will return the
//        // index of 1st character, in case of substring

//        // System.out.println(name.indexOf('e')); // returns the index of e that occurs first

//         // String modifiedName = "BalreetBalreet";
//        // System.out.println(modifiedName.indexOf("reet", 4)); 
//        // this will search reet from index 3, 3 is inclusive
//         // if a string doesn't match that we are searching for, it will return -1

//         // System.out.println(modifiedName.lastIndexOf('r')); // returns index of 
//         // r from last 

//         // System.out.println(modifiedName.lastIndexOf("lre")); // returns index of l
//         // i.e. 9

//         // System.out.println(modifiedName.lastIndexOf("lre", 7));
//         // it will search lre from last before index no. 7 

//         // System.out.println(modifiedName.equals(name)); // checks if a string's value 
//         // is equal or not, returns a boolean value
//         // System.out.println(modifiedName.equals("BalreetBalreet")); // returns true

//         // System.out.println(name.equalsIgnoreCase("balreet singh")); // ignores cases
//         // and checks just the value

//         // escape sequence characters
//         // \n means newline, \t means tab, \' for single quotes
//         // \\ for single backslash

//         // now to add double quotes in a string we have to use escape sequence
//         // otherwise compiler would be confused and throw an error
//         // System.out.println("I am \'Balreet\' Singh");



//     }
// }

// Strings Practice

public class A7_strings {

    public static void main(String[] args) {
        String name = "Balreet Singh";
        // System.out.println(name.toLowerCase());
        // System.out.println(name.replace(" ", "_"));
        // System.out.println("Dear " + name + ". Thanks a lot!");
        
       // String letter = "Dear <|name|>, Thanks a lot!";
       // System.out.println(letter.replace("<|name|>", name));

        // to check whether a string has double spaces or not, checks its index,
        // if it reuturns a value, then there are spaces otherwise returns -1

        System.out.println(name.indexOf("  "));

        // escape sequence for writing string into letter format
        System.out.println("\"Dear Harry,\n\tThis Java is course is very nice\nThanks!\"");
    }
}


