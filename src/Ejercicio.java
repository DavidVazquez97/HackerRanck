import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int cuenta = 0; 
		
		while (entrada.hasNext()) {
			cuenta++;
			System.out.println(""+cuenta+" "+entrada.nextLine());
		}
	

	}

}
