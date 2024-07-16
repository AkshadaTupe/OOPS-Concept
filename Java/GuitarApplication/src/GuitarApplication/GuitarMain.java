package GuitarApplication;

import GuitarApplication.GuitarEnum.Builder;
import GuitarApplication.GuitarEnum.Type;
import GuitarApplication.GuitarEnum.Wood;

public class GuitarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Inventory inventory = new Inventory();
		
		initializeInventory(inventory);
		
		Guitar guitar = inventory.getGuitar("SN004");
		
		if(guitar != null)
			System.out.println(guitar.getModel());
		else
			System.out.println("Guitar with serial number not found");
		
		
		Guitar whatErinLikes = new Guitar("", Builder.MARTIN, "", null, Wood.INDIAN_ROSEWOOD, Wood.SITKA,0);
		
		guitar = inventory.search(whatErinLikes);
		
		displayGuitarDetails(guitar);
		
	}

	private static void displayGuitarDetails(Guitar guitar)
	{
		if(guitar != null)
		{
			System.out.println("Erin you might like Guitar with below specification:\n"+
		                        "Builder : " + guitar.getBuilder() + "\n" +
		                        "Model : " + guitar.getModel() + "\n" + 
		                        "Type : " + guitar.getType() + "\n" +
		                        "TopWood : " + guitar.getTopWood() + "\n" +
		                        "Backwood : " + guitar.getBackWood() + "\n" +
		                        "price : " + guitar.getPrice() + "\n" );
		}
		else
		{
			System.out.println("Sorry, Erin, we have nothing for you");
		}
		
	}
	private static void initializeInventory(Inventory inventory)
	{
		inventory.addGuitar("SN001", Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 2499.99);
		inventory.addGuitar("SN002",Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 1399.99);
		inventory.addGuitar("SN003", Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, 2999.99);
	}
}
