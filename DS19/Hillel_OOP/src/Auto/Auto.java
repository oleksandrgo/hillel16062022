package Auto;

public class Auto {
    public String brand;
    public String model;
    public int mileage;

    public boolean isMileageCorrect(){
        if(mileage>0 && mileage<999999){
            return true;
        }
        return false;
    }


}
