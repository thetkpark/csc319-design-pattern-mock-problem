package F1.strategy;

public class F1Car {
    private Tires tires;
    private Engine engine;

    public F1Car() {
    }

    public F1Car(Tires tires, Engine engine) {
        this.tires = tires;
        this.engine = engine;
    }

    public void printTriesCompound() {
        System.out.println(tires.getTireCompound());
    }

    public void printEngineManufacturer() {
        System.out.println(engine.getManufacturer());
    }

    public void printTopSpeed() {
        System.out.println(engine.getTopSpeed());
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
