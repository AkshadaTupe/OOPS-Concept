package GuitarApplication;

import GuitarApplication.GuitarEnum.Builder;
import GuitarApplication.GuitarEnum.Type;
import GuitarApplication.GuitarEnum.Wood;

public class GuitarSpec {
	
	private String model;
	
	private Builder builder;
	
	private Type type;
	
	private Wood backWood;
	
	private Wood topWood;
	
	public GuitarSpec(String model,Builder builder,Type type, Wood backWood,Wood topWood)
	{
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Builder getBuilder()
	{
		return builder;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public Type getType()
	{
		return type;
	}
	
	public Wood getBackWood()
	{
		return backWood;
	}
	
	public Wood getTopWood()
	{
		return topWood;
	}
}