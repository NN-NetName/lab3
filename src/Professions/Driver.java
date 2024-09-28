package Professions;

import People.Person;

public class Driver extends Person
{
    public Driver(String _name, int _age)
    {
        super(_name, _age);
    }
    public String toString()
    {
        return "name driver is " + name + ", age " + age + " ";
    }
}
