package DZ19;

public class Car {
    public String Brand;
    public String Model;
    public int Mileage;

    public Car(String Brand, String Model, int Mileage) {
        this.Brand = Brand;
        this.Model = Model;
        this.Mileage = Mileage;
    }
    public void CarMileage(int Mileage){
        if (Mileage >= 0 && Mileage < 999999){
            System.out.println("Mileage ok" + Mileage);
        } else {
            System.out.println("Mileage false");
        }
    }
}
