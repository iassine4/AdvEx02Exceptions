import java.util.Date;
//import java.sql.Date;

public class FoundException {

	public static void main(String[] args) {
		
		Date date = null;
        Date today = new Date();
        
        try {
        	System.out.println(date.getClass().getName());
        }catch(Exception e) {
        	System.out.println("Erreure la date est null, et je passe à l'instruction suivante");
        }
        
        System.out.println(today.getClass().getName());
        
        
        //Tester null
   /*     if (date != null) {
            System.out.println(date.getClass().getName());
        } else {
            System.out.println("date est null");
        }

        System.out.println(today.getClass().getName());
    */
	}

}
