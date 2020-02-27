class Person
{

	String name;
	int age;
	boolean isMale;

	void setAge(int age)
	{
		this.age = age;
	}	

	void setName(String name)
	{
		this.name = name;
	}

	void setGender(String gender)
	{
		isMale = gender.toLowerCase() == "male" ? true:false;
	}

	int getAge()
	{
		return age;
	}

	String getName()
	{
		return name;
	}

	String getGender()
	{
		return isMale ? "Male":"Female";
	}

	void desc()
	{
		System.out.println("Name   : " + getName());
		System.out.println("Age    : " + getAge());
		System.out.println("Gender : " + getGender());
	}

}