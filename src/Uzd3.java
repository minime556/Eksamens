import java.util.Scanner;

public class Uzd3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Teikuma ievade
        System.out.print("Ievadi teikumu: ");
        String teksts = scan.nextLine();

        // Skaitītāji
        int lielieBurti = 0;
        int mazieBurti = 0;
        int cipari = 0;
        int atstarpes = 0;
        int specialie = 0;

        // Cikls kas iziet katram simbolam
        for (int i = 0; i < teksts.length(); i++) {
            char simbols = teksts.charAt(i);
            //Iziet caur pārbaudēm un tiek pieskaitīts
            //pie noteiktā skaitītāja un izvadīts
            System.out.print("Simbols: " + simbols + " – ");
            //Pārbauda vai simbols ir lielais
            if (Character.isUpperCase(simbols)) {
                System.out.println("lielais burts");
                lielieBurti++;
                //Pārbauda vai simbols ir mazais
            } else if (Character.isLowerCase(simbols)) {
                System.out.println("mazais burts");
                mazieBurti++;
                //Pārbauda vai simbols ir cipars
            } else if (Character.isDigit(simbols)) {
                System.out.println("cipars");
                cipari++;
                //Pārbauda vai simbols ir atstarpe
            } else if (Character.isWhitespace(simbols)) {
                System.out.println("atstarpe");
                atstarpes++;
                //Pārbauda vai simbols ir speciālas simbols
            } else {
                System.out.println("speciālais simbols");
                specialie++;
            }
        }

        //Skaitītāju rezultātu izvade
        System.out.println("Lielie burti: " + lielieBurti);
        System.out.println("Mazie burti: " + mazieBurti);
        System.out.println("Cipari: " + cipari);
        System.out.println("Atstarpes: " + atstarpes);
        System.out.println("Speciālie simboli: " + specialie);
        scan.close();
    }
}
