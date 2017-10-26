class BaseConversion
{
	public static void main(String[] args)
	{
		String str;
		
		str = Integer.toBinaryString(10);
		System.out.println(str);
		
		str = Integer.toOctalString(10);
		System.out.println(str);
		
		str = Integer.toHexString(10);
		System.out.println(str);
	}
}