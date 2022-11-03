package UserClass;
import CarLanos.CarLanos;


public class CarFromLanos extends CarLanos {


    public CarFromLanos(String brand, String model, double mileage, Integer maxxxSpeed) {
        super(brand, model, mileage, maxxxSpeed);
    }

    @Override
    public void maxSpeedMethod(int maxSpeed) {
        if(maxSpeed>400){
            System.out.println("Creation incorrect");
        }
        super.maxSpeedMethod(maxSpeed);
    }
}
