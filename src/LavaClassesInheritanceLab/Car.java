package LavaClassesInheritanceLab;

public class Car extends Vehicle {
    private String carName;

    public Car(String carName, String model, double speed) {
        super(model, speed);
        setDetails(carName);
    }

    public Car() {
        
    }

    public void setDetails(String carName){
        this.carName = carName;
    }

    public String getDetails() {
        return this.carName;
    }

}