package qspiders;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveMultipleSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String str=" Hello   I   am     learning     java    and    selenium";
		String words[]=str.split(" ");
		
		String str1=" ";
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>0)
			{
				str1=str1+words[i]+" ";
			}
			System.out.println(str1);
		}*/
		
		
	/*	ArrayList lst=new ArrayList<>();
		lst.add(100);
		lst.add("Hello");
		lst.add(true);
		
		LinkedList lst1=new LinkedList(lst);
		System.out.println(lst1);*/
		
		/*LinkedList lst=new LinkedList<>();
		lst.add(100);
		lst.add("hello");
		lst.add(true);
		
		ArrayList lst1=new ArrayList(lst);
		System.out.println(lst);*/
		
	/*	ArrayList lst=new ArrayList<>();
		lst.add(100);
		lst.add("hello");
		
		Object[] objs=lst.toArray();
		for(Object o:objs)
		{
			System.out.println(o);
		}*/
		
		
	/*	int marks[]={70,80,90};
		
		ArrayList lst=new ArrayList<>();
		for(int mark:marks)
			lst.add(mark);
		System.out.println(lst);*/
		
	/*	ArrayList lst=new ArrayList<>();
		lst.add(100);
		lst.add("hello");
		//lst.add("hello");
		
		HashSet set=new HashSet<>(lst);
		System.out.println(set);*/
		
	/*	HashSet set=new HashSet<>();
		set.add(100);
		set.add("hello");
		
		ArrayList lst=new ArrayList<>(set);
		System.out.println(lst);*/
		
		
		int i=10;
		String s=Integer.toString(i);
		System.out.println(s);
		
		float f=10.2f;
		String s1=Float.toString(f);
		System.out.println(s1);
		
		String s2="100";
		
		int i1=Integer.parseInt(s2);
		System.out.println(i1);
		
		String s3="56.7";
		
		double d=Double.parseDouble(s3);
		System.out.println(d);
		
		int i3=20;
		Integer ii=new Integer(i3);
		System.out.println(ii);
		
		int k=ii.intValue();
		System.out.println(k);
		
		double d1=22.3;
		Double dd=new Double(d1);
		System.out.println(dd);
		
		double d2=dd.doubleValue();
		System.out.println(d2);
		
		Orange o1=new Orange();
		String ss=o1.toString();
		System.out.println(ss);
		
		String ss2=new Orange().toString();
		
		
		
		
		
		
		
		
			
		
		
		
		
		

	}

}
