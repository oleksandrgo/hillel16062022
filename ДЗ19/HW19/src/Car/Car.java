package Car;

public class Car {
    public String brand;
    public String model;
    public int mileage;
    public int speed;

    public Car(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }
    public void validMileage(int mileage){
        if (mileage >=0 && mileage < 999999){
            System.out.println("Correct mileage " + mileage);
        } else {
            System.out.println("Incorrect mileage " + mileage);
        }
    }
    public void permissibleSpeed (int speed){
        if( speed <= 400 ) {
            System.out.println( "Permissible Speed OK " + speed);
        }else {
            System.out.println("Speeding" + speed);
        }
    }

}
