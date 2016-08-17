import com.company.Door;
import com.company.Tire;

public class Car {
    private Tire[] wheels;
    private Door[] doors;
    private float weight;

    public Car (float weight, Tire[] wheels, Door[] doors) {
        this.weight = weight;
        this.wheels = wheels;
        this.doors = doors;
    }
    public float GetWeight() {

        float doorsWeight = 0;
        float wheelsWeight = 0;

        for (Tire wheel : wheels){
            wheelsWeight += wheel.GetWeight();
        }
        for (Door door : doors){
            doorsWeight += door.GetWeight();
        }

        return weight + wheelsWeight + doorsWeight;
    }
}