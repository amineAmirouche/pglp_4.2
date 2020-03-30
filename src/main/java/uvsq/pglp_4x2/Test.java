package uvsq.pglp_4x2;
import java.util.Scanner;
public class Test {

	 
public static void main(String[] args) {
		
		
		MoteurRpn m = new MoteurRpn();
		m.executeCommand("2");
		m.executeCommand("3");
		m.executeCommand("5");
		m.executeCommand("x");
		m.executeCommand("+");
		System.out.println("Le total est: " + m.getContext().getTotal());
	
		
	
	
	
	
	
	
	}
		

}