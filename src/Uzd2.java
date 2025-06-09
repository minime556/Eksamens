import java.util.Scanner;

public class Uzd2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Abu tekstu ievade
		System.out.println("Ievadi 1. textu");
		String str1 = scan.nextLine();
		System.out.println("Ievadi 2. textu");
		scan.close();
		String str2 = scan.nextLine();
		//Savieno abas simbolu virknes
		String savienots = str1 + str2;
		//Pārveido savienoto simbolu virkni uz lielajiem burtiem
		System.out.println("Savienotais teksts ar lielajiem burtiem: \n"+savienots.toUpperCase());
		//Pārveido savienoto simbolu virkni uz mazajiem burtiem
		System.out.println("Savienotais teksts ar mazajiem burtiem: \n"+savienots.toLowerCase());
		//Pārbauda vai abas simbolu virknes ir vienādas
		System.out.println("Vai abi teksti ir vienādi: \n"+str1.equals(str2));
		//Nosaka savienotās simbolu virknes garumu
		System.out.println("Savienotā teksta garums ir: \n"+savienots.length());
	}

}
