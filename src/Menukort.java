import java.util.ArrayList;

public class Menukort {
	
	static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
	
	public static void initMenukort() {
		 	Pizza pizza1 = new Pizza("Vesuvio ", "1. tomatsauce, ost, skinke og oregano......................................", 57);
	        pizzaList.add(pizza1);

	        Pizza pizza2 = new Pizza("Amerikaner ", "2. tomatsauce, ost, oksefars og oregano.................................", 54);
	        pizzaList.add(pizza2);

	        Pizza pizza3 = new Pizza("Cacciatore ", "3. tomatsauce, ost, pepperoni og oregano................................", 57);
	        pizzaList.add(pizza3);

	        Pizza pizza4 = new Pizza("Carbona ", "4. tomatsauce, ost, kødsauce, spaghetti, cocktailpølser, og oregano........", 61);
	        pizzaList.add(pizza4);

	        Pizza pizza5 = new Pizza("Dennis ", "5. tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............", 65);
	        pizzaList.add(pizza5);

	        Pizza pizza6 = new Pizza("Bertil ", "6. tomatsauce, ost, bacon og oregano........................................", 57);
	        pizzaList.add(pizza6);

	        Pizza pizza7 = new Pizza("Silvia ", "7. tomatsauce, ost, pepperoni, rød peber, løg, oliven, og oregano...........", 61);
	        pizzaList.add(pizza7);

	        Pizza pizza8 = new Pizza("Victoria ", "8. tomatsauce, ost, skinke, ananas, champignon, løg og oregano............", 61);
	        pizzaList.add(pizza8);

	        Pizza pizza9 = new Pizza("Toronfo ", "9. tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................", 61);
	        pizzaList.add(pizza9);

	        Pizza pizza10 = new Pizza("Capricciosa ", "10. tomatsauce, ost, skinke, champignon, og oregano...................", 61);
	        pizzaList.add(pizza10);

	        Pizza pizza11 = new Pizza("Hawai ", "11. tomatsauce, ost, skinke, ananas, og oregano.............................", 61);
	        pizzaList.add(pizza11);

	        Pizza pizza12 = new Pizza("Le Blissola ", "12. tomatsauce, ost, rejer og oregano.................................", 61);
	        pizzaList.add(pizza12);

	        Pizza pizza13 = new Pizza("Venezia ", "13. tomatsauce, ost, skinke, bacon, og oregano............................", 61);
	        pizzaList.add(pizza13);

	        Pizza pizza14 = new Pizza("Mafia ", "14. tomatsauce, ost, pepperoni, bacon, løg og oregano.......................", 61);
	        pizzaList.add(pizza14);

	        Pizza pizza15 = new Pizza("Petl ", "15. tomatsauce, ost, full java support, darth vader t-shirts.................", 97);
	        pizzaList.add(pizza15);

	        Pizza pizza16 = new Pizza("Haam ", "16. tomatsauce, ost, sej hat, fede kuglepenne.................................", 97);
	        pizzaList.add(pizza16);

	        Pizza pizza17 = new Pizza("Paag ", "17. tomatsauce, ost, hummer, garn............................................", 97);
	        pizzaList.add(pizza17);

	        Pizza pizza18 = new Pizza("Kastanjemand ", "18. tomatsauce, ost, kastanjer, kviste...............................", 97);
	        pizzaList.add(pizza18);

	        Pizza pizza19 = new Pizza("Squidgame ", "19. tomatsauce, ost, kimchi, blæksprutte................................", 456);
	        pizzaList.add(pizza19);

	        Pizza pizza20 = new Pizza("Kiwi ", "20. tomatsauce, ost, Kiwi, banan.............................................", 97);
	        pizzaList.add(pizza20);

	        Pizza pizza21 = new Pizza("Banana ", "21. tomatsauce, ost, banana, kiwi..........................................", 97);
	        pizzaList.add(pizza21);

	        Pizza pizza22 = new Pizza("Leeroy Jenkins ", "22. tomatsauce, ost, Onyxia hjørnetand, Ragnaros aske..............", 10000);
	        pizzaList.add(pizza22);

	        Pizza pizza23 = new Pizza("Diablo ", "23. tomatsauce, ost, Mephisto's brain, Diablo's horn, Baal's eye...........", 666);
	        pizzaList.add(pizza23);

	        Pizza pizza24 = new Pizza("Restock ", "24. tomatsauce, ost, fordøjet pepperoni...................................", 25);
	        pizzaList.add(pizza24);

	        Pizza pizza25 = new Pizza("Skopizza ", "25. tomatsauce, gedeost, snørrebånd, såler og mudder.....................", 76);
	        pizzaList.add(pizza25);

	        Pizza pizza26 = new Pizza("Prutte ", "26. våd prut, tør prut, ulækker prut og lækker prut........................", 15);
	        pizzaList.add(pizza26);

	        Pizza pizza27 = new Pizza("Remo/Mayo ", "27. remoulade, mayonaise, ranch, fransk hotdogdressing..................", 50);
	        pizzaList.add(pizza27);

	        Pizza pizza28 = new Pizza("Nintendo ", "28. Mario, Pikachu, Link, Samus og Kirby.................................", 60);
	        pizzaList.add(pizza28);

	        Pizza pizza29 = new Pizza("CodeLab ", "29. Jimmy, Michael, Mads og Christina.....................................", 100);
	        pizzaList.add(pizza29);

	        Pizza pizza30 = new Pizza("Vinter ", "30. hue, handsker, halstørklæde og lange underbukser.......................", 80);
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


