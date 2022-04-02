package FastFood.strategy;

public class TexasChickenGreeting implements GreetingBehavior {
    @Override
    public void greet() {
        System.out.println("Welcome to Texas Chicken");
    }
}
