import java.lang.reflect.*;

public class MethodCount
{
    public static void main(String[] args) throws Exception 
    { 
        int count = 0;
        Class c = Class.forName("java.lang.Object");   
        Method[] mth = c.getDeclaredMethods();     
		
        System.out.println("Methos inside Object class: \n"); 
        
		for(Method m : mth)    
        {
             count++;      
             System.out.println(m.getName());  
        }           
        
	    System.out.println("\nNumber of methods :"+count);    
	  }   
}