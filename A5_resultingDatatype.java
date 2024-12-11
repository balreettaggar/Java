public class A5_resultingDatatype {
    public static void main(String[] args) {
        // int a = 654 + 6; // resulting datatype of a will be integer, because we are adding 2 integers
        // int i = 55;
        // int b = i++; // means first value of i is assignmed to b then it is incremented
        // int c = ++i; // value of i is incremented first then it is used
        // System.out.println(i++); // first value of i is printed then it is incremented

        // int j = 7;
        // System.out.println(j++ * 8); // increment operators has higher precedence whether
        // it is j++ or ++j
        // so j++ is evaluated first then multiplied (8 * j++) will also give same result

        char a = 'a';
        System.out.println(++a); // it will print b
        // unicode of that character will be printed
        // z++ will print { (as per 123 unicode)

    }
}

// Resulting datatypes
// b+i = i (b = byte, i = int)
// s+i = i (s = short, i = int)
// l+f = f (l = long, f = float )
// i+f = f (i = int, f = float)
// c+i = i (c = char, i = int)
// c+s = i
// l+d = d long+double = double
// f+d = d

