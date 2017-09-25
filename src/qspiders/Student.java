package qspiders;


public class Student
{
	
private int age;
	
	void setAge(int age)
	{
		this.age=age;
	}
	
 int getAge()
	{
		return age;
	}

		
	public static void main(String args[])
	{
		Student s=new Student();
		s.setAge(10);
		System.out.println(s.getAge());
	}


}

