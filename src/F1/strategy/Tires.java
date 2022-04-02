package F1.strategy;

public interface Tires {
    public String getTireCompound();
}

class SoftTires implements Tires {
    @Override
    public String getTireCompound() {
        return "Soft";
    }
}

class MediumTires implements Tires {
    @Override
    public String getTireCompound() {
        return "Medium";
    }
}

class HardTires implements Tires {
    @Override
    public String getTireCompound() {
        return "Hard";
    }
}