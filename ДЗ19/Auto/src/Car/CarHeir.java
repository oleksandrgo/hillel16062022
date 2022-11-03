package Car;

public class CarHeir extends Car{

    @Override
    public void validMileage(int mileage) {
        super.validMileage(mileage);
    }
    public CarHeir(String brand, String model, int mileage) {
        super(brand, model, mileage);
    }
    @Override
    public void permissibleSpeed(int speed) {
        if (speed <= 400) {
            System.out.println("Permissible Speed OK " + speed);
        } else {
            System.out.println("STOP!");
        }
    }
}
