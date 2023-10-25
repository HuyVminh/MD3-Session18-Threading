package BaiTap.TimSoNguyenTo;

import java.util.ArrayList;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int i = 3;
        while (true) {
            if (isPrime(i, primes)) {
                primes.add(i);
                System.out.println("OptimizedPrimeFactorization: " + i);
            }
            i++;
        }
    }

    private boolean isPrime(int n, ArrayList<Integer> primes) {
        int sqrtN = (int) Math.sqrt(n);
        for (int prime : primes) {
            if (prime > sqrtN) {
                break;
            }
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
