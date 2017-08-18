package javagitprojects;
import java.util.Scanner;

public class GreetingScanner {
	
	    public static void main(String[] args) {
	        String dream;
	        String currentState;
	        
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter your dream job   (engineer/doctor)");
	        dream = s.nextLine();
	        
	        System.out.println("Enter your current state(engineering/medical)");
	        currentState = s.nextLine();
	        
	        if(dream.equalsIgnoreCase("engineer")){
	            if(currentState.equals("engineering"))
	                System.out.println("You are almost there... Keep up with the new technology..");
	            else if(currentState.equalsIgnoreCase("medical"))
	                System.out.println("Why did u join medical when you want to be an engineer in the first place???!!");
	        }
	        else if(dream.equalsIgnoreCase("doctor"))
	        {
	            if(currentState.equals("engineering"))
	                System.out.println("Why did u join enginering when you want to be a doctor in the first place???!!");
	            else if(currentState.equalsIgnoreCase("medical"))
	                System.out.println("You are almost there... Keep up with the new medical breakthroughs..");
	        }
	            
	    }
	    
	}
}
