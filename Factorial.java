import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        int n = 100;

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}