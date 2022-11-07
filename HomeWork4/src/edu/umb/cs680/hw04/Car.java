package edu.umb.cs680.hw04;

public class Car
{
    private String make,model;
    private int mileage,year;
    private float price;
    public Car(String make, String model, int mileage, int year, float price)
    {
        super();
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }
    public String Make()
    {
        return make;
    }
    public String Model()
    {
        return model;
    }
    public int Mileage()
    {
        return mileage;
    }
    public int Year()
    {
        return year;
    }
    public float Price()
    {
        return price;
    }
    public static void main(String[] args)
    {
        Car car = new Car("Ertiga", "ZXI",39, 2019,12500);
    }
}