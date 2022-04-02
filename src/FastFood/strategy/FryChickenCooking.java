package FastFood.strategy;

public class FryChickenCooking implements CookingBehavior {
    @Override
    public void cook() {
        System.out.println("Frying chicken....");
    }
}
