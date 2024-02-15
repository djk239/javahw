//Dale King

public class Onetime extends Appointment
{
    //Constructor (no additional variables)
    public Onetime(int day, int month, int year, String desc)
    {
        super(day,month,year,desc);
    }
    
    @Override //override, (same as in appointment)
    public boolean occursOn(int d, int m, int y)
    {
        return this.getDay() == d && this.getMonth() == m && this.getYear() == y;
    }
}