package com.task.program;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t=new Test5();
		//t.duplicateValue();
		//t.sort();
		//t.maxValue();
		//t.secondMaxValue();
		//t.minValue();
		//t.secondMinValue();
		t.swapValue();
	}

	private void swapValue() {
		// TODO Auto-generated method stub
		int a=10; //20
		int b=20; //30
		int c=30; //10
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		/*int c=a+b;
		a=c-a;
		b=c-b;*/
		a=a+b+c;
		c=a-(b+c);
		b=a-(b+c);
		a=a-(b+c);
		
		System.out.print(a+" "+b+" "+c);
	}

	private void secondMinValue() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,10,70,40};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]<min1){
				min2=min1;
				min1=ar[i];
			}
			else if(ar[i]<min2 && ar[i]>min1){
				min2=ar[i];
			}
		}
		System.out.println(min2);
	}

	private void minValue() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,70,70,40};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]<small){
				small=ar[i];
			}
		}
		System.out.println(small);
	}

	private void secondMaxValue() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,70,70,40};
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>big1){
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2 && ar[i]<big1){
				big2=ar[i];
			}
		}
		System.out.println(big2);
	}

	private void maxValue() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,70,60,40};
		int big=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>big){
				big=ar[i];
			}
		}
		System.out.println(big);
	}

	private void sort() {
		// TODO Auto-generated method stub
		int[] ar={30,10,20,70,60,40};
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

	private void duplicateValue() {
		// TODO Auto-generated method stub
		String str="sathiyaseelan";
		int[] dup=new int[str.length()];
		char[] ch=str.toCharArray();
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
			System.out.println(ch[i]+"  "+dup[i]);
		}
	}

}
