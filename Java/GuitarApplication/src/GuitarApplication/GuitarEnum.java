package GuitarApplication;

public class GuitarEnum {
	
	public enum Type
	{
		ACOUSTIC,
		ELECTRIC;
		
		public String toString()
		{
			switch(this)
			{
				case ACOUSTIC : return "acoustic";
				case ELECTRIC : return "electric";
				default : return " ";
			}
		}
		
	}
	
	public enum Builder
	{
		GIBSON,
		FENDER,
		MARTIN,
		COLLINGS,
		OLSON,
		RYAN,
		PRS,
		ANY;
		
		public String toString()
		{
			switch(this)
			{
				case GIBSON : return "gibson";
				case FENDER : return "fender";
				case MARTIN : return "martin";
				case COLLINGS : return "collings";
				case OLSON : return "olson";
				case RYAN : return "ryan";
				case PRS : return "prs";
				case ANY : return "any";
				default : return " ";
			}
		}
	}

	public enum Wood
	{
		INDIAN_ROSEWOOD,
		BRAZILIAN_ROSEWOOD,
		ALDER,
		MAPLE,
		SITKA,
		MAHOGANY;
		
		public String toString()
		{
			switch(this)
			{
				case INDIAN_ROSEWOOD : return "indian rosewood";
				case BRAZILIAN_ROSEWOOD : return "brazilian rosewood";
				case ALDER : return "alder";
				case MAPLE : return "maple";
				case SITKA : return "sitka";
				case MAHOGANY : return "mahogany";
				default : return " ";
			}
		}
	}

}
