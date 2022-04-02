package FastFood.strategy;


public class Main {
    public static void main(String[] args) {
        FastFood kfc = new KFC();
        FastFood mc = new McDonalds();
        FastFood texas = new TexasChicken();

        kfc.serveFood();
        System.out.println();
        mc.serveFood();
        System.out.println();
        texas.serveFood();
    }
}
