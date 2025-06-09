import java.util.Scanner;

public class Uzd1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Simbola ievade
		System.out.println("Ievadi vienu simbolu");
		char simbols = scan.next().charAt(0);
		scan.close();
		
        //Pārbauda vai simbols ir burts
		if(Character.isLetter(simbols)) {
			
			//Pārbauda vai tas ri lielais burts
			if(Character.isUpperCase(simbols)) {
				System.out.println("Simbols ir lielais burts");
			}else {
				System.out.println("Simbols ir mazais burts");
			}
			//Pārbauda vai simbols ir cipars
		}else if(Character.isDigit(simbols)) {
			System.out.println("Simbols ir cipars");
		}
		else {
			System.out.println("Simbols nav ne cipars ne burts");
		}
	}
}
