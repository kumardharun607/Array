class Mobile 
{
	private String name,storage;
	private double price;
	private Sim slot;
	
	private Mobile(String name,String storage,double price)
	{
		this.name=name;
		this.storage=storage;
		this.price=price;
	}
	
	public static Mobile getmobileobj(String name,String storage,double price)
	{
		return new Mobile(name,storage,price);
	}
	
	public String getname()
	{
		return name;
	}
	public String getstorage()
	{
		return storage;
	}
	public double getprice()
	{
		return price;
	}
	
	public void insertsim(Sim sim)
	{
		if (slot==null)
		{
			slot=sim;
			System.out.println("\t\t\t"+slot.getoperator_name()+"Added");
		}
		else
		{
			System.out.println("\t\t\t"+slot.getoperator_name()+"Already present");
		}
	}
	public void removesim()
	{
		if (slot!=null)
		{
			slot=null;
			System.out.println("\t\t\t"+slot.getoperator_name()+"Removed");
		}
		else{
			System.out.println("\t\t\tSlot is already is empty");
		}
	}
	public boolean isempty()
	{
		return slot==null;
	}
	
}
