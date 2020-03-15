package lms;

/**
 *
 * @author chand
 */
public class Book {
    
    int id;
    String title;
    String publicaton;
    double price;

    public Book(int id, String title, String publicaton, double price) {
        this.id = id;
        this.title = title;
        this.publicaton = publicaton;
        this.price = price;
    }

    public Book(int id, String title, String publicaton) {
        this.id = id;
        this.title = title;
        this.publicaton = publicaton;
    }

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicaton() {
        return publicaton;
    }

    public void setPublicaton(String publicaton) {
        this.publicaton = publicaton;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
