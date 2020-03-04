
package inheritance;

/**
 *
 * @author chand
 */
class NewTeacher{ 
    
    public void teaches(){
        System.out.println("Teacher is teaching");
    }
}

class NewStudent extends NewTeacher{
    
    public void listen(){
        System.out.println("Student is listening");
    }
}

class Principal extends NewStudent{
    
    public void evaluates(){
        System.out.println("Principal is evaluating");
    }
}

public class MultiLevel {
    
    public static void main(String args[]){
        
        Principal p1 =  new Principal();
        p1.teaches();
        p1.listen();
        p1.evaluates();
    }
    
}
