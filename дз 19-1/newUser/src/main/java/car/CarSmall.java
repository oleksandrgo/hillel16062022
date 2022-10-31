package car;

public class CarSmall extends CarHead {
    public int maxspeed;

    public CarSmall(String brand, String model, int mileage) {
        super(brand, model, mileage);
    }


    @Override
    public void checkMaxSpeed(int maxspeed) {
        if (maxspeed <= 400) {
            System.out.println("Normal speed");
        } else {
            System.out.println("STOP");


        }
    }
}