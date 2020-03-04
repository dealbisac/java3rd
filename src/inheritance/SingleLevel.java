
package inheritance;

/**
 *
 * @author chand
 */
class Teacher{
    
    public void teaches(){
        System.out.println("Teacher is teaching");
    }
    
} // end of the class Teacher

class Student extends Teacher{
    
    public void listen(){
        System.out.println("Student is listening");
    }
} // end of the class Student


public class SingleLevel {
    
    public static void main(String args[]){
        
        Student s1 = new Student();
        s1.teaches();
        s1.listen();
    }
    
}
