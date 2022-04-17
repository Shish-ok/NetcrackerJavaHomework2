package comm.netcracker.homework2.ch1;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        BigInteger test = getFactorial(1000);
        System.out.println(test);
    }

    static BigInteger getFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}