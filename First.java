package com.task.simple;

public class First {
	int first=0;
	int second=1;
	int third=0;
	
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
		//f.a5b10c10();
		/*int a=binary(50);
		if(a>0){
			System.out.println(a+" is present");
		}
		else{
			System.out.println("no is not present");
		}*/
		//System.out.println(reverseNo(123478));
		//f.palindrome("malayalam");
		//f.factorial(5);
		//System.out.println(f.recFactorial(3));
		//fibonacci(10);
		//int count=10;
		//f.recFibo(count);
		//f.primeNo();
		//f.findNthPrime();
		//f.addMatrix();
		f.multipleMatrix();
	}

	private void multipleMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2},{4,5}};
		int[][] b={{1,2},{4,5}};
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
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void findNthPrime() {
		// TODO Auto-generated method stub
		int no=2;
		int primeCount=0;
		while(primeCount<5){
		int count=0;
		int div=2;
		while(no>div){
			if(no%div==0){
				count++;
				break;
			}
			div++;
		}
		if(count==0){
		System.out.print(div+" ");
		primeCount++;
		}
		no++;
		}
		
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		int no=17;
		int div=2;
		int count=0;
		while(no>div){
			if(no%div==0){
				count++;
				break;
			}
			div++;
		}
		if(count==0){
			System.out.println("prime no");
		}else{
			System.out.println("not prime no");
		}
	}

	private void recFibo(int count) {
		// TODO Auto-generated method stub
		if(count!=0){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			recFibo(count-1);
		}
		
	}

	private static void fibonacci(int count) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		for(int i=0;i<count;i++){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
		}
	
	}

	private int recFactorial(int i) {
		// TODO Auto-generated method stub
		if(i==0){
			return 1;
		}
		return i*recFactorial(i-1);
	}

	private void factorial(int no) {
		// TODO Auto-generated method stub
		int fact=1;
		while(no>0){
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void palindrome(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		String r="";
		int j=str.length()-1;
		while(j>=0){
			r=r+str.charAt(j);
			j--;
		}
		System.out.println(r);
		if(str.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
		
	}

	private static int reverseNo(int no) {
		// TODO Auto-generated method stub
		int rev=0;
		while(0<no){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		return rev;
	}

	private static int binary(int no) {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50};
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				return ar[mid];
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
		}
		return 0;
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
