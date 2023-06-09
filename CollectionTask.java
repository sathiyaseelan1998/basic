package com.task.over;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTask ct=new CollectionTask();
		//ct.methodA();
		//ct.methodB();
		ct.methodC();
	}

	private void methodC() {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(null);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(2);
		System.out.println(al.remove(1));
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ListIterator<Integer> lit=al.listIterator(al.size());
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		System.out.println("--------hashset------");
		HashSet< Integer> hs=new HashSet<>(al);
		for(Integer in:hs){
			System.out.println(in);
		}
		}

	private void methodB() {
		// TODO Auto-generated method stub
		LinkedHashMap< Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "c");
		lhm.put(5, "A");
		Set<Entry<Integer, String>> set=lhm.entrySet();
		for(Entry<Integer, String> entry:set){
			System.out.println(entry.getKey()+"--"+entry.getValue());

		} 
		Set<Integer> key=lhm.keySet();
		for(Integer k:key){
			System.out.println(k);
		}
		Collection<String> value=lhm.values();
		for(String v:value){
			System.out.println(v);
		}
	}

	private void methodA() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "arun");
		hm.put(2, "balu");
		hm.put(null, "ram");
		hm.put(3, "balu");
		Set<Entry<Integer, String>> set=hm.entrySet();
		for(Entry<Integer, String> entry:set){
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}

}
