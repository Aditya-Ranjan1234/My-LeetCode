import java.util.Arrays;

public class SieveOfEratosthenes {
    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int n = 30;
        boolean[] primes = sieve(n);
        for (int i = 2; i <= n; i++) {
            if (primes[i]) System.out.print(i + " ");
        }
    }
}
