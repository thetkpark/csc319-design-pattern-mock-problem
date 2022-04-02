package FastFood.template;

public class Main {
    public static void main(String[] args) {
        FastFood kfc = new KFC();
        FastFood mc = new McDonalds();
        FastFood texas = new TexasChicken();

        kfc.serveFood();
        System.out.println("\n");
        mc.serveFood();
        System.out.println("\n");
        texas.serveFood();
    }


}
