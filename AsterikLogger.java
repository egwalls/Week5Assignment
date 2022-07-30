package Week5.Week5Assignment;

public class AsterikLogger implements Logger {

    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");
        
    }

    @Override
    public void error(String error) {
        System.out.println("**********************");
        System.out.println("*** ERROR: " + error + "***");
        System.out.println("**********************");
        
    }

    
}
