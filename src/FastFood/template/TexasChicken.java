package FastFood.template;

public class TexasChicken extends FastFood {
    @Override
    protected void greeting() {
        System.out.println("Welcome to Texas Chicken");
    }

    @Override
    protected void cookFood() {
        System.out.println("Frying chicken....");
    }
}
