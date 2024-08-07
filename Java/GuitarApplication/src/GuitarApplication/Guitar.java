package GuitarApplication;

public class Guitar {

	private String serialNumber;
	
	private double price;
	
	private GuitarSpec specs;
	
	
	public Guitar(String serialNumber,double price, GuitarSpec spec)
	{
		this.serialNumber = serialNumber;
		this.price = price;
		this.specs = spec;
	}
	
	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public  GuitarSpec getGuitarSpec()
	{
		return specs;
	}
}
