import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Bestilling {
  // skal kunne oprette en bestilling til
  private int ID;
  private LocalTime bestillingstid;
  private LocalTime afhentningstid;
  private ArrayList<Pizza> pizzaer;
  private String kunde;
  private int status; //Status for bestilling; 0 = oprettet; 1 = færdig; 2 = afhentet; -1 = annulleret;

  public Bestilling() {
	  pizzaer = new ArrayList<Pizza>();
	  kunde = "";
	  status = 0;
	  bestillingstid = LocalTime.now();

  }
  
  public ArrayList<Pizza> getPizzaer() {
	  return pizzaer;
  }
  
  public void addPizza(Pizza pizza) {
	  pizzaer.add(pizza);
  }
  
  public void setKunde(String kunde) {
	  this.kunde = kunde;
  }
  
  public String getKunde() {
	  return kunde;
  }
  
  public int getStatus() {
	  return status;
  }
  
  public String toString() {
	  String result = kunde + ":\n";
	  result += afhentningstid;
	  for (Pizza p: pizzaer) {
		  result += "-" + p.getName()+"\n";
	  }
	  return result;
  }

	public void setStatus(int status) {
		this.status = status;
	}
	public void setBestillingstid(){
    this.bestillingstid = LocalTime.now();
  }

	public void setAfhentningstid(long minutter){
    this.afhentningstid = bestillingstid.plusMinutes(minutter).truncatedTo(ChronoUnit.MINUTES);
  }
}








