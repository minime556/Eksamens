import java.util.Random;
import java.util.Scanner;

public class Tests {

    public static void main(String[] args) {
        //Masīvs ar visiem jautājumiem
        String[] jautajumi = {
            "Kura metode atgriež simbola virknes (String) garumu?",
            "Kāds būs koda `\"Java\".charAt(1)` izpildes rezultāts?",
            "Kura metode ir ieteicamā, lai salīdzinātu divu String objektu saturu?",
            "Kāds būs rezultāts, izpildot `\"Programma\".substring(3, 7)`?",
            "Kura metode pārveidos visus virknes burtus par lielajiem burtiem?",
            "Kāda vērtība tiks atgriezta, ja metode `indexOf()` neatradīs meklēto simbolu virknē?",
            "Ko dara metode `trim()`?",
            "Kas ir galvenā `String` objektu iezīme Javā?",
            "Kura metode pārbauda, vai virkne sākas ar noteiktu prefiksu?",
            "Kāds būs koda `String s = \"Sveiki!\"; s.replace('i', 'a'); System.out.println(s);` izpildes rezultāts?"
        };
        //Masīvs ar visām iespējamām atbildēm
        String[][] visasAtbildes = {
            {"length()", "size()", "count()", "getLength()"},
            {"'a'", "'J'", "Izņēmums", "'v'"},
            {"equals()", "==", "compareTo()", "matches()"},
            {"\"gram\"", "\"ogra\"", "\"gramm\"", "\"ogram\""},
            {"toUpperCase()", "toUpper()", "changeCase(UPPER)", "makeUpper()"},
            {"-1", "0", "null", "false"},
            {"Noņem tukšumsimbolus no virknes sākuma un beigām", "Noņem visus tukšumsimbolus no virknes", "Pārveido virkni par tukšu virkni", "Apgriež virkni līdz noteiktam garumam"},
            {"Tie ir nemainīgi", "Tie ir mainīgi", "To garums nevar pārsniegt 255 simbolus", "Tie var saturēt tikai ASCII simbolus"},
            {"startsWith()", "beginsWith()", "hasPrefix()", "isFirst()"},
            {"\"Sveiki!\"", "\"Sveaki!\"", "\"Sveaka!\"", "Kompilācijas kļūda"}
        };
        //Masīvs ar visām pareizajām atbildēm
        String[] pareizasAtbildes = {
            "length()", "'a'", "equals()", "\"gram\"", "toUpperCase()", "-1",
            "Noņem tukšumsimbolus no virknes sākuma un beigām",
            "Tie ir nemainīgi", "startsWith()", "\"Sveiki!\""
        };
        
        //Masīvs kas saglabā lietotāja atbildes ievadi
        String[] lietotajaAtb = new String[jautajumi.length];
        
        //Jautājumu secības sajaukšana
        int[] jautajumuIndx = new int[jautajumi.length];
        for (int i = 0; i < jautajumuIndx.length; i++) {
            jautajumuIndx[i] = i;
        }
        shuffleArray(jautajumuIndx);
        Scanner scanner = new Scanner(System.in);
        //Cikls kas izvada testa jautājumus sajauktā secībā
        System.out.println("=== Tests par String un char funkcijām Java valodā ===");

        for (int i = 0; i < jautajumuIndx.length; i++) {
            int currentIndx = jautajumuIndx[i];
            System.out.println("\n" + (i + 1) + ". " + jautajumi[currentIndx]);
        
        //Atbilžu variantu indeksu masīvs un tā sajaukšana
        int[] atbilzuIndeksi = {0, 1, 2, 3};
        shuffleArray(atbilzuIndeksi);

        char opcijasBurts = 'A';
        for (int atbSajauktsIndx : atbilzuIndeksi) {
            System.out.println(opcijasBurts + ") " + visasAtbildes[currentIndx][atbSajauktsIndx]);
            opcijasBurts++;
        }
     // Lietotāja ievades iegūšana
        String ievade;
        while (true) {
            System.out.print("Ievadiet savu atbildi (A, B, C vai D): ");
            ievade = scanner.nextLine().toUpperCase();
            if (ievade.equals("A") || ievade.equals("B") || ievade.equals("C") || ievade.equals("D")) {
                break;
            } else {
                System.out.println("Kļūdaina ievade. Lūdzu, ievadiet tikai vienu no burtiem: A, B, C vai D.");
            }
        }

        int izvelesIndekss = ievade.charAt(0) - 'A';
        int originalAtbIndx = atbilzuIndeksi[izvelesIndekss];
        lietotajaAtb[currentIndx] = visasAtbildes[currentIndx][originalAtbIndx];
    }
    
        //Rezultātu apkopošana un izvade konsolē
        System.out.println("\n===== TESTA REZULTĀTI =====");
        int pareizi = 0;
        for (int i = 0; i < jautajumi.length; i++) {
            if (pareizasAtbildes[i].equals(lietotajaAtb[i])) {
                pareizi++;
            }
        }
        System.out.println("Jūs pareizi atbildējāt uz " + pareizi + " jautājumiem.");

        if (pareizi < jautajumi.length) {
            System.out.println("\n--- Nepareizi atbildētie jautājumi ---");
            for (int i = 0; i < jautajumi.length; i++) {
                if (!pareizasAtbildes[i].equals(lietotajaAtb[i])) {
                    System.out.println("\nJautājums: " + jautajumi[i]);
                    System.out.println("   - Jūsu atbilde: " + (lietotajaAtb[i] == null ? "Nav atbildēts" : lietotajaAtb[i]));
                    System.out.println("   - Pareizā atbilde: " + pareizasAtbildes[i]);
                }
            }
        } else {
             System.out.println("\nVisi jautājumi atbildēti pareizi!!!");
        }
    scanner.close();
    }
        private static void shuffleArray(int[] ar) {
            Random rnd = new Random();
            for (int i = ar.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                // Apmaina elementus vietām
                int a = ar[index];
                ar[index] = ar[i];
                ar[i] = a;
            }
        
    }
}