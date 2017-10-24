class Equals2
{
	String name;
	int rollNo;
	
	Equals2(String name, int rollNo)
	{
		this.name = name;
		this.rollNo =rollNo;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Equals2)
		{
			Equals2 eq = (Equals2) obj;
			if(name.equals(eq.name) && rollNo == eq.rollNo)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		Equals2 eq1 = new Equals2("Prabhudeep", 101);
		Equals2 eq2 = new Equals2("Prabhudeep", 101);
		Equals2 eq3 = new Equals2("Singh", 103);
		Equals2 eq4 = eq1;
		
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		System.out.println(eq1.equals(eq4));
	}
}