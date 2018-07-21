
public class Diena1 {

	public static void main(String[] args) {
		
		//Pirmais - ievadē 2 skaitļi, izvada summu
		
//		int a = 5;
//		int b = 6;
//		
//		int rez = a + b;
//		System.out.println("Rezultaats = " + rez);
		
		
		//Otrais - ievadē 3 skaitļi, izvada vidējo
		
//		double x = 5;
//		double y = 6;
//		double z = 9;
//		
//		double avg = (x + y + z)/3;
//		
//		System.out.println("Rezultaats = " + avg);
		
		//Tresais - ievadē 2 skaitļi, 11-19 nav atļauts
//		
//		int pirmais = 1;
//		int otrais = 12;
//		
//		int rezultats = pirmais + otrais;
//		
//		if (rezultats >= 11 && rezultats <= 19) {
//			System.out.println("Rezultats = 20");
//		} else {
//			System.out.println("Rezultats = " + rezultats);
//		}

		//Ceturtais - PABEIGT!!
		
		int a = 1;
		int b = 1;
		int c = 1;
		int rez;
		
		if (a == b) {
			rez = a + c;
			System.out.println("Rezultāts = " + rez);
		} else if (a == c || b == c) {
			rez = a + b;
			System.out.println("Rezultāts = " + rez);
		} else if (a == b && b == c) {
			rez = 0;
			System.out.println("Rezultāts = " + rez);
		} else {
			rez = a + b + c;
			System.out.println("Rezultāts = " + rez);
		}
		
	}

}
