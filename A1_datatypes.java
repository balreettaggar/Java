package com.company;

public class A1_datatypes {
    public static void main(String[] args) {
        int a = 13;
        int b = 14;
        int c = 15;
        // int sum = a+b+c;
        System.out.println("Sum is : " + (a+b+c)); // it will behave as string concatenation because java consider
        // reading from left to right, thus string comes first so a+b+c is considered as string 
        // to fix this put parenthesis
        // println also adds a new line
    }
}

// variables are like containers to store values 
// the type of value stored can be determined by a datatype

// DATATYPES
// a) primitive and b) non-primitive

// primitive includes 
// byte, int, float, long, char, double, bool and short (8)
// byte stores a number from -128 to 127
// char stores a single character 
// bool stores true or false
// long =  a big integer and double contains a big floating number

// variables should not begin with a digit, are case senstive, should not be a keywords
// can contain underscore, dollar sign, alphabets and numbers but not white spaces

// non primtive datatypes are derived
// java is statically typed language, means we have to declare variables and their datatypes

// byte takes 1 byte and short takes 2 bytes, default values of both are zero
// int and float take 4 bytes, int def value = 0, float def value = 0.0f; (f is written to denote its a floating number)
// long takes 8 bytes and def value is 0;
// double takes 8 bytes and vlaue is 0.0d;
// char takes 2 bytes (0 to 2^16-1); (no neg values)
// char supports unicode, ascii character is a subset of unicode, def value is zero
// bool size depends on JVM, def value is false