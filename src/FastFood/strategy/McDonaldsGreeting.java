package FastFood.strategy;

public class McDonaldsGreeting implements GreetingBehavior {
    @Override
    public void greet() {
        System.out.println("Welcome to McDonald’s");
    }
}
