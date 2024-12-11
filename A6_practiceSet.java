public class A6_practiceSet {
    public static void main(String[] args) {
        // float a = 7/4*9/2; // same precendence so we will follow associativity
        // // 7, 4,9,2 all are of int datatype so their operation will be performed 
        // // as per int datatype i.e. 7/4 = 1
        // float b = 7/4.0f * 9/2; // here we wrote 4.0f so operations are performed as per float
        // System.out.println(a); 
        // System.out.println(b);
        // both have different outputs

        // program to encrypt grade by adding 8;

        // char grade = 'B';
        // now adding 8 to grade (char + integer will convert into integer)
        // grade += 8; // it will add 8 to ascii value and return the value that corresponds
        // to the grade += 8
        // or we can typecast to convert int grade (because we added 8 in it) to char grade
        // grade = (char)(grade+8); can be written like this as well
        // System.out.println(grade);

        // int a = 12;
        // // byte b = a; // even though 12 is in the range of byte, it will not implicitly convert
        // // int to byte because int has higher range than byte. so we use typecasting

        // byte b = (byte)a;
        // System.out.println(b);

        int a = 23;
        float b = a; // it will work because stores even decimal parts
        System.out.println(b);

        float c = 23.0f;
        int d = (int)c; // cannot convert into int implictly because int has shorter range (no decimal)
        // so we have to explictly typecast
        System.out.println(d);

    }
}

// PRACTICE SET

// float a = 7/4*9/2;  7, 4, 9, 2 all are integers so they will perform operation according
// to int datatype and answer will be in float i.e. 4.0
// if float a = 7/4.0f*9/2 then ans will be 7.85