public interface FuelEfficiency {
    default void calcFuelEff(int speed, int fuelLvl) {
        float fuelEff = speed / fuelLvl;
        System.out.println(fuelEff);
    }
}
