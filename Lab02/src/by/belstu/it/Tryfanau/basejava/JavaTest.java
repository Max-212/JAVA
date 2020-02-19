package by.belstu.it.Tryfanau.basejava;
import java.sql.ResultSet;

import static java.lang.Math.*;

public class JavaTest {

    static int testStaticInt;
    final int Const1 = 27;
    public final int Const2 = 1994;
    public static final int Const3 = 2028;


    public static void main(String[] args) {

        char testChar = 'q';
        int testInt = 158;
        short testShort = 17;
        byte testByte = 16;
        long testLong = 2487;
        boolean testBool = true;
        var testVar1 = 9223372036854775807L;
        var testVar2 = 0x7fff_ffff_fffL;
        char testChar2 = 'a';
        char testChar3 = 97;
        char testChar4 = '\u0061';


        System.out.println(testInt + "testString");
        System.out.println(7.03 + "testString");
        testByte += testInt;
        System.out.println(testByte);
        System.out.println(testStaticInt);
        System.out.println(testBool^true);
        System.out.println(testVar1 + "\n" + testVar2);
        System.out.println(testChar2 + testChar3 + testChar4);
        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println(PI);
        System.out.println(round(E));
        System.out.println(min(PI, E));
        System.out.println(Math.random());
        Typetester.printType(testVar1);


        int unBoxingInt = 9;
        Integer boxingInt = new Integer(unBoxingInt);
        unBoxingInt = boxingInt.intValue() + 8;
        System.out.println(unBoxingInt);

        System.out.println(Integer.parseInt("896")+ 2);

        char [][]c1 = new char[3][4];

        for (char[] tri: c1)
        {
            for (char fonov: tri)
            {
                fonov = 'a';
            }
        }

        for (char[] tri: c1)
        {
            for (char fonov: tri)
            {
                System.out.println(fonov);
            }
        }
        WrapperString.anon anonimys= new WrapperString.anon();

    }




}
