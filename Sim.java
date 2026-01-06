class  Sim
{
	private String operator_name,band_width;
	private double price;
	
	private Sim(String operator_name,String band_width,double price)
	{
		//L.I
		this.operator_name=operator_name;
		this.band_width=band_width;
		this.price=price;
	}
	
	public static Sim getsimobj(String operator_name,String band_width,double price)
	{
		return new Sim(operator_name,band_width,price);
	}
	
	public String getoperator_name()
	{
		return operator_name;
	}
	
	public String getband_width()
	{
		return band_width;
	}
	public double getprice()
	{
		return price;
	}
}
