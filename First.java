package com.task.simple;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		//f.duplicateElement();
		//f.duplicateNumber();
		//f.sorting();
		//f.secondHighestNo();
		//f.secondSmallestNo();
		//f.binarySearch();
		//f.a5b3c3();
		f.a5b10c10();
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
