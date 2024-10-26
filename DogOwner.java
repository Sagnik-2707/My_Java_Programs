class Dog
{
	private String breed,name;
	Dog(String breed, String name)
	{
		this.breed = breed;
		this.name = name;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return breed;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}

public class DogOwner
{
	public static void main(String args[])
	{
		Dog ob1 = new Dog("Labrador", "Jimmy");
		Dog ob2 = new Dog("Bull Dog", "Rocky");
		
		ob1.setBreed("Alsatian");
		ob2.setName("Tommy");
		System.out.println(ob1.getBreed() + " " + ob1.getName());
		System.out.println(ob2.getBreed() + " " + ob2.getName());
	}
}

