//Dale King

public class Appointment
{
    private int day, month, year;
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
    
    //Getters to return privare variables
    public String getDesc()
    {
        return this.desc;
    }
    public int getDay()
    {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }
}

