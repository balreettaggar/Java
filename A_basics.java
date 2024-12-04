// name of class is same as file name that we have named
// class name cannot begin with a digit

package com.company; // it is used to define the package tha a class belongs 
// package is like a folder where classes are stored, helps us to avoid name conflicts and easier to maintain
// com is a top level package then comapany is a subpackage inside com
// if we dont use package then our class will be stored in default package, but for larger projects we should 
// make packages
// we can give any valid name to packages but it should follow a convention
// package package_name // package is a keyword to declare and package_name can contain letters, number underscore, dollar sign($) 
// but cannot start with a digit, by convention package names are in lowercase
// we can use dots also to represent heirarchy
// like package.com.company has a path of project_root/com/company/a_basics.java (it helps us to maintain our code)
// also dont use special keywords in packages

public class A_basics { // name of class will be same as our file name
    // cuz java is purely oop, so everything is written inside classes

    public static void main(String[] args) { // this is a default function named main() and we code write inside function
        System.out.println("Balreet"); // println is a command to print output
    }
}

// functions = a block of code that is executed
// and a class is collection of methods and functions (will read in detail)
// classes are like blueprints and objects are instances of classes 
// we have to make object of class to run the program
// void of function tells us that it doesn't return anything when function is called/invoked
// pubic is access modifier means the method of class can be accessed anywhere
// static makes it possible to run the program in class itself without making object
// if we want our class method to exist independently that static is used
// (string[] args) are the arguments will study later

// NAMING CONVENTIONS
// for classes PascalConvention (first letter should be uppercase)
// for functions we use camelCaseConvention