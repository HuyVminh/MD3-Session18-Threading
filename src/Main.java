public class Main extends Thread {
    public Main(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        Thread thread1 = new Main("thread1");
    }
}
