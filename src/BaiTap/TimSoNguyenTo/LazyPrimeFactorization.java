package BaiTap.TimSoNguyenTo;

import java.util.ArrayList;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int i = 3;
        while (true) {
            if (isPrime(i, primes)) {
                primes.add(i);
                System.out.println("LazyPrimeFactorization: " + i);
            }
            i++;
        }
    }
    private boolean isPrime(int n, ArrayList<Integer> primes) {
        for (int prime : primes) {
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }
}
