import java.util.ArrayList;
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
        int pizzaValg = scan.nextInt();



        while (pizzaValg != 7){

            if (pizzaValg == 1){
                System.out.println("1. Vesuvio");
                break;
            } else if (pizzaValg == 2){
                System.out.println("2. Amerikaner");
                break;
            }else if (pizzaValg == 3){
                System.out.println("3. Cacciatore");
                break;
            }else if (pizzaValg == 4){
                System.out.println("4. Dennis");
                break;
            }else if (pizzaValg == 5){
                System.out.println("5. Bertil");
                break;
            }else if (pizzaValg == 6){
                System.out.println("6. Silvia");
                break;
            }

        }

        System.out.println("Kundes navn: " + navn);
        System.out.println("Pizza: " + pizzaValg);
    }







}

