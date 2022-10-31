package car;

public class CarHead {
    public String brand;
    public String model;
    public int mileage;
    public int maxspeed;

    public CarHead(String brand, String model, int mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }

    public void checkMileage(int mileage) {
            if (mileage >= 0 && mileage < 999999) {
                System.out.println("Correct mileage" + mileage);
            } else {
                System.out.println("Incorrect mileage" + mileage);
            }
        }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void checkMaxSpeed (int maxspeed){
        if (maxspeed<= 400){
            System.out.println("Normal speed" + maxspeed);
        }else {
            System.out.println("Speed above normal" + maxspeed);
        }
    }
}


