
package array;

/**
 *
 * @author chand
 */
public class ArrayExample1 {
    
    public static void main(String args[]){
        
        //Array Declaration and Initialization
        
        int []a = {2, 3, 5, 6, 8, 9};
        double[] number = { 23.6, 65.8, 79.0, 54.9, 89.7, 98.7};
        String name[] = {"Ram", "Shyam", "Nabin", "Lamdiki", "Hari", "Mani"};
        
        //Array Showing using loop
        
        for(int i=0; i<5; i++){
            System.out.println(" "+a[i]);
            System.out.println(" "+name[i]);
            System.out.println(" "+number[i]);
        }
        
        System.out.println("for each loop");
        for(int i: a){
            System.out.println(" "+i);
        }
        
        for(String nayaname: name){
            System.out.println(nayaname);
        }
        
    }
    
}
