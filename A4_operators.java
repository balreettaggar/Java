public class A4_operators {
    public static void main(String[] args) {
        int a = 4;
        int b = a+6; // = is an assignment operator means put valuse of a+6 in b;
        b += 3; // means b = b+3;
    }
}

// 3+2; '3' and '2' are operands and '+' is an operator
// operations are actions performed on two or more operands
// arithematic operator (+, -, *, /, %, ++, --);
// assignment operator (=, +=, -=)
// comparision operator (==, >=, <=) (returns true or false)
// logical operator (&&, ||, !)
// Bitwise operator (&, |) they convert the number into binary first then perform the operations

// --- PRECEDENCE --- //
// *,/ are given higher priority than +,-
// to change the precendence we can use parenthesis

// -- ASSOCIATIVITY
// when the operators are of same precedence then we will use associativity
// go left to right then, when same precedence

// a=b=45; this goes from right to left means first value of b equals 45 then a equals b i.e. 45