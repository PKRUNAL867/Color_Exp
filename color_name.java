package user_Exp;

public class color_name {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		try {
		if(color=="red"||color=="white"||color=="green")
		{
			throw new colorException();	
		}
		else{
		this.color = color;
		}
	}
		
		catch(colorException e)
		{
			System.out.println("color is red ||white||green  so exp is run");
			
		}
	}

	@Override
	public String toString() {
		return "color_name [color=" + color + "]";
	}
	

}
