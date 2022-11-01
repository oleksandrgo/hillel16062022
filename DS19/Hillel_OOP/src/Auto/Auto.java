package Auto;

public class Auto {
    public String brand;
    public String model;
    public int mileage;

    public void checkMileage() {
        if (this.mileage >= 0 && this.mileage <= 999999) {
        } else {
            System.out.println("Mileage is incorrect");
        }
    }


}
