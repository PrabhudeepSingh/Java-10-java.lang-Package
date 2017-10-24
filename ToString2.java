class ToString2
{
	String name;
	int rollNo;
	
	ToString2(String name, int rollNo)
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString()
	{
		return name+" "+rollNo;
	}
	
	public static void main(String[] args)
	{
		ToString2 obj1 = new ToString2("Prabhudeep", 101);
		ToString2 obj2 = new ToString2("Singh", 102);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}