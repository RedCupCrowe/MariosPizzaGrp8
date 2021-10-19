import java.util.ArrayList;

public class Menukort {
	
	static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
	
	public static void initMenukort() {
		 	Pizza pizza1 = new Pizza("1. Vesuvio ", "tomatsauce, ost, skinke og oregano......................................", 57);
	        pizzaList.add(pizza1);

	        Pizza pizza2 = new Pizza("2. Amerikaner ", "tomatsauce, ost, oksefars og oregano.................................", 54);
	        pizzaList.add(pizza2);

	        Pizza pizza3 = new Pizza("3. Cacciatore ", "tomatsauce, ost, pepperoni og oregano................................", 57);
	        pizzaList.add(pizza3);

	        Pizza pizza4 = new Pizza("4. Carbona ", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, og oregano........", 61);
	        pizzaList.add(pizza4);

	        Pizza pizza5 = new Pizza("5. Dennis ", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............", 65);
	        pizzaList.add(pizza5);

	        Pizza pizza6 = new Pizza("6. Bertil ", "tomatsauce, ost, bacon og oregano........................................", 57);
	        pizzaList.add(pizza6);

	        Pizza pizza7 = new Pizza("7. Silvia ", "tomatsauce, ost, pepperoni, rød peber, løg, oliven, og oregano...........", 61);
	        pizzaList.add(pizza7);

	        Pizza pizza8 = new Pizza("8. Victoria ", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano............", 61);
	        pizzaList.add(pizza8);

	        Pizza pizza9 = new Pizza("9. Toronfo ", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................", 61);
	        pizzaList.add(pizza9);

	        Pizza pizza10 = new Pizza("10. Capricciosa ", "tomatsauce, ost, skinke, champignon, og oregano...................", 61);
	        pizzaList.add(pizza10);

	        Pizza pizza11 = new Pizza("11. Hawai ", "tomatsauce, ost, skinke, ananas, og oregano.............................", 61);
	        pizzaList.add(pizza11);

	        Pizza pizza12 = new Pizza("12. Le Blissola ", "tomatsauce, ost, rejer og oregano.................................", 61);
	        pizzaList.add(pizza12);

	        Pizza pizza13 = new Pizza("13. Venezia ", "tomatsauce, ost, skinke, bacon, og oregano............................", 61);
	        pizzaList.add(pizza13);

	        Pizza pizza14 = new Pizza("14. Mafia ", "tomatsauce, ost, pepperoni, bacon, løg og oregano.......................", 61);
	        pizzaList.add(pizza14);

	        Pizza pizza15 = new Pizza("15. Petl ", "tomatsauce, ost, full java support, darth vader t-shirts.................", 97);
	        pizzaList.add(pizza15);

	        Pizza pizza16 = new Pizza("16. Haam ", "tomatsauce, ost, sej hat, fede kuglepenne.................................", 97);
	        pizzaList.add(pizza16);

	        Pizza pizza17 = new Pizza("17. Paag ", "tomatsauce, ost, hummer, garn............................................", 97);
	        pizzaList.add(pizza17);

	        Pizza pizza18 = new Pizza("18. Kastanjemand ", "tomatsauce, ost, kastanjer, kviste...............................", 97);
	        pizzaList.add(pizza18);

	        Pizza pizza19 = new Pizza("19. Squidgame ", "tomatsauce, ost, kimchi, blæksprutte................................", 456);
	        pizzaList.add(pizza19);

	        Pizza pizza20 = new Pizza("20. Kiwi ", "tomatsauce, ost, Kiwi, banan.............................................", 97);
	        pizzaList.add(pizza20);

	        Pizza pizza21 = new Pizza("21. Banana ", "tomatsauce, ost, banana, kiwi..........................................", 97);
	        pizzaList.add(pizza21);

	        Pizza pizza22 = new Pizza("22. Leeroy Jenkins ", "tomatsauce, ost, Onyxia hjørnetand, Ragnaros aske..............", 10000);
	        pizzaList.add(pizza22);

	        Pizza pizza23 = new Pizza("23. Diablo ", "tomatsauce, ost, Mephisto's brain, Diablo's horn, Baal's eye...........", 666);
	        pizzaList.add(pizza23);

	        Pizza pizza24 = new Pizza("24. Restock ", "tomatsauce, ost, fordøjet pepperoni...................................", 25);
	        pizzaList.add(pizza24);

	        Pizza pizza25 = new Pizza("25. Skopizza ", "tomatsauce, gedeost, snørrebånd, såler og mudder.....................", 76);
	        pizzaList.add(pizza25);

	        Pizza pizza26 = new Pizza("26. Prutte ", "våd prut, tør prut, ulækker prut og lækker prut........................", 15);
	        pizzaList.add(pizza26);

	        Pizza pizza27 = new Pizza("27. Remo/Mayo ", "remoulade, mayonaise, ranch, fransk hotdogdressing..................", 50);
	        pizzaList.add(pizza27);

	        Pizza pizza28 = new Pizza("28. Nintendo ", "Mario, Pikachu, Link, Samus og Kirby.................................", 60);
	        pizzaList.add(pizza28);

	        Pizza pizza29 = new Pizza("29. CodeLab ", "Jimmy, Michael, Mads og Christina.....................................", 100);
	        pizzaList.add(pizza29);

	        Pizza pizza30 = new Pizza("30. Vinter ", "hue, handsker, halstørklæde og lange underbukser.......................", 80);
	        pizzaList.add(pizza30);
	}
	
    public static ArrayList<Pizza> getPizzaList() {
            return pizzaList;
    }
    
    public static void printMenukort() {
    	String result = "";
    	for (Pizza p : pizzaList) {
    		result += p.getName() + "" + p.getDescription() + "\n";
    	}
    	System.out.println(result);
    }

    }


