package DZ19;

public class Heir extends Car{
    int maxSpeed = 400;
    public Heir(String Brand, String Model, int Mileage) {
        super(Brand, Model, Mileage);

    }
    public void carSpeed(int Speed){
        if (maxSpeed <= 400) {
            System.out.println("ok" + Speed);
        } else {
            System.out.println("Stop");
        }
    }
}


