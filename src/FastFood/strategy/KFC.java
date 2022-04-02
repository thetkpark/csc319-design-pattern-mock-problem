package FastFood.strategy;

public class KFC extends FastFood {
    public KFC() {
        this.cookingBehavior = new FryChickenCooking();
        this.greetingBehavior = new KFCGreeting();
    }
}
