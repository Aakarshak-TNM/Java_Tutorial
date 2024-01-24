import java.math.BigInteger;

public class Big_Number {
    BigInteger x = new BigInteger("987654321123456789");
    BigInteger y = BigInteger.valueOf(987654321123456789L);
    BigInteger sum;
    BigInteger difference;
    BigInteger product;
    BigInteger quotient;
    BigInteger remainder;

    Big_Number(BigInteger x, BigInteger y) {
        this.x = x;
        this.y = y;
    }

    Big_Number() {
    }

    void arithmetic_operations() {
        sum = x.add(y);
        difference = x.subtract(y);
        product = x.multiply(y);
        quotient = x.divide(y);
        remainder = x.remainder(y);
    }

    void print() {
        arithmetic_operations();
        System.out.printf("%d%n%d%n%d%n%d%n%d", x, y, sum, difference, product, quotient, remainder);
    }
}
