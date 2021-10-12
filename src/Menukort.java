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

        Pizza pizza4 = new Pizza("4. Dennis: ","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............",65);
        pizzaList.add(pizza4);

        Pizza pizza5 = new Pizza("5. Bertil: ","tomatsauce, ost, bacon og oregano........................................",57);
        pizzaList.add(pizza5);

        Pizza pizza6 = new Pizza("6. Silvia: ","tomatsauce, ost, pepperoni, rød peber, løg, oliven, og oregano...........",61);
        pizzaList.add(pizza6);

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
                case "dennis":
                    System.out.println("4. Dennis");
                    liste.add("4. Dennis");
                    break;
                case "5":
                case "bertil":
                    System.out.println("5. Bertil");
                    liste.add("5. Bertil");
                    break;
                case "6":
                case "silvia":
                    System.out.println("6. Silvia");
                    liste.add("6. Silvia");
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












