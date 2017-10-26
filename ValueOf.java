class ValueOf
{
	public static void main(String[] args)
	{
		Integer i = Integer.valueOf("10");
		Double d = Double.valueOf("10.5");
		Boolean bool = Boolean.valueOf(true);
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(bool);
	}
}