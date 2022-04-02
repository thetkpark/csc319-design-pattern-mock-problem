package FastFood.strategy;

import java.util.Random;

public class FastFood {
    protected GreetingBehavior greetingBehavior;
    protected CookingBehavior cookingBehavior;

    public void serveFood() {
        Random rnd = new Random();
        int callNumber = Math.abs(rnd.nextInt());
        greetingBehavior.greet();
        receiveOrder();
        returnInvoice(callNumber);
        cookingBehavior.cook();
        callTheNumber(callNumber);
    }

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
