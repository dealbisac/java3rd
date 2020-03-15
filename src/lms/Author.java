
package lms;

/**
 *
 * @author chand
 */
public class Author {
    
    String name;
    int age;
    String genre;

    public Author(String name, int age, String genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
    }

    public Author(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
}
