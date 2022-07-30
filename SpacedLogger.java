package Week5.Week5Assignment;

public class SpacedLogger implements Logger {

    @Override
    public void log(String log) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < log.length(); i++){
            result = result.append(log.charAt(i));
            if (i == log.length()-1){
                break;
            } result = result.append(' ');
        }
        System.out.println(result.toString());
        
    }

    @Override
    public void error(String error) {
        StringBuilder result = new StringBuilder("ERROR: ");
        for (int i = 0; i < error.length(); i++) {
            result = result.append(error.charAt(i));
            if (i == error.length() - 1) {
                break;
            }
            result = result.append(' ');
        }
        System.out.println(result.toString());
        
    }
    
}
