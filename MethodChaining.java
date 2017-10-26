class MethodChaining
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("prabhu").append("deep").append("_singh").insert(3,"xyz").reverse().delete(2,6);
		
		System.out.println(sb);
	}
}