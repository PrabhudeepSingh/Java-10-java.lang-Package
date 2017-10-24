class Equals1
{
	String name;
	int rollNo;
	
	Equals1(String name, int rollNo)
	{
		this.name = name;
		this.rollNo =rollNo;
	}
	
	public static void main(String[] args)
	{
		Equals1 eq1 = new Equals1("Prabhudeep", 101);
		Equals1 eq2 = new Equals1("Singh", 102);
		Equals1 eq3 = new Equals1("Banga", 103);
		Equals1 eq4 = eq1;
		
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		System.out.println(eq1.equals(eq4));
	}
}