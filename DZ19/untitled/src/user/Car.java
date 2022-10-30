package user;

public class Car {
    private String brand;
    private String model;
    private int mileage;
    private int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String model, int mileage, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        mileageCorrect(mileage);
        this.mileage = mileage;
        maxSpeedCorrect(maxSpeed);
        this.maxSpeed = maxSpeed;
    }
    public void mileageCorrect(int mileage) {
        if (!(mileage >= 0 && mileage <= 999999)) {
            System.out.println("mileage not correct");
        }
    }
    public void maxSpeedCorrect(int maxSpeed) {
        if (maxSpeed>400) {
            System.out.println("MaxSpeed not correct");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}


