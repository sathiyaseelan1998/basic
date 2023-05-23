package com.task.program;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3();
		//t.duplicateElement();
		//t.firstNonRepeatedElement();
		//t.ascendingOrder();
		//t.biggestNo();
		//t.secondBiggestNo();
		//t.removeSpace();
		//t.a5b2c3();
		//t.a10b10c5();
		//t.primeNo();
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		int no=18;
		int count=0;
		int div=2;
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
			System.out.println(no+" is not prime");
		}
	}

	private void a10b10c5() {
		// TODO Auto-generated method stub
		String str="a10b10c5";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				char ch=str.charAt(i-1);
				int n=0;
				while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9'){
					n=(n*10)+str.charAt(i)-48;
					i++;
				}
				for(int j=0;j<n;j++){
					System.out.print(ch);
				}
			}
		}
	}

	private void a5b2c3() {
		// TODO Auto-generated method stub
		String str="a5b2c3";
		for(int i=0;i<str.length();i++){

			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				
				for(int j=0;j<str.charAt(i)-48;j++){
					System.out.print(str.charAt(i-1));
				}
			}
			
		}
	}

	private void removeSpace() {
		// TODO Auto-generated method stub
		String str="   I am Indian   ";
		System.out.println(str.trim());
	}

	private void secondBiggestNo() {
		// TODO Auto-generated method stub
		int[] ar={23,10,13,50,8,34,50,15,11};
		int big1=0;
		int big2=0;
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(big1<ar[i]){
					big2=big1;
					big1=ar[i];
				}
				else if(big2<ar[i] && big1>ar[i]){
					big2=ar[i];
				}
			}
			}
		System.out.println(big2);
	}

	private void biggestNo() {
		// TODO Auto-generated method stub
		int[] ar={23,10,13,50,8,34,34,15,11};
		int big=0;
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(big<ar[i]){
					big=ar[i];
				}
			}
		}
		System.out.println(big);
	}

	private void ascendingOrder() {
		// TODO Auto-generated method stub
		int[] ar={23,10,13,8,34,34,15,11};
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]>ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}

	private void firstNonRepeatedElement() {
		// TODO Auto-generated method stub
		String str="sathiyaseelan";
		char[] ch=str.toCharArray();
		int[] dup=new int[str.length()];
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
		for(int i=0;i<dup.length;i++){
			if(dup[i]==1){
				System.out.print(ch[i]+" ");
				break;
			}
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
			//System.out.print(dup[i]+" ");
			if(dup[i]>1){
				System.out.print(ch[i]+" ");
			}
		}
	}

}
