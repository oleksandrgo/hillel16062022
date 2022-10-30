package user;

public class Car_2 extends Car{

    public Car_2(String brand, String model, int mileage, int maxSpeed) {
        super(brand, model, mileage, maxSpeed);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed>400){
            System.out.println("СТОП!");
        }
        super.setMaxSpeed(maxSpeed);
    }
}

