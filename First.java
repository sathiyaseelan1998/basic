package com.task.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class First {
	int first=0;
	int second=1;
	int third=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		use basic;

select * from customer order by salary desc;

-- nth number of salary --

select distinct(salary) from customer c1 where 5=(select count(distinct(salary)) from customer c2 where c2.salary>=c1.salary);

select * from employee;

select * from branch;

select branchId,count(branchId) from employee group by branchId;

select branch,count(e.branchId) from employee e inner join branch b on e.branchId=b.branchId group by e.branchId;


select * from employee where branchId =(select branchId from branch where branch='chennai');
		*/
		First f=new First();
		//f.duplicateElement();
		//f.duplicateNumber();
		//f.sorting();
		//f.secondHighestNo();
		//f.secondSmallestNo();
		//f.binarySearch();
		//f.a5b3c3();
		//f.a5b10c10();
		/*int a=binary(50);
		if(a>0){
			System.out.println(a+" is present");
		}
		else{
			System.out.println("no is not present");
		}*/
		//System.out.println(reverseNo(123478));
		//f.palindrome("malayalam");
		//f.factorial(5);
		//System.out.println(f.recFactorial(3));
		//fibonacci(10);
		//int count=10;
		//f.recFibo(count);
		//f.primeNo();
		//f.findNthPrime();
		//f.addMatrix();
		//f.multipleMatrix();
		//f.arrayList();
		//f.linkedList();
		//f.hashSet();
		//f.linkedHashSet();
		//f.treeSet();
		//f.hashMap();
		//f.linkedHashMap();
		//f.treeMap();
		//f.spiralPattern();
		//f.zicZoc();
		//f.longestRepeatedElement();
		int ar[]={1,2,3,4,5};
		ar=f.leftMove(ar);
	
	}


	private int[] leftMove(int[] ar) {
		// TODO Auto-generated method stub
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++){
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		return ar;
	}


	private void longestRepeatedElement() {
		// TODO Auto-generated method stub
		String str="abchghfxyzzhaxyzzbcjhgg";
		int n=str.length();
		String lre="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String x=lre(str.substring(i, n),str.substring(j, n));
				if(lre.length()<x.length()){
					lre=x;
				}
			}
		}
		System.out.println(lre);
	}


	private String lre(String a, String b) {
		// TODO Auto-generated method stub
		int n=Math.min(a.length(), b.length());
		for(int i=0;i<n;i++){
			if(a.charAt(i)!=b.charAt(i)){
				return a.substring(0, i);
			}
		}
		return a.substring(0, n);
	}


	private void zicZoc() {
		// TODO Auto-generated method stub
		int[][] ar=new int[7][7];
		int value=1;
		for(int i=0;i<ar.length;i++){
			if(i%2==0){
				for(int j=0;j<ar[i].length;j++){
					ar[i][j]=value++;
				}
			}
			else{
				for(int j=ar[i].length-1;j>=0;j--){
					ar[i][j]=value++;
				}
			}
		}
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}


	private void spiralPattern() {
		// TODO Auto-generated method stub
		int[][] spiral=new int[4][4];
		int minRow=0;
		int minCol=0;
		int maxRow=spiral.length;
		int maxCol=spiral[0].length;
		int n=maxRow*maxCol;
		int value=1;
		while(value<=n){
		}
	}


	private void treeMap() {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> hm=new TreeMap<>();
		hm.put(1, "aa");
		//hm.put(null, "aa");
		hm.put(1, "bb");
		hm.put(2, "cc");
		hm.put(3, "dd");
		
		Set<Entry<Integer,String>> set=hm.entrySet();
		Set<Integer> key=hm.keySet();
		Collection<String> val=hm.values();
		for(Entry<Integer,String> e:set){
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}

	private void linkedHashMap() {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
		hm.put(1, "aa");
		hm.put(null, "aa");
		hm.put(1, "bb");
		hm.put(2, "cc");
		hm.put(3, "dd");
		
		Set<Entry<Integer,String>> set=hm.entrySet();
		Set<Integer> key=hm.keySet();
		Collection<String> val=hm.values();
		for(Entry<Integer,String> e:set){
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}

	private void hashMap() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "aa");
		hm.put(null, "aa");
		hm.put(1, "bb");
		hm.put(2, "cc");
		hm.put(3, "dd");
		
		Set<Entry<Integer,String>> set=hm.entrySet();
		Set<Integer> key=hm.keySet();
		Collection<String> val=hm.values();
		for(Entry<Integer,String> e:set){
			System.out.println(e.getKey()+"---"+e.getValue());
		}
		System.out.println("---------------");
		for(Integer s:key){
			System.out.println(s);
		}
		System.out.println("---------------");
		for(String c:val){
			System.out.println(c);
		}
		
	}

	private void treeSet() {
		// TODO Auto-generated method stub
		TreeSet< Integer> hs=new TreeSet<>();
		hs.add(1);
		hs.add(1);
		//hs.add(null);		NullPointerException
		hs.add(2);
		hs.add(4);
		hs.add(3);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

	private void linkedHashSet() {
		// TODO Auto-generated method stub
		LinkedHashSet< Integer> hs=new LinkedHashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(null);
		hs.add(2);
		hs.add(4);
		hs.add(3);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

	private void hashSet() {
		// TODO Auto-generated method stub
		HashSet< Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(null);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
	}

	private void linkedList() {
		// TODO Auto-generated method stub
		LinkedList<Integer> al=new LinkedList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(null);
		al.add(5);
		al.add(2);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

	private void arrayList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(null);
		al.add(5);
		al.add(2);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()){
			//al.add(9);    		ConcurrentModificationException
			System.out.println(it.next());
		}
		
	}

	private void multipleMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2},{4,5}};
		int[][] b={{1,2},{4,5}};
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=0;
				for(int k=0;k<a[i].length;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void addMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3},{4,5,6}};
		int[][] b={{1,2,3},{4,5,6}};
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void findNthPrime() {
		// TODO Auto-generated method stub
		int no=2;
		int primeCount=0;
		while(primeCount<5){
		int count=0;
		int div=2;
		while(no>div){
			if(no%div==0){
				count++;
				break;
			}
			div++;
		}
		if(count==0){
		System.out.print(div+" ");
		primeCount++;
		}
		no++;
		}
		
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		int no=17;
		int div=2;
		int count=0;
		while(no>div){
			if(no%div==0){
				count++;
				break;
			}
			div++;
		}
		if(count==0){
			System.out.println("prime no");
		}else{
			System.out.println("not prime no");
		}
	}

	private void recFibo(int count) {
		// TODO Auto-generated method stub
		if(count!=0){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			recFibo(count-1);
		}
		
	}

	private static void fibonacci(int count) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		for(int i=0;i<count;i++){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
		}
	
	}

	private int recFactorial(int i) {
		// TODO Auto-generated method stub
		if(i==0){
			return 1;
		}
		return i*recFactorial(i-1);
	}

	private void factorial(int no) {
		// TODO Auto-generated method stub
		int fact=1;
		while(no>0){
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void palindrome(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		String r="";
		int j=str.length()-1;
		while(j>=0){
			r=r+str.charAt(j);
			j--;
		}
		System.out.println(r);
		if(str.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}

	private static int reverseNo(int no) {
		// TODO Auto-generated method stub
		int rev=0;
		while(0<no){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		return rev;
	}

	private static int binary(int no) {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50};
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				return ar[mid];
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
		}
		return 0;
	}

	private void a5b10c10() {
		// TODO Auto-generated method stub
		String str="a5b10c10";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int n=0;
				char ch=str.charAt(i-1);
				while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
					n=(n*10)+(str.charAt(i)-48);
					i++;
				}
				for(int j=0;j<n;j++){
					System.out.print(ch);
				}
			}
		}
	}

	private void a5b3c3() {
		// TODO Auto-generated method stub
		String str="a5b3c3";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int n=str.charAt(i)-48;
				for(int j=0;j<n;j++){
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

	private void binarySearch() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50};
		int min=0;
		int max=ar.length-1;
		int no=20;
		while(min<=max){
			int mid=(min+max)/2;
			if(ar[mid]==no){
				System.out.println(no+" is present "+mid+" posistion");
				break;
			}
			else if(ar[mid]>no){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
			if(min>max){
				System.out.println(no+" is not present");
			}
			
		}
	}

	private void secondSmallestNo() {
		// TODO Auto-generated method stub
		int[] ar={10,10,15,3,2,15,8,2,7,2};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]<small1){
				small2=small1;
				small1=ar[i];
			}
			else if(ar[i]<small2 && small1<ar[i]){
				small2=ar[i];
			}
		}
		System.out.println(small1+"==="+small2);
	}

	private void secondHighestNo() {
		// TODO Auto-generated method stub
		int[] ar={10,10,15,3,2,15,8,2,7,2};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>big1){
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2 && big1>ar[i]){
				big2=ar[i];
			}
		}
		System.out.println(big1+"==="+big2);
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={10,10,5,3,2,5,8,2,7,2};
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]>ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.print(ar[i]+" ");
		}
	}

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		int[] ar={10,10,5,3,2,5,8,2,7,2};
		int[] dup=new int[ar.length];
		for(int i=0;i<ar.length;i++){
			int count=1;
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]){
					dup[j]=-1;
					count++;
				}
			}
			if(dup[i]!=-1){
				dup[i]=count;
			}
			if(dup[i]>1)
			System.out.println(ar[i]+"--> "+dup[i]);
		}
	}

	private void duplicateElement() {
		// TODO Auto-generated method stub
		String str="sathiyaseelan";
		char[] ar=str.toCharArray();
		int[] dup=new int[ar.length];
		for(int i=0;i<ar.length;i++){
			int count=1;
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]){
					dup[j]=-1;
					count++;
				}
			}
			if(dup[i]!=-1){
				dup[i]=count;
			}
			if(dup[i]>1)
			System.out.println(ar[i]+"--->  "+dup[i]);
		}
	}

}
