//Dale King

public class Appointment
{
    protected int day, month, year;
    private String desc;
    
    //constructor
    public Appointment(int day, int month, int year, String desc)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.desc = desc;
    }
    
    //returns true if this appointment's day month and year are the same
    public boolean occursOn(int d, int m, int y)
    {
        return this.day == d && this.month == m && this.year == y;
    }
    
    //returns the appointment description
    public String getDesc()
    {
        return this.desc;
    }
}

