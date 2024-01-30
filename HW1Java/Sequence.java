import java.util.ArrayList;
public class Sequence {
    private ArrayList<Integer> values;
    public Sequence() 
    {
        values = new ArrayList<Integer>(); 
    } 

    public void add(int n)
    {
        values.add(n);
    }

    public String toString()
    { 
        return values.toString();
    }
    
    public Sequence append(Sequence other) //Append method : Adds one sequence to another (Ex: A =[1,2] B =[3,4] -> [1,2,3,4]
    {
        Sequence newSec = new Sequence();
        for (int val : this.values) //Loops over all values in this sequence and adds the value to the new sequence
        {
            newSec.add(val);
        }
        for (int val : other.values) //other sequence
        {
            newSec.add(val);
        }
        
        return newSec;
    }
    
    public Sequence merge(Sequence other) //Merge method : Merges two sequences (Ex: A =[1,2,3] B = [4,5,6] -> [1,4,2,5,3,6]
    {
        Sequence newSec = new Sequence();
        int index1 = 0;
        int index2 = 0;
        
        while(this.values.size() > index1 || other.values.size() > index2)  //Loop remains active while there is still values to be checked
        {
            if(this.values.size() > index1) //Check for end of sequence, if not the end then add the value
            {
                newSec.add(this.values.get(index1));
                index1++;
                
            }
            if(other.values.size() > index2)
            {
                newSec.add(other.values.get(index2));
                index2++;
            }
        }
        return newSec;
    }
    
    public Sequence mergeSorted(Sequence other) {       //Merge Sorted method : Merges two sorted sequences (for the longest sorted prefix)
        Sequence mergedSequence = new Sequence();       //(Ex: A =[20,22,15] B =[1,2,3] -> [1,2,3,20,22,15]
        int index1 = 0;
        int index2 = 0;

        while (index1 < this.values.size() && index2 < other.values.size()) { //Loop remains active for the longest seqeunce size
            
            if (this.values.get(index1) <= other.values.get(index2)) //Check for proper sorting and add to sequence
            {
                mergedSequence.add(this.values.get(index1));
                index1++;
            } 
            else 
            {
                mergedSequence.add(other.values.get(index2));
                index2++;
            }
        }

        mergedSequence.values.addAll(this.values.subList(index1, this.values.size())); //Remaining values are added
        mergedSequence.values.addAll(other.values.subList(index2, other.values.size()));

        return mergedSequence;
    }
}
    