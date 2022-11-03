package CarLanos;


public class CarLanos {

    private String  brand;

    private String  model;

    private double  mileage;

    private int  maxxxSpeed;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getMileage() {
        return mileage;
    }

    public Integer getMaxxxSpeed() {
        return maxxxSpeed;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public void setMaxxxSpeed(Integer maxxxSpeed) {
        this.maxxxSpeed = maxxxSpeed;
    }


    @Override
    public String toString() {
        return "SuperCar [ brand=" + brand + ", model =" + model + ", mileage =" + mileage
                + ", maxxxSpeed =" + maxxxSpeed + "]";
    }


    public CarLanos(String brand, String model, Double mileage, Integer maxxxSpeed) {
        this.brand = brand;
        this.model = model;
        mileageMethod(mileage);
        this.mileage = mileage;
        this.maxxxSpeed = maxxxSpeed;
    }


    public void mileageMethod(double mileage) {
        if (!(mileage >= 0.0 && mileage <= 999999.0)) {
            System.out.println("Your miliage - not correct");
        }
    }

    public void maxSpeedMethod(int maxxxSpeed) {
        if (maxxxSpeed>400) {
            System.out.println("Your maxxxSpeed - not correct");
        }
    }





}