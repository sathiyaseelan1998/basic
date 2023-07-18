package com.task.simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic b=new Basic();
		//b.duplicateElement();
		//b.sorting();
		//b.biggestNo();
		//b.secondBiggestNo();
		//b.smallestNo();
		//b.secondSmallestNo();
		//b.binarySearch();
		//b.timeDifference();
		//b.time12HR();
		//System.out.println(minutes("12:00pm-12:30am"));
		//System.out.println(reverse(140));
		//System.out.println(test("bytecode"));
		//b.a5b5c3();
		//b.a10b10c5();
		//b.reverseNo();
		b.fibonacci();
	}

	private void fibonacci() {
		// TODO Auto-generated method stub
		int count=10;
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

	private void reverseNo() {
		// TODO Auto-generated method stub
		int no=1234;
		int rev=0;
		while(no>0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(rev);
		
	}

	private void a10b10c5() {
		// TODO Auto-generated method stub
		String str="a10b10c5";
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int count=0;
				char ch=str.charAt(i-1);
				int n=0;
				while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9'){
					n=(n*10)+(str.charAt(i)-48);
					i++;
				}
				for(int j=0;j<n;j++){
					System.out.print(ch);
					
						count++;
					
				}
				System.out.println("===="+count);
			}
			
		}
		
	}

	private void a5b5c3() {
		// TODO Auto-generated method stub
		String str="a5b5c3";
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int n=str.charAt(i)-48;
				for(int j=0;j<n;j++){
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

	private static String test(String str) {
		// TODO Auto-generated method stub
		String ar[]=str.split(" ");
		String rev="";
		String result="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		if(ar.length==1){
			for(int i=0;i<rev.length();i++){
				if(i==1 || i==rev.length()-1){
					result+="--"+rev.charAt(i)+"--";
				}
				else{
					result+=rev.charAt(i);
				}
			}
			return result;
		}
		return rev;
	}

	private static String reverse(int no) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=1;i<=no;i++){
			total+=i;
		}
		String str=String.valueOf(total);
		if(total>1000){
			
			String output="";
			for(int i=0;i<str.length();i++){
				if(i==0 || i==str.length()-1){
					output+="--"+str.charAt(i)+"--";
				}
				else{
					output+=str.charAt(i);
				}
			}
			//total=Integer.parseInt(output);
			return output; 
		}
		return str;
	}

	private static long minutes(String str) {
		// TODO Auto-generated method stub
		String ar[]=str.split("-");
		for(String s:ar){
			//System.out.println(s);
		}
		SimpleDateFormat df=new SimpleDateFormat("hh:mm");
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm a");
		Date d1=null;
		Date d2=null;
		String s1="";
		String s2="";
		long min=0;
		try {
			d1=df.parse(ar[0]);
			d2=df.parse(ar[1]);
			s1=sdf.format(d1);
			s2=sdf.format(d2);
			d1=sdf.parse(s1);
			d2=sdf.parse(s2);
			long diff=d2.getTime()-d1.getTime();
			long sec=diff/1000;
			 min=sec/60;
			System.out.println(Math.abs(min));
			System.out.println(min);
			
		} catch (Exception e) {
			
		}
		return min;
	}

	private void time12HR() {
		// TODO Auto-generated method stub
		String ss="15:00:00";
		SimpleDateFormat fd=new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat sfd=new SimpleDateFormat("hh:mm:ss a");
		Date t = null;
		String str="";
		try {
			t = fd.parse(ss);
			str=sfd.format(t);
			System.out.println(str);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void timeDifference() {
		// TODO Auto-generated method stub
		String s="8:00:00";
		String e="1:00:00";
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		try {
			Date d1=sdf.parse(s);
			Date d2=sdf.parse(e);
			long diff=d2.getTime()-d1.getTime();
			System.out.println(diff);
			long diffSec=diff/1000;
			long min=diffSec/60;
			System.out.println(min);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		
	}

	private void binarySearch() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,10,58,65,90,6,100};
		int no=1070;
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(ar[mid]==no){
				System.out.println("no is present "+mid+" is position");
				break;
			}
			else if(ar[mid]<no){
				min=mid+1;
			}
			else{
				max=mid-1;
			}
			if(min>max){
				System.out.println("no is not present");
			}
		}
	}

	private void secondSmallestNo() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,5,10,5,65,90};
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(small1>ar[i]){
				small2=small1;
				small1=ar[i];
			}
			else if(small2>ar[i] && small1<ar[i]){
				small2=ar[i];
			}
		}
		System.out.println(small1);
		System.out.println(small2);
	}

	private void smallestNo() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,5,10,10,65,90};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(small>ar[i]){
				small=ar[i];
			}
			
		}
		System.out.println(small);
	}

	private void secondBiggestNo() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,65,10,70,65,90};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++){
			if(big1<ar[i]){
				big2=big1;
				big1=ar[i];
			}
			else if(big2<ar[i] && big1>ar[i]){
				big2=ar[i];
			}
		}
		System.out.println(big1);
		System.out.println(big2);
	}

	private void biggestNo() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,15,10,70};
		int big=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++){
			if(big<ar[i]){
				big=ar[i];
			}
		}
		System.out.println(big);
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,15,10,70};
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

	private void duplicateElement() {
		// TODO Auto-generated method stub
		String str="sathiyaseelan";
		char[] ch=str.toCharArray();
		int[] dup=new int[ch.length];
		for(int i=0;i<ch.length;i++){
			int count=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					dup[j]=-1;
					count++;
				}
			}
			if(dup[i]!=-1){
				dup[i]=count;
			}
			System.out.print(dup[i]+" ");
		}
	}

}
