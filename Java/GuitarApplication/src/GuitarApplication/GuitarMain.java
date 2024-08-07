package GuitarApplication;

import java.util.Iterator;
import java.util.List;

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
			System.out.println(guitar.getGuitarSpec().getModel());
		else
			System.out.println("Guitar with serial number not found");
		
		GuitarSpec whatErinLikes = new GuitarSpec("", null,Type.ELECTRIC,null,null);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		
		displayGuitarDetails(matchingGuitars);
		
	}

	private static void displayGuitarDetails(List matchingGuitar)
	{
		
		if(!matchingGuitar.isEmpty())
		{
			for(Iterator i = matchingGuitar.iterator();i.hasNext();)
			{
				Guitar guitar = (Guitar)i.next();
				System.out.println("Erin you might like Guitar with below specification:\n"+
                        "Builder : " + guitar.getGuitarSpec().getBuilder() + "\n" +
                        "Model : " + guitar.getGuitarSpec().getModel() + "\n" + 
                        "Type : " + guitar.getGuitarSpec().getType() + "\n" +
                        "TopWood : " + guitar.getGuitarSpec().getTopWood() + "\n" +
                        "Backwood : " + guitar.getGuitarSpec().getBackWood() + "\n" +
                        "price : " + guitar.getPrice() + "\n" );
			}
		}
		else
		{
			System.out.println("Sorry, Erin, we have nothing for you");
		}
		
	}
	private static void initializeInventory(Inventory inventory)
	{
		GuitarSpec guitarspec1 = new GuitarSpec("Les Paul",Builder.GIBSON, Type.ELECTRIC,Wood.MAHOGANY, Wood.MAPLE);
		inventory.addGuitar("SN001", 2499.99,guitarspec1);
		
		GuitarSpec guitarspec2 = new GuitarSpec("Stratocaster",Builder.FENDER, Type.ELECTRIC,Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("SN002", 1399.99,guitarspec2);
		
		GuitarSpec guitarspec3 = new GuitarSpec("D-28",Builder.MARTIN, Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD, Wood.SITKA);
		inventory.addGuitar("SN003", 2999.99,guitarspec3);
	}
}
