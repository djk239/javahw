public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
    public static double average(Measurable[] objects)
    {
        //Variables
        double FILTER = 1000.00; // Chanage to change filter by number
        
        double sum = 0;
        int count = 0;
        
        Filter filter;
        filter = new BankAccount();
        for (Measurable obj : objects)
        {
            //Checks for bankaccount to ensure only bank accounts are
            //being filtered
            if(obj instanceof BankAccount)
            {
                //new filter object
                filter = new BankAccount(obj.getMeasure());
                //filter checks
                if(filter.Accept(FILTER)){
                    sum = sum + obj.getMeasure();
                    count++;
                }
            }
            //for measurable objects other than bankaccounts
            else
            {
                sum = sum + obj.getMeasure();
                count++;
            }
        }
        if (objects.length > 0)
        { 
            return sum / count;
        }
        else 
        {
            return 0;
        }
    }
}
