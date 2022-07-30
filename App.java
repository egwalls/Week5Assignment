package Week5.Week5Assignment;

public class App {
    public static void main(String[] args) {

        Logger asterik = new AsterikLogger();
        Logger spaced = new SpacedLogger();


        asterik.log("Hello");
        asterik.error("Hello");

        spaced.log("Hello");
        spaced.error("Hello");

    }
    
}
