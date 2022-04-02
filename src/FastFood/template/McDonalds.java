package FastFood.template;

public class McDonalds extends FastFood {
    @Override
    protected void greeting() {
        System.out.println("Welcome to McDonald’s");
    }

    @Override
    protected void cookFood() {
        System.out.println("Cooking burger...");
    }
}
