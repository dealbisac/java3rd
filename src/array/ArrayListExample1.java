package array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chand
 */
public class ArrayListExample1 {
    
    public static void main(String args[]){
        
        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("Ram");
        namelist.add("Hari");
        namelist.add("Manish");
        namelist.add("Bijay");
        
       // System.out.println(namelist);
        
        //Iterator interface
        
        Iterator itr = namelist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
