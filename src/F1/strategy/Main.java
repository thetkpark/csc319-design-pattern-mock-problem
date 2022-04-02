package F1.strategy;

public class Main {
    public static void main(String[] args) {
        F1Car mercedesCar = new F1Car();
        mercedesCar.setEngine(new MercedesEngine());
        mercedesCar.setTires(new SoftTires());
        mercedesCar.printEngineManufacturer();
        mercedesCar.printTopSpeed();
        mercedesCar.printTriesCompound();
        System.out.println();

        F1Car ferrariCar = new F1Car(new HardTires(), new FerrariEngine());
        ferrariCar.printEngineManufacturer();
        ferrariCar.printTopSpeed();
        ferrariCar.printTriesCompound();
        System.out.println("---Change Tires to Medium---");
        ferrariCar.setTires(new MediumTires());
        ferrariCar.printTriesCompound();
        System.out.println();

        F1Car mclarenCar = new F1Car(new MediumTires(), new MercedesEngine());
        mclarenCar.printEngineManufacturer();
        mclarenCar.printTopSpeed();
        mclarenCar.printTriesCompound();
    }
}
