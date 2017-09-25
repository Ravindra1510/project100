package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

interface Fruit
{
	
}

class Orange implements Fruit
{
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(true);
		lst.add("hello");
		lst.add(new String("Bangalore"));
		
		
		Orange o1=new Orange();
		lst.add(o1);
		lst.add(new Orange());
		
		System.out.println(lst.size());
		
		System.out.println(lst.contains("hello"));
		System.out.println(lst.contains(true));
		System.out.println(lst.contains(10));
		System.out.println(lst.contains(new String("Bangalore")));
		System.out.println(lst.contains(new Orange()));//equals method is not overridden
		System.out.println(lst.contains("hello"));
		
		System.out.println(lst.get(0));
		System.out.println(lst.get(3));
		
		String s1=null;
		
		if(lst.get(2) instanceof String)
		{
			s1=(String) lst.get(2);//we cannot convert object to String
			System.out.println(s1.length());
			
		}
		
		System.out.println("get all the objects to print");
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		System.out.println("get all the objects to print");
		for(Object obj:lst)
		{
			System.out.println(obj);

		}
		
		//to add the object as same type
		//ArrayList<Integer> lst2=new ArrayList<Integer>();
		
		ArrayList<String> lst1=new ArrayList<String>();
		lst1.add("rajesh");
		lst1.add("pinki");
		lst1.add("monkey");
		
		
		ArrayList<Fruit> lst11=new ArrayList<Fruit>();
		lst11.add(new Orange());
         System.out.println(lst11.contains(new Orange()));
         System.out.println(lst.contains(new Orange()));
         
         System.out.println("--------------");

         for(String str:lst1)
         {
             System.out.println(str);

         }
         
         System.out.println("convert collection into array");
         
         Object[] obj=lst1.toArray();
         
         for(Object obj1:lst1)
         {
             System.out.println(obj1);

         }
         System.out.println("---------itrator--------------");

         
         Iterator itr=lst.iterator();
         while(itr.hasNext())
         {
             System.out.println(itr.next());

         }
         
         System.out.println("---------Listitrator--------------");
         
         ListIterator litr=lst.listIterator();
         while(litr.hasNext())
         {
        	 System.out.println(litr.next());

         }
         
         System.out.println("---------going reverse--------------");
         
         while(litr.hasPrevious())
         {
        	 System.out.println(litr.previous());

         }
         
         
         List lst4=new ArrayList();
         
         lst4.add("java");
         lst4.add(100);
         lst4.add(0,true);
         System.out.println(lst4);
         
         lst1.addAll(lst4);
         System.out.println(lst1);

         lst1.addAll(2,lst4);
         System.out.println(lst1);
         
         //lst1.remove(100);
         lst1.remove(new Integer(100));
         System.out.println(lst1);
         



         
        	 
         


         
	}

}
