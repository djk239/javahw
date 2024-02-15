//Dale King

public class Daily extends Appointment
{
    //Constructor
    public Daily(int day, int month, int year, String desc)
    {
        super(day,month,year,desc);
    }
    
    @Override //returns true always (daily)
    public boolean occursOn(int d, int m, int y)
    {
        return true;
    }
}
//I updated this according to the provided "HW2.zip" on the assignment
//Where it says to check the day in this subclass?
//However if it is an appointment that occurs daily is that not every day?
//Therefore always true?
//The above solution is more inline with a "monthy" appointment
//Where an apointment occurs on a day of the month such as
// 1/2/24
// 2/2/24
// 3/2/24
// Where true if the day is the same but month changes