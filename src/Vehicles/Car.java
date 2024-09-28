package Vehicles;

import Details.Engine;
import Professions.Driver;

public class Car
{
    protected Driver driver;
    protected Engine engine;
    protected String CarClass;
    protected String Marka;
    public Car(String _marka, String _carClass, String _driverName, int _driverAge, String _engineCompany, int _enginePower)
    {
        this.driver = new Driver(_driverName, _driverAge);
        this.engine = new Engine(_engineCompany, _enginePower);
        this.CarClass = _carClass;
        this.Marka = _marka;
    }
    public void start()
    {
        System.out.println("Поехали");
    }
    public void turnLeft()
    {
        System.out.println("Поворот налево");
    }
    public void turnRight()
    {
        System.out.println("Поворот направо");
    }
    public void stop()
    {
        System.out.println("Останавливаемся");
    }
    public String toString()
    {
        return engine.toString() + driver.toString() + "CarClass: " + CarClass + ", Marka: " + Marka;
    }
}
