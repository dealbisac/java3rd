
package inheritance;

/**
 *
 * @author chand
 */
public class Bike {
    
    String color;
    int milage;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    
Bike(String color, int milage){
    this.color = color;
    this.milage = milage;
}

public void displayInfo(){
    System.out.println("Color : " + getColor());
    System.out.println("Milage : " + getMilage());
}  
    
}
