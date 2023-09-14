package com.task.program;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		//t.duplicateElement();
		//t.sorting();
		//t.highestNo();
		//t.secondHighestNo();
		//t.binary();
		//t.reverseString();
		//t.reverseNumber();
		//t.swappingNumber();
		//t.primeNumber();
		//t.a5b3c4();
		//t.a10b5();
		//t.addMatrix();
		//t.multipleMatrix();
	}

	private void multipleMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2},{1,2}};
		int[][] b={{1,2},{1,2}};
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
				c[i][j]+=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void a10b5() {
		// TODO Auto-generated method stub
		String str="a10b5";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				char ch=str.charAt(i-1);
				int n=0;
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

	private void a5b3c4() {
		// TODO Auto-generated method stub
		String str="a5b3c5";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				char ch=str.charAt(i-1);
				int n=str.charAt(i)-48;
				for(int j=0;j<n;j++){
					System.out.print(ch);
				}
			}
		}
	}

	private void primeNumber() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int count=0;
		while(no>div){
			if(no%div==0){
				count++;
			}
			div++;
		}
		if(count==0){
			System.out.println(no+" is prime");
		}
		else{
			System.out.println(no+" not is prime");
		}
	}

	private void swappingNumber() {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+"   "+y);
	}

	private void reverseNumber() {
		// TODO Auto-generated method stub
		int no=1234;
		int rev=0;
		while(no>0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no/=10;
		}
		System.out.println(rev);
	}

	private void reverseString() {
		// TODO Auto-generated method stub
		String str="abcd";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={30,50,10,40,20};
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
			//System.out.println(ch[i]+"===>"+dup[i]);
		}
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<dup.length;i++){
			if(dup[i]>big1){
				big2=big1;
				big1=dup[i];
			}
			else if(dup[i]>big2 && dup[i]<big1){
				big2=dup[i];
			}
		}
		for(int i=0;i<dup.length;i++){
			if(dup[i]==big2){
				System.out.println(ch[i]);
			}
		}
		
		
	}

	private void binary() {
		// TODO Auto-generated method stub
		int[] ar={10,20,20,40,50};
		int min=0;
		int max=ar.length-1;
		int no=30;
		while(min<=max){
			int mid=(min+max)/2;
			if(ar[mid]==no){
				System.out.println("number is present "+mid);
				break;
			}
			else if(ar[mid]>no){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
			if(min>max){
				System.out.println("number not found");
			}
		}
	}

	
}
