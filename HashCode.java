class HashCode
{
	int i;
	
	HashCode(int i)
	{
		this.i = i;
	}
	
	public int hashCode()
	{
		return i;
	}
	
	public static void main(String[] args)
	{
		HashCode hsh1 = new HashCode(10);
		HashCode hsh2 = new HashCode(20);
		
		System.out.println(hsh1.hashCode());
		System.out.println(hsh2.hashCode());
	}
}