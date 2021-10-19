import java.sql.SQLOutput;
import java.util.Scanner;

public class PizzaRestaurant {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Menukort.initMenukort();
        while (true) {
            System.out.println("------------KOMMANDOER------------");
            System.out.println("Ny           = Opret ny bestilling");
            System.out.println("Menu         = Se menukort");
            System.out.println("Bestillinger = Se alle bestillinger");
            System.out.println("Bestilling   = Se konkret bestilling");
            System.out.println("Afslut       = Afslut igangværende bestilling");
            System.out.println("Annuller     = Annuller bestilling");
            System.out.println("Udlever      = Udlever bestilling");
            System.out.println("Skriv en af ovenstående kommandoer:\n");
            String command = scan.nextLine();
            System.out.println(command);

            switch (command.toLowerCase()) {
                case "ny":
                    //Oprettelse af ny bestilling
                    nyBestilling();
                    break;
                case "menu":
                    //Se menukortet
                    Menukort.printMenukort();
                    break;
                case "bestillinger":
                    //Bestillings liste
                    seBestillinger();
                    seBestilling();
                    break;
                case "bestilling":
                    //Se Konkret bestilling ud fra en liste
                    seBestilling();
                    break;
                case "afslut":
                    //Afslut igangværende bestilling
                    seBestillinger();
                    afslutBestilling();
                    break;
                case "annuller":
                    //Annuller en bestilling
                    annullerBestilling();
                case "udlever":
                    //Udlevering af bestilling
                    afhentBestilling();
                default:
                    //Nedenstående skrives ud hvis du ikke skriver en af kommandoerne
                    System.out.println("Det forstår jeg ikke.");
                    break;
            }
        }
    }

    public static void nyBestilling() {
        Bestilling bestilling = new Bestilling();
        Menukort.printMenukort();
        boolean finished = false;
        //Så længe der skal tilføjes pizzaer...
        while (!finished) {
            System.out.println("Vælg pizza at tilføje til bestilling: ");
            String str = scan.nextLine();

            if (str.equals("afslut")) {
                finished = true;
            } else {
                try{
                int pizzaID = Integer.parseInt(str) - 1;
                if (pizzaID >= 0 && pizzaID < Menukort.getPizzaList().size()) {
                    Pizza pizza = Menukort.getPizzaList().get(pizzaID);
                    System.out.println("Pizza tilføjet: " + pizza.getName());
                    bestilling.addPizza(pizza);
                } else {
                    System.out.println("Ugyldigt tal indtastet");
                }}catch (Exception e){
                    System.out.println("Det var ikke et tal, indtast venligst et heltal");
                }

            }
        }
        //Når der ikke længere skal tilføjes flere pizzaer
        System.out.println("Indtast kundens navn: ");
        String str = scan.nextLine();
        bestilling.setKunde(str);
        System.out.println("Om hvor længe skal pizzaen afhentes?");
        long time = scan.nextLong();
        bestilling.setAfhentningstid(time);
        System.out.println("Bestilling oprettet");
        Storage.addBestilling(bestilling);
        scan.nextLine();
    }

    public static void seBestillinger() {
        System.out.println("Hvilke bestillinger vil du se?\n0: Oprettede\n1: Færdige\n2: Afhentede\n-1: Annullerede");
        int status = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < Storage.getBestillinger().size(); i++) {
            Bestilling best = Storage.getBestillinger().get(i);
            if (best.getStatus() == status) {
                System.out.println(i + ": " + best.getKunde() + ": " + best.getPizzaer().size() + " pizzaer");
            }
        }
    }

    public static void seBestilling() {
        System.out.println("Vælg bestilling: ");
        String str = scan.nextLine();
        System.out.println(Storage.getBestillinger().get(Integer.parseInt(str)));
    }

    public static void afslutBestilling() {
        System.out.println("Vælg bestilling: ");
        String str = scan.nextLine();
        Storage.getBestillinger().get(Integer.parseInt(str)).setStatus(1);
    }

    public static void annullerBestilling() {
        System.out.println("Vælg bestilling: ");
        String str = scan.nextLine();
        Storage.getBestillinger().get(Integer.parseInt(str)).setStatus(-1);
    }

    public static void afhentBestilling() {
        System.out.println("Vælg bestilling: ");
        String str = scan.nextLine();
        Storage.getBestillinger().get(Integer.parseInt(str)).setStatus(2);
    }
}
