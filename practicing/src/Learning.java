import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*JAVA VARIABLES
        -----------------------------------------
        String=stores text/
        ex:*/
        String cherry = "snoopy";
        System.out.println("-------String example-----");
        System.out.println(cherry);

        //int=store integers
        int me = 18;
        System.out.println("----------Integer Example---------");
        System.out.println(me);
        //float=stores floating point numbers
        float num1 = 10.5F;
        System.out.println("----------Float example-----");
        System.out.println(num1);
        //double=stores both int and float numbers
        double num2 = 10.6;
        System.out.println("----------Double example-----");
        System.out.println(num2);
        //char=stores single characters, such as 'A' or 'B'
        char single = 'b';
        System.out.println("----------Character example-----");
        System.out.println(single);
        //boolean=stores values with two states:true or false
        boolean lol = true;
        System.out.println("----------Boolean Example-----");
        System.out.println(lol);


        //Primitive data types
        /* byte
        The byte data type is an 8-bit signed two's complement integer.
        It has a minimum value of -128 and a maximum value of 127 (inclusive).
        */

        /*short
        The short data type is a 16-bit signed two's complement integer.
        It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        */

        /*int
        By default, the int data type is a 32-bit signed two's complement integer,
        which has a minimum value of -2^31 and a maximum value of 2^31-1.
        */

        /*long
        The long data type is a 64-bit two's complement integer.
        The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.
         In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long,
         which has a minimum value of 0 and a maximum value of 2^64-1 .
         */

       /*double
     The double data type is a double-precision 64-bit IEEE 754 floating point.
     Its range of values is beyond the scope of this discussion,
     but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification.
     For decimal values, this data type is generally the default choice.
     As mentioned above, this data type should never be used for precise values, such as currency.
 */

//JAVA TYPE CASTING
//WIDENING CASTING
//byte->short->char->int->long->float->double
        System.out.println("--------Widening casting---------");
        System.out.println("Please enter the value of an integer:  ");
        int integer = scanner.nextInt();
        System.out.println("the " + integer + " in double is " + (double) integer);
        scanner.nextLine();

//NARROWING CASTING
//double->float->long->int->char->short->byte
        System.out.println("-------------Narrowing casting-----------");
        System.out.println("Please enter the value of a number in double:");
        double number = scanner.nextDouble();
        int num = (int) number;
        System.out.println("The double " + number + " is " + num + " in integer.");

        //ARITHMETIC OPERATORS
        //+ - addition
        //- - subtraction
        //* -multiplication
        // / - division
        // % - modulus(returns the division reminder.)
        // ++ - increment(increases the value of variables by 1)
        // -- - decrement(decreases the value of a variable by 1)

        //ASSIGNMENT OPERATORS
        //=
        //+=
        //-=
        //*=
        // /=
        //%=
        System.out.println("------- bitswise AND operation - &=------");
        //&= -  is a compound assignment operator that performs a bitwise AND operation between the variable on the left and the value on the right, and then assigns the result back to the variable on the left.
        //The operation works by comparing each bit position in both numbers:
        //
        //If both bits are 1, the result bit is 1
        //Otherwise, the result bit is 0
        //ex:
        int a = 5;    // binary: 0101
        a &= 3;       // binary: 0011
        // This is equivalent to: a = a & 3
        System.out.println(a); // Result: a = 1 (binary: 0001)

        System.out.println("------- bitswise OR operation - |=------");
        // |= -s a compound assignment operator that performs a bitwise OR operation between the variable on the left and the value on the right, then assigns the result back to the variable on the left.
        //The bitwise OR operation works by comparing each bit position in both numbers:
        //
        //If either bit is 1 (or both are 1), the result bit is 1
        //Only if both bits are 0, the result bit is 0
        //ex:
        int b = 5;    // binary: 0101
        b |= 3;       // binary: 0011
        // This is equivalent to: a = a | 3
        System.out.println(b);// Result: a = 7 (binary: 0111)

        System.out.println("------- bitswise XOR operation - ^=------");
        //^= - is a compound assignment operator that performs a bitwise XOR (exclusive OR) operation between the variable on the left and the value on the right, then assigns the result back to the variable on the left.
        //The bitwise XOR operation works by comparing each bit position in both numbers:
        //
        //If the bits are different (one is 0 and one is 1), the result bit is 1
        //If the bits are the same (both 0 or both 1), the result bit is 0
        //ex:
        int c = 5;    // binary: 0101
        c ^= 3;       // binary: 0011
        // This is equivalent to: a = a ^ 3
        System.out.println(c);// Result: a = 6 (binary: 0110)

        System.out.println("------- >>= operation ------");
        //>>= - is a compound assignment operator that performs a signed right shift operation on the variable on the left by the number of positions specified on the right, then assigns the result back to the variable on the left.
        //The signed right shift (>>) moves all bits to the right by the specified number of positions.
        // As bits are shifted right, the leftmost positions are filled with the sign bit (the leftmost bit).
        // For positive numbers, this means 0s are inserted on the left. For negative numbers, 1s are inserted to preserve the sign.
        //Key points about >>=:
        //
        //It performs division by powers of 2 (e.g., x >>= 1 is similar to x /= 2)
        //It preserves the sign of the number
        //For negative numbers, the sign extension occurs (leftmost positions filled with 1s)
        //Only works with integer types (byte, short, int, long, char)
        //ex:
        int d = 16;    // binary: 00010000
        d >>= 2;       // Shift right by 2 positions
        // This is equivalent to: a = a >> 2
        System.out.println(d);// Result: a = 4 (binary: 00000100)


        System.out.println("------- <<= operation ------");
        //<<= - is a compound assignment operator that performs a left shift operation on the variable on the left by the number of positions specified on the right, then assigns the result back to the variable on the left.
        //The left shift (<<) moves all bits to the left by the specified number of positions. As bits are shifted left:
        //
        //New bits (always 0s) are added on the right side
        //Bits that "fall off" the left end are discarded
        //
        //Key points about <<=:
        //
        //It performs multiplication by powers of 2 (e.g., x <<= 1 is similar to x *= 2)
        //Each shift left position multiplies the value by 2
        //It only works with integer types (byte, short, int, long, char)
        //For very large shifts or shifts of negative values, behavior follows Java's rules for the << operator
        //ex:
        int e = 3;    // binary: 0011
        e <<= 2;      // Shift left by 2 positions
        // This is equivalent to: a = a << 2
        System.out.println(e);// Result: a = 12 (binary: 1100)

        //LOGICAL OPERATORS
        System.out.println("------- logical and operation - &&- ------");
        //&& -  logical and - returns true if both statements are true
        int x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

        System.out.println("------- logical or operation - ||- ------");
        // || - logical or- returns true if one of the statements is true
        int y = 5;
        System.out.println(y > 3 || y < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

        System.out.println("------- logical not operation -! - ------");
        //! -  logical not - reverse the result, returns false if the result is true
        int z = 5;
        System.out.println(!(z > 3 && z < 10)); // returns false because ! (not) is used to reverse the result


        System.out.println("------concatenate two strings .concat()------");
        // concat is the method to concatenate two strings
        String firstName="Mariam";
        String lastName="Gamishidze";
        System.out.println(firstName.concat(" ").concat( lastName));

        //String-special characters
        System.out.println("-------String-special charchters---------");
        //if we want to quote something in string we are using following
        /* ---- \' for single quote*/ System.out.println("this is for \'single qoute\' ");
        /* ---- \" for double qoute */ System.out.println("this is for \"double qoute\"  ");
        /* ---- \\ for backslash*/  System.out.println("this is \\ backslash");

        // \n - new line
        System.out.println("------new line \"\\n\" - ---------");
        System.out.println("Hello\nWorld!");

        System.out.println("Hello\rWorld!");
        //bolos gavcherdi java strings-special charachters












    }
}


