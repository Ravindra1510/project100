package qspiders;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap hm1=new TreeMap();
		hm1.put("nz","NewZealand");
		hm1.put("ind","India");
		hm1.put("uk","unitedKingdom");
		
		System.out.println(hm1);
		System.out.println(hm1.descendingMap());
		System.out.println(hm1.tailMap("ind"));
		System.out.println(hm1.headMap("uk"));

	}

}
