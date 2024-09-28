package Details;

public class Engine
{
    private String company;
    private int power;
    public Engine(String _company, int _power)
    {
        this.company = _company;
        this.power = _power;
    }
    public String toString()
    {
        return "Company engine: " + company + ", power = " + power + " ";
    }
}
