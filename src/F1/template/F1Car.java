package F1.template;

public abstract class F1Car {
    abstract public void printTriesCompound();
    abstract public void printEngineManufacturer();
    abstract public void printTopSpeed();
}

class F1CarMercedesEngineSoftTires extends F1Car {
    @Override
    public void printTriesCompound() {
        System.out.println("Soft");
    }

    @Override
    public void printEngineManufacturer() {
        System.out.println("Mercedes");
    }

    @Override
    public void printTopSpeed() {
        System.out.println("350km/h");
    }
}
