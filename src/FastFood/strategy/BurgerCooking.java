package FastFood.strategy;

public class BurgerCooking implements CookingBehavior {
    @Override
    public void cook() {
        System.out.println("Cooking burger...");
    }
}
