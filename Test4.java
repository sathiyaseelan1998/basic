package com.task.program;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t=new Test4();
		//t.sortElement();
		//t.duplicateElement();
		//t.duplicateNumber();
		//t.swappingNo();
		//t.secondBiggestNo();
		//t.secondSmallestNo();
		t.binarySearch();
	}

	private void binarySearch() {
		// TODO Auto-generated method stub
		int ar[]={10,20,30,40,50};
		int no=70;
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				System.out.println("number present "+ mid +" position");
				break;
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
			if(min>max){
				System.out.println("number not present");
				}
		}
	}

	private void secondSmallestNo() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50,10};
		
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
			System.out.println(small1 + "   "+ small2);
		
	}

	private void secondBiggestNo() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50,40};
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
		System.out.println(big1+"  "+big2);
	}

	private void swappingNo() {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=x+y;
		x=z-x;
		y=z-y;
		System.out.println(x+"  "+y);
		//without using third variable
		int a=100;
		int b=200;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"  "+b);
	}

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		int[] ar={10,20,10,30,40,20};
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
			System.out.println(ar[i]+"  "+dup[i]);
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
				dup[i]=count++;
			}
			System.out.println(ch[i]+"    "+dup[i]);
		}
		
	}

	private void sortElement() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,50,40};
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

}
