//Dale King

public class Daily extends Appointment
{
    //Constructor
    public Daily(int day, int month, int year, String desc)
    {
        super(day,month,year,desc);
    }
    
    @Override //trturns true always (daily)
    public boolean occursOn(int d, int m, int y)
    {
        return true;
    }
}