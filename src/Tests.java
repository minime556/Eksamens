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
        
    }
}