import java.util.*;

public class FibonacciAndFactorial {

    public static void main(String[] args) {

        System.out.println(fibonacci(3));
        System.out.println(factorial(3));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int n1 = fibonacci(n- 1);
            int n2 = fibonacci(n - 2);
            return n1 + n2;
        }
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
