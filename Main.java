public class Main {

    public static void line() {
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        line();
        Car c = new Car(110, 80);
        c.calcFuelEff(c.speed, c.fuelLvl);
        line();
    }
}
