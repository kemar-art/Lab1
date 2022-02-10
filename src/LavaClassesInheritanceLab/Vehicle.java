package LavaClassesInheritanceLab;

public class Vehicle {
    //Private VariableHun
    private String model;
    private double speed;

    // Constructor
    public Vehicle(){

    }
    //Parameterize Constructor
    public Vehicle(String model, double speed){
        setModel(model);
        setSpeed(speed);
    }

    public Vehicle(String model) {
    }

    public Vehicle(double speed) {
    }

    // Setters and Getters below
    public String getModel(){
        return model;
    }

    public double getSpeed(){
        return speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
