package qspiders;


class ProCompany
{
	void address()
	{
		System.out.println("company address");
	}


public 

int run()
{
	return 2;
}


}

class Importer extends ProCompany
{
	
	void address()
	{
		super.address();
		
	System.out.println("Importer Addrss");
	}
	
	/*public long run()
	{
		return 5l;
	}*/
}

public class Methodoverriding {
	
	public static void main(String args[])
	{
		

	Importer im =new Importer();
	im.address();
	}
}
