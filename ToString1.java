class ToString1
{
	String name;
	int rollNo;
	
	ToString1(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public static void main(String[] args)
	{
		ToString1 obj1 = new ToString1("Prabhudeep", 101);
		ToString1 obj2 = new ToString1("Singh", 102);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}