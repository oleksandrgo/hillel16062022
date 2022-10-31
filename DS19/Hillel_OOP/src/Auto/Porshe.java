package Auto;

public class Porshe extends Auto{

    public int maxSpeed;


    public void stop(){
        if (maxSpeed>400){
            System.out.println("STOP");
        }
    }

}
