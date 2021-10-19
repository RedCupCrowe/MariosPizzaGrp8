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
            System.out.println("Skriv en af ovenstående kommandoer:");
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
                //Try catch
                int pizzaID = Integer.parseInt(str) - 1;
                if (pizzaID >= 0 && pizzaID < Menukort.getPizzaList().size()) {
                    Pizza pizza = Menukort.getPizzaList().get(pizzaID);
                    System.out.println("Pizza tilføjet: " + pizza.getName());
                    bestilling.addPizza(pizza);
                } else {
                    System.out.println("Ugyldigt tal indtastet");
                }

            }
        }
        //Når der ikke længere skal tilføjes flere pizzaer
        System.out.println("Indtast kundens navn: ");
        String str = scan.nextLine();
        bestilling.setKunde(str);
        System.out.println("Bestilling oprettet");
        Storage.addBestilling(bestilling);
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
	
//	ArrayList<Pizza> pizza = tis.getPizzaer();
//        System.out.println(pizza);
//
//
//        Menukort menukort = new Menukort();
//        ArrayList<Pizza> printMenukort = menukort.getPizzaList();
//        for(Pizza p: printMenukort) {
//            System.out.println(p.toString());
//
//    }}
//    public static void addToBestilling(Bestilling bestilling, int pizzaID){
//        bestilling.addPizza(Menukort.getPizzaList().get(pizzaID - 1));
//    }

        //}
        //ArrayList<Pizza> pizza = tis.getPizzaer();
        //System.out.println(pizza);


        /*Menukort menukort = new Menukort();
        ArrayList<Pizza> printMenukort = menukort.getPizzaList();
        for (Pizza p : printMenukort) {
            System.out.println(p.toString());

        }
  /*
  Skal kunne kalde menukortet
  skal kunne starte en bestilling
  skal kunne anullere en bestilling imens og efter den er lavet
  skal kunne afslutte en bestilling
  skal kunne gemme bestillingen efter afslutning
  skal evt. kunne kalde statistik.
  */
