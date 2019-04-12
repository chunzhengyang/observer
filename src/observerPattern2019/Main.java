package observerPattern2019;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Publisher publisher = new Publisher();
        Observer observer1 = new Observer("Observer 1");
        Observer observer2 = new Observer("Observer 2");
        publisher.register(observer1);
        publisher.register(observer2);
        int count = 0;
        while (true) {
            count++;
            publisher.setState(count);
            Thread.sleep(1000);
        }
    }
}
