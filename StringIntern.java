class StringIntern
{
	public static void main(String[] args)
	{
		String str1 = new String("prabhu");
		String str2 = new String("deep");
		
		String str3 = str2.intern();
		System.out.println(str2 == str3); //false
		
		String str4 = "deep";
		System.out.println(str3 == str4); //true
	}
}