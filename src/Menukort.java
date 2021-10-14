import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menukort {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();


        Pizza pizza1 = new Pizza("1. Vesuvio: ", "tomatsauce, ost, skinke og oregano......................................", 57);
        pizzaList.add(pizza1);

        Pizza pizza2 = new Pizza("2. Amerikaner: ", "tomatsauce, ost, oksefars og oregano.................................", 54);
        pizzaList.add(pizza2);

        Pizza pizza3 = new Pizza("3. Cacciatore: ", "tomatsauce, ost, pepperoni og oregano................................", 57);
        pizzaList.add(pizza3);

        Pizza pizza4 = new Pizza("4. Carbona: ", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, og oregano........", 61);
        pizzaList.add(pizza4);

        Pizza pizza5 = new Pizza("5. Dennis: ", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............", 65);
        pizzaList.add(pizza5);

        Pizza pizza6 = new Pizza("6. Bertil: ", "tomatsauce, ost, bacon og oregano........................................", 57);
        pizzaList.add(pizza6);

        Pizza pizza7 = new Pizza("7. Silvia: ", "tomatsauce, ost, pepperoni, rød peber, løg, oliven, og oregano...........", 61);
        pizzaList.add(pizza7);

        Pizza pizza8 = new Pizza("8. Victoria: ", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano............", 61);
        pizzaList.add(pizza8);

        Pizza pizza9 = new Pizza("9. Toronfo: ", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................", 61);
        pizzaList.add(pizza9);

        Pizza pizza10 = new Pizza("10. Capricciosa: ", "tomatsauce, ost, skinke, champignon, og oregano...................", 61);
        pizzaList.add(pizza10);

        Pizza pizza11 = new Pizza("11. Hawai: ", "tomatsauce, ost, skinke, ananas, og oregano.............................", 61);
        pizzaList.add(pizza11);

        Pizza pizza12 = new Pizza("12. Le Blissola: ", "tomatsauce, ost, rejer og oregano.................................", 61);
        pizzaList.add(pizza12);

        Pizza pizza13 = new Pizza("13. Venezia: ", "tomatsauce, ost, skinke, bacon, og oregano............................", 61);
        pizzaList.add(pizza13);

        Pizza pizza14 = new Pizza("14. Mafia: ", "tomatsauce, ost, pepperoni, bacon, løg og oregano.......................", 61);
        pizzaList.add(pizza14);

        Pizza pizza15 = new Pizza("15. Petl: ", "tomatsauce, ost, full java support, darth vader t-shirts.................", 97);
        pizzaList.add(pizza15);

        Pizza pizza16 = new Pizza("16. Haam: ", "tomatsauce, ost, sej hat, fede kuglepene.................................", 97);
        pizzaList.add(pizza16);

        Pizza pizza17 = new Pizza("17. Paag: ", "tomatsauce, ost, hummer, garn............................................", 97);
        pizzaList.add(pizza17);

        Pizza pizza18 = new Pizza("18. Kastanjemand: ", "tomatsauce, ost, kastanjer, kviste...............................", 97);
        pizzaList.add(pizza18);

        Pizza pizza19 = new Pizza("19. Squidgame: ", "tomatsauce, ost, kimchi, blæksprutte................................", 456);
        pizzaList.add(pizza19);

        Pizza pizza20 = new Pizza("20. Kiwi: ", "tomatsauce, ost, Kiwi, banan.............................................", 97);
        pizzaList.add(pizza20);

        Pizza pizza21 = new Pizza("21. Banana: ", "tomatsauce, ost, banana, kiwi..........................................", 97);
        pizzaList.add(pizza21);

        Pizza pizza22 = new Pizza("22. Leeroy Jenkins: ", "tomatsauce, ost, Onyxia hjørnetand, Ragnaros aske..............", 10000);
        pizzaList.add(pizza22);

        Pizza pizza23 = new Pizza("23. Diablo: ", "tomatsauce, ost, Mephisto's brain, Diablo's horn, Baal's eye...........", 666);
        pizzaList.add(pizza23);

        Pizza pizza24 = new Pizza("24. Restock: ", "tomatsauce, ost, fordøjet pepperoni...................................", 25);
        pizzaList.add(pizza24);

        Pizza pizza25 = new Pizza("25. Skopizza: ", "tomatsauce, gedeost, snørrebånd, såler og mudder.....................", 76);
        pizzaList.add(pizza25);

        Pizza pizza26 = new Pizza("26. Prutte: ", "våd prut, tør prut, ulækker prut og lækker prut........................", 15);
        pizzaList.add(pizza26);

        Pizza pizza27 = new Pizza("27. Remo/Mayo: ", "remoulade, mayonaise, ranch, fransk hotdogdressing..................", 50);
        pizzaList.add(pizza27);

        Pizza pizza28 = new Pizza("28. Nintendo: ", "Mario, Pikachu, Link, Samus og Kirby.................................", 60);
        pizzaList.add(pizza28);

        Pizza pizza29 = new Pizza("29. CodeLab: ", "Jimmy, Michael, Mads og Christina.....................................", 100);
        pizzaList.add(pizza29);

        Pizza pizza30 = new Pizza("30. Vinter: ", "hue, handsker, halstørklæde og lange underbukser.......................", 80);
        pizzaList.add(pizza30);

        System.out.println("--------------------------------MARIOS PIZZAER-------------------------------------------");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
        System.out.println(pizza5);
        System.out.println(pizza6);
        System.out.println(pizza7);
        System.out.println(pizza8);
        System.out.println(pizza9);
        System.out.println(pizza10);
        System.out.println(pizza11);
        System.out.println(pizza12);
        System.out.println(pizza13);
        System.out.println(pizza14);
        System.out.println(pizza15);
        System.out.println(pizza16);
        System.out.println(pizza17);
        System.out.println(pizza18);
        System.out.println(pizza19);
        System.out.println(pizza20);
        System.out.println(pizza21);
        System.out.println(pizza22);
        System.out.println(pizza23);
        System.out.println(pizza24);
        System.out.println(pizza25);
        System.out.println(pizza26);
        System.out.println(pizza27);
        System.out.println(pizza28);
        System.out.println(pizza29);
        System.out.println(pizza30);

    }

    }


 /*  Scanner scan = new Scanner(System.in);

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
    } */

