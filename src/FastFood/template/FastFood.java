package FastFood.template;

import java.util.Random;

public abstract class FastFood {
    public void serveFood() {
        Random rnd = new Random();
        int callNumber = Math.abs(rnd.nextInt());
        greeting();
        receiveOrder();
        returnInvoice(callNumber);
        cookFood();
        callTheNumber(callNumber);
    }

    abstract protected void greeting();
    abstract protected void cookFood();

    protected void receiveOrder() {
        System.out.println("What do you want?");
    }

    protected void returnInvoice(int n) {
        System.out.println("Your number is " + n + ". We'll call your number when order is ready");
    }

    protected void callTheNumber(int n) {
        System.out.println("Order number " + n + " is ready");
    }
}
