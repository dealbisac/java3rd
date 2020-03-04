
package inheritance;

public class Pulsar extends Bike{
    
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Pulsar(String name, String color, int milage) {
        super(color, milage);
        this.name = name;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Name :" + getName());
    }
    
    public static void main(String args[]){
        Pulsar p1 = new Pulsar("pulsar", "red", 40);
        p1.displayInfo();
    }
}
