/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author chand
 */

class Name{
    String firstname;
    String middlename;
    String lastname;
    
    public Name(String firstname, String middlename, String lastname){
        this.firstname  = firstname;
        this.middlename = middlename;
        this.lastname   = lastname;
    }
}

class Student{
    int rollno;
    Name n;

    public Student(int rollno, Name n) {
        this.rollno = rollno;
        this.n = n;
    }
    
    public void displayInfo(){
        System.out.println("Student Info");
        System.out.println("Roll No: "+this.rollno);
        System.out.println("Full Name: " + n.firstname +" "+ n.middlename + " "+n.lastname);
    }
   
}

public class StudentInfo {
    
    public static void main(String args[]){
        
        Name n1 = new Name("Dipendra", "Bahadur", "Chand");
        Student s1 = new Student(2, n1);
        s1.displayInfo();
        
    }
    
}
