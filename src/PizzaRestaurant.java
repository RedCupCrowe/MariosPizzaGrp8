import java.util.Scanner;

public class PizzaRestaurant {

	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    	Menukort.initMenukort();
	while (true) {
		System.out.println("Indtast kommando...");
		String command = scan.nextLine();
		System.out.println(command);
		
		switch(command.toLowerCase()) {
		case "ny":
			nyBestilling();
			break;
		case "menu":
			Menukort.printMenukort();
			break;
		case "bestillinger":
			seBestillinger();
			seBestilling();
			break;
		case "bestilling":
			seBestilling();
			break;
		case "afslut":
			seBestillinger();
			afslutBestilling();
			break;
		default:
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
    			int pizzaID = Integer.parseInt(str)-1;
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
