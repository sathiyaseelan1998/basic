package com.task.program;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		//t.duplicateElement();
		//t.sorting();
		//t.highestNo();
		//t.secondHighestNo();
		t.binary();
	}

	private void binary() {
		// TODO Auto-generated method stub
		int[] ar={50,10,90,70,30};
		/*int min=0;
		int max=ar.length-1;
		int no=10;
		while(min<=max){
			int mid=(min+max)/2;
			if(ar[mid]==no){
				System.out.println("number present");
				break;
			}
			else if(ar[mid]>no){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
			if(min>max){
				System.out.println("number not present");
			}
		}*/
		int min=0;
		int max=ar.length-1;
		int no=10;
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
			
		}
		if(min>max){
			System.out.println(no+" is not present");
		}
	}

	private void secondHighestNo() {
		// TODO Auto-generated method stub
		int[] ar={50,10,90,70,30};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>big1){
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2 && ar[i]<big1){
				big2=ar[i];
			}
		}
		System.out.println(big1);
		System.out.println(big2);
	}

	private void highestNo() {
		// TODO Auto-generated method stub
		int[] ar={50,10,90,70,30};
		int big=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>big){
				big=ar[i];
			}
		}
		System.out.println(big);
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={50,10,20,70,30};
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
			if(dup[i]>1)
			System.out.println(ch[i]+"---->>>"+dup[i]);
		}
		
	}

}
