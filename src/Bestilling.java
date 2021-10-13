import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Bestilling {


    public Bestilling () {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kundens navn: ");
        String navn = scan.nextLine();

        System.out.println("Kundens Pizza bestilling");


        ArrayList<String> liste = new ArrayList();
        boolean bestilling = true;
        while (bestilling){
            System.out.println("vælg pizza");
            String pizzaValg = scan.nextLine();

            switch (pizzaValg.toLowerCase(Locale.ROOT)) {

                case "1":
                case "vesuvio":
                    System.out.println("1. Vesuvio");
                    liste.add("1. Vesuvio");
                    break;
                case "2":
                case "amerikaner":
                    System.out.println("2. Amerikaner");
                    liste.add(". Amerikaner");
                    break;
                case "3":
                case "cacciatore":
                    System.out.println("3. Cacciatore");
                    liste.add("3. Cacciatore");
                    break;
                case "4":
                case "Carbona":
                    System.out.println("4. Carbona");
                    liste.add("4. Carbona");
                    break;
                case "5":
                case "Dennis":
                    System.out.println("5. Dennis");
                    liste.add("5. Dennis");
                    break;
                case "6":
                case "bertil":
                    System.out.println("5. Bertil");
                    liste.add("6. Bertil");
                    break;
                case "7":
                case "silvia":
                    System.out.println("6. Silvia");
                    liste.add("7. Silvia");
                    break;
                case "8":
                case "Silvia":
                    System.out.println("6. Silvia");
                    liste.add("8. Silvia");
                    break;
                case "9":
                case "Toronfo":
                    System.out.println("9. Toronfo");
                    liste.add("9. Toronfo");
                    break;
                case "10":
                case "Capricciosa":
                    System.out.println("10. Silvia");
                    liste.add("6. Silvia");
                    break;
                case "11":
                case "Hawai":
                    System.out.println("11. Hawai");
                    liste.add("11. Hawai");
                    break;
                case "12":
                case "Le Blissola":
                    System.out.println("12. Le Blissola");
                    liste.add("12. Le Blissola");
                    break;
                case "13":
                case "Venezia":
                    System.out.println("13. Venezia");
                    liste.add("13. Venezia");
                    break;
                case "14":
                case "Mafia":
                    System.out.println("14. Mafia");
                    liste.add("14. Mafia");
                    break;
                case "15":
                case "Petl":
                    System.out.println("15. Petl");
                    liste.add("15. Petl");
                    break;
                case "16":
                case "Haam":
                    System.out.println("16. Haam");
                    liste.add("16. Haam");
                    break;
                case "17":
                case "Paag":
                    System.out.println("17. Paag");
                    liste.add("17. Paag");
                    break;
                case "18":
                case "Kastanjemand":
                    System.out.println("18. Kastanjemand");
                    liste.add("18. Kastanjemand");
                    break;
                case "19":
                case "Squidgame":
                    System.out.println("19. Squidgame");
                    liste.add("19. Squidgame");
                    break;
                case "20":
                case "Kiwi":
                    System.out.println("20. Kiwi");
                    liste.add("20. Kiwi");
                    break;
                case "21":
                case "Banana":
                    System.out.println("21. Banana");
                    liste.add("21. Banana");
                    break;
                case "22":
                case "Leroy":
                    System.out.println("22. Leroy");
                    liste.add("22. Leroy");
                    break;
                case "23":
                case "Diablo":
                    System.out.println("23. Diablo");
                    liste.add("23. Diablo");
                    break;
                case "24":
                case "Restock":
                    System.out.println("24. Restock");
                    liste.add("24. Restock");
                    break;
                case "25":
                case "Skopizza":
                    System.out.println("25. Skopizza");
                    liste.add("25. Skopizza");
                    break;
                case "26":
                case "Prutte":
                    System.out.println("26. Prutte");
                    liste.add("26. Prutte");
                    break;
                case "27":
                case "Remo/Mayo-pizza":
                    System.out.println("27. Remo/Mayo");
                    liste.add("27. Remo/Mayo");
                    break;
                case "28":
                case "Nintendo":
                    System.out.println("28. Nintendo");
                    liste.add("28. Nintendo");
                    break;
                case "29":
                case "CodeLab":
                    System.out.println("29. CodeLab");
                    liste.add("29. CodeLab");
                    break;
                case "30":
                case "Vinter":
                    System.out.println("30. Vinter");
                    liste.add("30. Vinter");
                    break;

                case "99":
                case "exit":
                    bestilling=false;
                    break;

                default:
                    System.out.println("den har vi ikke");
                    break;

            }

        }

        System.out.println();
        System.out.println("Kundens Bestilling: ");
        System.out.println("Kundes navn: " + navn);
        System.out.println("Pizza: " );
        System.out.println(liste.toString());
    }
}






