import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;

public class FirstJava {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        
//      "new" is declared to create objects
        Date today = new Date();
        System.out.println("Today date is: " + today.toString());
         
        String idiom = System.getProperty("user.language"); 
        System.out.println("Your system language is: " + idiom);
        
        String country = System.getProperty("user.country");
        System.out.println("Your system location is: " + country);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        String screenResolution = screenSize.getWidth() + " x " + screenSize.getHeight();
        System.out.println(screenResolution);
        
    }
}
