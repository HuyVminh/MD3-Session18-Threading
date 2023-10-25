package BaiTap.TimSoNguyenTo;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization factorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization factorizationOptimization = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(factorization);
        Thread thread2 = new Thread(factorizationOptimization);
        thread1.start();
        thread2.start();
    }
}
