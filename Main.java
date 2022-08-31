public class Main {
    public static void main(String[] args) {
        company comp = new company(); 
        producers p = new producers(comp);
        consumer c = new consumer(comp);
        p.start();
        c.start();
    }
}
