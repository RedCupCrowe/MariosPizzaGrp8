import java.util.ArrayList;

public class PizzaRestaurant {

    public static void main(String[] args) {
        Bestilling tis = new Bestilling();

        ArrayList<Pizza> pizza = tis.getPizzaer();
        System.out.println(pizza);


        Menukort menukort = new Menukort();
        ArrayList<Pizza> printMenukort = menukort.getPizzaList();
        for(Pizza p: printMenukort) {
            System.out.println(p.toString());

    }}
    public static void addToBestilling(Bestilling bestilling, int pizzaID){
        bestilling.addPizza(Menukort.getPizzaList().get(pizzaID - 1));
        }



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

}
