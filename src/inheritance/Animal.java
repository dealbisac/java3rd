
package inheritance;

/**
 *
 * @author chand
 */
class Animals {
    
    public void sound(){
        System.out.println("Animal is making sound");
    }
    
}

class Lion extends Animals{
    
   @Override
    public void sound(){
        System.out.println("Lion is roaring");
    }
}

public class Animal{
    
    public static void main(String args[]){
        
        Animals a1 = new Lion();
        a1.sound();
        
    }

}
