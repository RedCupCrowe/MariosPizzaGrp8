import java.util.ArrayList;

public class Storage {
	static ArrayList<Bestilling> pizzaBestillinger = new ArrayList<>();

	public static void addBestilling(Bestilling bestilling) {
		pizzaBestillinger.add(bestilling);
	}
	
	public static ArrayList<Bestilling> getBestillinger() {
		return pizzaBestillinger;
	}

}
