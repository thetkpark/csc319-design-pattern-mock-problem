package FastFood.strategy;

public class KFCGreeting implements  GreetingBehavior {
    @Override
    public void greet() {
        System.out.println("Welcome to KFC!");
    }
}
