
package interfaceexample;

/**
 *
 * @author chand
 */

class Lion implements Animal{

    @Override
    public void sound() {
        System.out.println("Lion is roaring");
    }

    @Override
    public void walk() {
        System.out.println("Lion is walking");
    }
    
    public void laugh(){
        System.out.println("Lion is walking");
    }
    
}

public class MainAnimal {
    
    public static void main(String args[]){
        
        Lion l1 = new Lion();
        l1.sound();
        l1.walk();
        l1.laugh();
    }
    
}
