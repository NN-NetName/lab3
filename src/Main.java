import Details.Engine;
import Professions.Driver;
import Vehicles.Car;
import Vehicles.Lorry;

public class Main
{
    public static void main(String[] args)
    {
        Driver driver = new Driver("John", 23);
        System.out.println(driver.toString());
        Engine engine = new Engine("Ford", 1500);
        System.out.println(engine.toString());
        Car car = new Car(
                "BMW",
                "Comfort",
                "Smith",
                39,
                "Audi",
                1200);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        System.out.println(car.toString());
        Lorry lorry = new Lorry(
                120,
                "Kamaz",
                "Industrial",
                "Petrovich",
                20,
                "Vaz",
                2000);
        System.out.println(lorry.toString());
    }
}