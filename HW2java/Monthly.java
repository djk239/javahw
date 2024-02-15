//Dale King

public class Monthly extends Appointment
{
    //Constructor (no additional variables)
    public Monthly(int day, int month, int year, String desc)
    {
        super(day,month,year,desc);
    }
    
    @Override //override, returns true if the day is the same (monthly)
    public boolean occursOn(int d, int m, int y)
    {
        return this.getDay() == d;
    }
}