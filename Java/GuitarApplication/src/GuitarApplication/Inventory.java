package GuitarApplication;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import GuitarApplication.GuitarEnum.Builder;
import GuitarApplication.GuitarEnum.Type;
import GuitarApplication.GuitarEnum.Wood;

public class Inventory {
	private List guitars;
	
	public Inventory()
	{
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price, GuitarSpec spec)
	{
		Guitar guitar = new Guitar(serialNumber,price,spec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber)
	{
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar) i.next();
			if(guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}
	
	public List search(GuitarSpec searchGuitar)
	{
		List matchingGuitar = new LinkedList();
		
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar guitar = (Guitar) i.next();
			
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			
			if( (searchGuitar.getBuilder() != null) && searchGuitar.getBuilder() != guitarSpec.getBuilder() )
					continue;
			
			String model = searchGuitar.getModel().toLowerCase();
			if((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
					continue;
			
			if((searchGuitar.getType() != null) && searchGuitar.getType() != guitarSpec.getType())
					continue;
			
			if((searchGuitar.getBackWood() != null) && searchGuitar.getBackWood() != guitarSpec.getBackWood())
					continue;
			
			if((searchGuitar.getTopWood() != null) && searchGuitar.getTopWood() != guitarSpec.getTopWood())
					continue;
			
			matchingGuitar.add(guitar);
		}
		return matchingGuitar;
	}
}
