package FastFood.strategy;

public class TexasChicken extends FastFood {
    public TexasChicken() {
        this.cookingBehavior = new FryChickenCooking();
        this.greetingBehavior = new TexasChickenGreeting();
    }
}
