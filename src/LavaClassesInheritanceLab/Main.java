package LavaClassesInheritanceLab;
import java.io.IOException;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        Car myCar = new Car();

        System.out.println("Enter the name of the car");
        myCar.setDetails(reader.next());
        System.out.println("Enter the model of the car");
        myCar.setModel(reader.next());
        System.out.println("Enter the Speed of the car");
        myCar.setSpeed(Double.parseDouble(reader.next()));


        System.out.print(myCar.getDetails() + " " + myCar.getModel() + " " +myCar.getSpeed());

    }
}
