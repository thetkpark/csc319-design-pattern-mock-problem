package FastFood.template;

public class KFC extends FastFood {
    @Override
    protected void greeting() {
        System.out.println("Welcome to KFC!");
    }

    @Override
    protected void cookFood() {
        System.out.println("Frying chicken....");
    }
}
