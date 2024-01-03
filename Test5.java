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
		//t.swapValue();
		//t.duplicateNumber();
		int[] ar={1,2,3,4,5};
		//t.moveNumber(ar);
		//t.moveNTHTime();
		t.a5b3c2();
	}

	private void a5b3c2() {
		// TODO Auto-generated method stub
		String str="a10b3c10";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				char ch=str.charAt(i-1);
				//int n=str.charAt(i)-48;
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

	private void moveNTHTime() {
		// TODO Auto-generated method stub
		int[] ar={1,2,3,4,5};
		int m=3;
		for(int i=0;i<m;i++){
			moveNumber(ar);
		}
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}

	private int[] moveNumber(int[] ar) {
		// TODO Auto-generated method stub
		
		//int temp=ar[0];
		int temp=ar[ar.length-1];
		int i;
		//for(i=0;i<ar.length-1;i++){
			//ar[i]=ar[i+1];
		for(i=ar.length-1;i>=1;i--){
			ar[i]=ar[i-1];
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++){
			//System.out.print(ar[j]+" ");
		}
		return ar;
	}

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		int[] ar={10,10,90,90,20,40,20};
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]){
					System.out.println(ar[i]);
				}
			}
		}
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
