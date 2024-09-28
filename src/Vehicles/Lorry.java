package Vehicles;

public class Lorry extends Car
{
    protected int carrying;
    public Lorry(int _carrying, String _marka, String _carClass, String _driverName, int _driverAge, String _engineCompany, int _enginePower)
    {
        super(_marka, _carClass, _driverName, _driverAge, _engineCompany, _enginePower);
        this.carrying = _carrying;
    }
    public String toString()
    {
        return engine.toString() + driver.toString() + "CarClass: " + CarClass + ", Marka: " + Marka + " This lorry can carry: " + carrying;
    }
}
