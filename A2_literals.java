package com.company;

public class A2_literals {
    public static void main(String[] args) {
        int age = 4;
        char ch = 'a'; // char literals are written in singlq quotes
        float money = 550.55f; // f is written to show that the variable is float literal by default it is double literal
        long number = 56666555545544455l; // by default it is of range, so we have to write l with it.
        // int, short, byte on the other hand get assigned themselves
        boolean a = true;
        System.out.println(ch + " " + age + " " + money + " " + number + " " + a);
    }
}

// we can estimate that in which range our variable would fit into a specific datatype
// like age can go till 100 approx so we can use byte age = 55; or can use int
// just check the minimum and maximum value of variable and assign that datatype

// a constant value which is assigned to a variable is called a literal
// int age = 34; its an integer literal

// primitive datatypes has a corresponding class of but not of Long datatype
// automatically variables are made in that corresponding class of datatypes