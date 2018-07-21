import java.util.Scanner;

public class Diena2 {

	public static void main(String[] args) {
		//Uzrakstīt programmu, kura ievadē saņem divus teksta gabalus un izvada tos komibnētā formā:
		//Īsākais+garākais+īsākais, ja abi teksta gabali ir vienādā garuma, pieņemt, ka pirmais ir garākais.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ievadiet pirmo virkni");
		String pirmais = scanner.nextLine();
		System.out.println("Ievadiet otro virkni");
		String otrais = scanner.nextLine();
		
		if (pirmais.length() <= otrais.length()) {
			System.out.println(pirmais + otrais + pirmais);
		} else {
			System.out.println(otrais + pirmais + otrais);
		}
		
	}

}
