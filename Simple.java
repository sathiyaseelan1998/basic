package com.task.simple;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s=new Simple();
		//s.binarySort();
		//int pos=s.binary();
		//if(pos>0){
			//System.out.println("present in "+pos+" position");
		//}
		//else{
			//System.out.println("not present");
		//}
		//s.sorting();
		//s.descending();
		//s.duplicate();
		//s.duplicateCharacter();
		//s.duplicateCharacterWithoutSpace();
		//s.nonDuplicate();
		//s.mostRepeated();
		s.secondMostRepeated();
	}

	private void secondMostRepeated() {
		// TODO Auto-generated method stub
		String str="sathiyaselelllan";
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
		}
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<dup.length;i++){
			if(big1<dup[i]){
				big2=big1;
				big1=dup[i];
			}
			else if(big2<dup[i] && big1>big2){
				big2=dup[i];
			}
		}
		System.out.println(big1+"  "+big2);
		for(int i=0;i<dup.length;i++){
			if(dup[i]==big2){
				System.out.println(ch[i]);
			}
		}
	}

	private void mostRepeated() {
		// TODO Auto-generated method stub
		String str="sathiyaselelllan";
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
		}
		int big=Integer.MIN_VALUE;
		for(int i=0;i<dup.length;i++){
			if(big<dup[i]){
				big=dup[i];
			}
		}
		for(int i=0;i<dup.length;i++){
			
			if(dup[i]==big){
				System.out.println(ch[i]);
			}
		}
		//System.out.println(big);
	}

	private void nonDuplicate() {
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
			if(dup[i]==1){
				//System.out.print(ch[i]+" ");
			}
			System.out.print(dup[i]+" ");
		}
	}

	private void duplicateCharacterWithoutSpace() {
		// TODO Auto-generated method stub
		String str="hi i am sathya";
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
			if(dup[i]>1 && ch[i]!=' ')
			System.out.println(ch[i]+"   "+dup[i]);
		}
	}

	private void duplicateCharacter() {
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
			if(dup[i]>1)
			System.out.print(ch[i]+" ");
		}
	}

	private void duplicate() {
		// TODO Auto-generated method stub
		int ar[]={10,20,10,30,20,40,50,10,30};
		int dup[]=new int[ar.length];
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
			System.out.print(ar[i]+" ");
		}
	}

	private void descending() {
		// TODO Auto-generated method stub
		int[] ar={50,40,30,70,60,10,20};
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.print(ar[i]+" ");
		}
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={50,40,30,70,60,10,20};
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

	private int binary() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50,60,70};
		int min=0;
		int max=ar.length-1;
		int no=70;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				//System.out.println(no+" is present in "+mid+" position");
				return mid;
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
		}
		return -1;
	}

	private void binarySort() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50,60,70};
		int min=0;
		int max=ar.length-1;
		int no=200;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				System.out.println(no+" is present in "+mid+" position");
				break;
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
		}
		if(min>max){
			System.out.println("not present");
		}
	}

}
