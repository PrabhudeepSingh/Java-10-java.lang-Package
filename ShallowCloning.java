class Cat
{
	int j;
	
	Cat(int j)
	{
		this.j = j;
	}
}

class Dog implements Cloneable
{
	Cat cat;
	int i;
	
	Dog(Cat cat, int i)
	{
		this.cat = cat;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class ShallowCloning
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Cat cat = new Cat(100);
		Dog dog1 = new Dog(cat, 200);
		System.out.println(dog1.i + "....." +dog1.cat.j); //100.....200
		
		Dog dog2 = (Dog) dog1.clone();
		dog2.i = 4000;
		dog2.cat.j = 500;
		System.out.println(dog1.i + "....." +dog1.cat.j); //100.....500
	}
}