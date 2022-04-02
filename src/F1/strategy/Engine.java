package F1.strategy;

public interface Engine {
    public String getManufacturer();
    public String getTopSpeed();
}

class MercedesEngine implements Engine {
    @Override
    public String getManufacturer() {
        return "Mercedes";
    }

    @Override
    public String getTopSpeed() {
        return "350km/h";
    }
}

class FerrariEngine implements Engine {
    @Override
    public String getManufacturer() {
        return "Ferrari";
    }

    @Override
    public String getTopSpeed() {
        return "370km/h";
    }
}