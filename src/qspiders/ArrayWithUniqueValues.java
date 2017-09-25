package qspiders;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayWithUniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int arr[]={0,0,0,1,2,1,0,3,4,5,5,5,4,6,7,8};
		
		Set set=new HashSet();
		
		for(int i:arr)
			set.add(i);
		
		int arr1[]=new int[set.size()];
		//System.out.println(arr1);
		int k=0;
		
		for(Object obj:set)
			arr1[k++]=((Integer)obj).intValue();
		
		System.out.println(Arrays.toString(arr1));*/
		
		
	/*	int[] arr={10,20,30};
		for(int i=0;i<arr.length;i++)
			arr[2]=0;
		
		for(int i:arr)
			System.out.println(i);*/
		
		HashMap map=new HashMap();
		map.put("ind", "India");
		map.put("nz", "newzeland");
		map.put("ut", "unitedkingdom");
		
		System.out.println(map.size());
		
		System.out.println(map);
		
	/*	System.out.println(map.get("ind"));
		
		System.out.println(map.values());
		
		System.out.println(map.containsKey("ind"));
		System.out.println(map.containsValue("India"));*/
		
	/*	Set key=map.keySet();
		//System.out.println();
		
		Iterator itrKey=key.iterator();
		String s;
		
		while(itrKey.hasNext())
		{
			System.out.println(s=(String)itrKey.next());
			System.out.println(map.get(s));*/
			
			/*Set keys=map.keySet();
			for(Object o:keys)
			{
				System.out.println(o);
		}*/
		
		Collection<String> values=map.values();
		Iterator itr2=values.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
		
		

	}


