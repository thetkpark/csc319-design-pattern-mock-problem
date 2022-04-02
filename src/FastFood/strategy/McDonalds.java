package FastFood.strategy;

public class McDonalds extends FastFood {
    public McDonalds() {
        this.cookingBehavior = new BurgerCooking();
        this.greetingBehavior = new McDonaldsGreeting();
    }
}
