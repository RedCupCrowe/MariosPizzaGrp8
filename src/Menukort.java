import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menukort {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();



        Pizza pizza1 = new Pizza("1. Vesuvio: ","tomatsauce, ost, skinke og oregano......................................",57);
        pizzaList.add(pizza1);

        Pizza pizza2 = new Pizza("2. Amerikaner: ","tomatsauce, ost, oksefars og oregano.................................",54);
        pizzaList.add(pizza2);

        Pizza pizza3 = new Pizza("3. Cacciatore: ","tomatsauce, ost, pepperoni og oregano................................",57);
        pizzaList.add(pizza3);

        Pizza pizza4 = new Pizza("4. Carbona: ","tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, og oregano...........",61);
        pizzaList.add(pizza4);

        Pizza pizza5 = new Pizza("5. Dennis: ","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............",65);
        pizzaList.add(pizza5);

        Pizza pizza6 = new Pizza("6. Bertil: ","tomatsauce, ost, bacon og oregano........................................",57);
        pizzaList.add(pizza6);

        Pizza pizza7 = new Pizza("7. Silvia: ","tomatsauce, ost, pepperoni, rød peber, løg, oliven, og oregano...........",61);
        pizzaList.add(pizza7);

        Pizza pizza8 = new Pizza("8. Victoria: ","tomatsauce, ost, skinke, ananas, champignon, løg og oregano............",61);
        pizzaList.add(pizza8);

        Pizza pizza9 = new Pizza("9. Toronfo: ","tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................",61);
        pizzaList.add(pizza9);

        Pizza pizza10 = new Pizza("10. Capricciosa: ","tomatsauce, ost, skinke, champignon, og oregano...................",61);
        pizzaList.add(pizza10);

        Pizza pizza11 = new Pizza("11. Hawai: ","tomatsauce, ost, skinke, ananas, og oregano.............................",61);
        pizzaList.add(pizza11);

        Pizza pizza12 = new Pizza("12. Le Blissola: ","tomatsauce, ost, rejer og oregano.................................",61);
        pizzaList.add(pizza12);

        Pizza pizza13 = new Pizza("13. Venezia: ","tomatsauce, ost, skinke, bacon, og oregano.............................",61);
        pizzaList.add(pizza13);

        Pizza pizza14 = new Pizza("14. Mafia: ","tomatsauce, ost, pepperoni, bacon, løg og oregano........................",61);
        pizzaList.add(pizza14);



        System.out.println("--------------------------------MARIOS PIZZAER-------------------------------------------");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
        System.out.println(pizza5);
        System.out.println(pizza6);



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












