package com.task.program;

public class Task {
	int first=0;
	int second=1;
	int third=0;
	private void fibonacci(int count) {
		// TODO Auto-generated method stub
		if(count>0){
			third=first+second;
			first=second;
			second=third;
			System.out.print(third+" ");
			fibonacci(count-1);
		}
	}
	private void vowel() {
		// TODO Auto-generated method stub
		String name="sohaktheaui";
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='a' ||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
				System.out.println(name.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t=new Task();
		int count=20;
		//System.out.print(t.first+" "+t.second+" ");
		//t.fibonacci(count-2);
		//t.vowel();
		//t.primeNo();
		//t.swappingNo();
		//t.reverse();
		t.palindrome();
	}
	private void palindrome() {
		// TODO Auto-generated method stub
		String name="amma";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--){
			reverse=reverse+name.charAt(i);
		}
		if(name.equals(reverse)){
			System.out.println(name+" is palindrome");
		}
		else{
			System.out.println(name+" is not palindrome");
		}
	}
	private void reverse() {
		// TODO Auto-generated method stub
		String name="dhoni";
		for(int i=name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}
	private void swappingNo() {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=20;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1+" "+no2);
	}
	private void primeNo() {
		// TODO Auto-generated method stub
		int no=16;
		int div=2;
		int count=0;
		while(no>div){
			if(no%div==0){
				count++;
			}
			div++;
		}
		if(count==0){
			System.out.println(no+" is prime number");
		}
		else{
			System.out.println(no+" is not prime number");
		}
		
	}
	
	
}
