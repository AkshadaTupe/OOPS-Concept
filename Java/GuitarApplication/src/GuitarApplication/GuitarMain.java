package GuitarApplication;

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
		
		
		Guitar whatErinLikes = new Guitar("", "Martin", "", "", "Rosewood", "Spruce",0);
		
		guitar = inventory.search(whatErinLikes);
		
		displayGuitarDetails(guitar);
		
		
		Guitar whatErinLikes2 = new Guitar("", "martin", "", "", "Rosewood", "Spruce",0);
		
		guitar = inventory.search(whatErinLikes2);
		
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
		inventory.addGuitar("SN001", "Gibson", "Les Paul", "Electric", "Mahogany", "Maple", 2499.99);
		inventory.addGuitar("SN002", "Fender", "Stratocaster", "Electric", "Alder", "Alder", 1399.99);
		inventory.addGuitar("SN003", "Martin", "D-28", "Acoustic", "Rosewood", "Spruce", 2999.99);
	}
}
