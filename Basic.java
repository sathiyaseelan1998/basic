package com.task.simple;

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
		b.binarySearch();
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
