package com.object.scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerClass s=new ScannerClass();
		//s.primeNo();
		//s.divisorOfNo();
		//s.additionOf_N_No();
		//s.printReverseNo();
		//s.reverseNo();
		//s.commonDivisor();
		//s.greatestCommonDivisor();
		//s.smallestCommonDivisor();
		//s.palindrome();
		//s.factorial();
		//s.allFactorial();
		//s.powerOfSquare();
		//s.powerOfCube();
		//s.pattern1();
		//s.pattern2();
		//s.pattern3();
		//s.pattern4();
		//s.printArray();
		//s.jaggedArray();
		//s.fibonacci();
		//int n=s.fact(4);
		//System.out.println(n);
		//s.fibonacciUsingRecursion(10);
		//s.primeNumber();
		//s.amstrongNo();
		//s.neonNo();
		//s.spyNo();
		//s.perfectNo();
		//s.fac(5);
		//s.strongNo();
		//s.duplicateNo();
		//s.a5b5c5();
		//s.a10b5c3();
		//s.ascending();
		//s.palindromeNo();
		//s.mergeArray();
		//s.adjantValue();
		int[] ar={1,2,3,4,5};
		//s.moveLeft(ar);
		//s.nTHleftMove(ar);
		//s.moveRight(ar);
		//s.shiftBetweenFirstAndLast(ar);
		//s.addZero(ar);
		//s.valueContain();
		//s.duplicateCharacter();
		//s.pattern5();
		//s.pattern6();
		//s.pattern7();
		//s.pattern8();
		//s.distinctElement();
		//s.binarySearch();
		//s.longRepeated();
		//s.spiralMethod();
		s.zicZoc();
	}

	private void zicZoc() {
		// TODO Auto-generated method stub
		int[][] ar=new int[5][5];
		int val=1;
		for(int i=0;i<ar.length;i++){
			
			if(i%2==0){
				for(int j=0;j<ar.length;j++){
					ar[i][j]=val++;
				}
			}
			else{
				for(int j=ar.length-1;j>=0;j--){
					ar[i][j]=val++;
				}
			}
		}
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void spiralMethod() {
		// TODO Auto-generated method stub
		int[][] ar=new int[5][5];
		int n=ar.length*ar[0].length;
		int minRow=0;
		int minCol=0;
		int maxRow=ar.length;
		int maxCol=ar[0].length;
		int value=1;
		while(value<=n){
			for(int i=minCol;i<maxCol;i++){
				ar[minRow][i]=value;
				value++;
			}
			minRow++;
			for(int i=minRow;i<maxRow;i++){
				ar[i][maxCol-1]=value;
				value++;
			}
			maxCol--;
			for(int i=maxCol-1;i>=minCol;i--){
				ar[maxRow-1][i]=value;
				value++;
			}
			maxRow--;
			for(int i=maxRow-1;i>=minRow;i--){
				ar[i][minCol]=value;
				value++;
			}
			minCol++;
		}
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private void longRepeated() {
		// TODO Auto-generated method stub
		String str="fdabcydddduabckddddu";
		int n=str.length();
		String lre="";
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				String x=lre(str.substring(i, n),str.subSequence(j, n));
				if(lre.length()<x.length()){
					lre=x;
				}
			}
		}
		System.out.println(lre);
	}

	private String lre(String a, CharSequence b) {
		// TODO Auto-generated method stub
		int n=Math.min(a.length(), b.length());
		for(int i=0;i<n;i++){
			if(a.charAt(i)!=b.charAt(i)){
				return a.substring(0,i);
			}
		}
		return a.substring(0, n);
	}

	private void binarySearch() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50};
		int no=500;
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(no==ar[mid]){
				System.out.println("number present "+mid+" position");
				break;
			}
			else if(no<ar[mid]){
				max=mid-1;
			}
			else{
				min=mid+1;
			}
			if(min>max){
				System.out.println("number is not present");
			}
		}
	
		
	}

	private void distinctElement() {
		// TODO Auto-generated method stub
		String str="sathiyaseelen";
		char[] ch=str.toCharArray();
		int dup[]=new int[ch.length];
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
			if(dup[i]!=-1){
				System.out.print(ch[i]+" ");
			}
			else{
				System.out.print("* ");
			}
		}
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		int n=5;
		int val=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
					System.out.print(val+" ");
					//val--;
			}
			val--;
			System.out.println();
		}
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			int alp=97;
			for(int j=1;j<=i;j++){
				System.out.print((char)alp+" ");
				alp=alp+2;
			}
			System.out.println();
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++){
			int val=2;
			for(int j=1;j<=i;j++){
					System.out.print(val+" ");
					val=val+2;
			}
			System.out.println();
		}
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++){
			int val=1;
			for(int j=i;j<=n;j++){
					System.out.print(val+" ");
					val=val+2;
			}
			System.out.println();
		}
	}

	private void duplicateCharacter() {
		// TODO Auto-generated method stub
		String str="this is string";
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
			//System.out.println(ch[i]+"=>"+dup[i]);
			if(dup[i]==1){
				System.out.print(ch[i]+" ");
			}
		}
	}

	private void valueContain() {
		// TODO Auto-generated method stub
		String str="this is play ground";
		String[] s=str.split(" ");
		String word="";
		int count=0;
		for(String ss:s){
			if(ss.equals("is")){
				
				count++;
				word=word+ss.toUpperCase()+" ";
			}
			else{
				word+=ss+" ";
			}
		}
		System.out.println(count);
		System.out.println(word);
	}
	private void addZero(int[] ar) {
		// TODO Auto-generated method stub
		int[] z=new int[ar.length*2];
		int j=0;
		for(int i=0;i<z.length;i++){
			if(i%2==0){
			z[i]=ar[j];
			j++;
			}
			System.out.print(z[i]);
		}
	}
	private void shiftBetweenFirstAndLast(int[] ar) {
		// TODO Auto-generated method stub
		int temp=ar[0];
		ar[0]=ar[ar.length-1];
		ar[ar.length-1]=temp;
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]);
		}
	}
	private void moveRight(int[] ar) {
		// TODO Auto-generated method stub
		int temp=ar[ar.length-1];
		int i;
		for(i=ar.length-1;i>=1;i--){
			ar[i]=ar[i-1];
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++)
			System.out.print(ar[j]+" ");
	}
	private void nTHleftMove(int[]ar) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++){
			moveLeft(ar);
		}
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}
	private int[] moveLeft(int[] ar) {
		// TODO Auto-generated method stub
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++){
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		for(i=0;i<ar.length;i++){
			//System.out.print(ar[i]+" ");
		}
		return ar;
	}
	private void adjantValue() {
		// TODO Auto-generated method stub
		int[] ar = {1,3,7,12,19}; 
		for(int i=0;i<ar.length-1;i++){
			int small=ar[i]<ar[i+1]?ar[i]:ar[i+1];
			int big=ar[i]>ar[i+1]?ar[i]:ar[i+1];
			int count=0;
			for(int j=small;j<=big;j++){
				System.out.print(j+" ");
				count++;
			}
			System.out.println("  =>("+(count-2)+")");
			System.out.println();
		}
	}
	private void mergeArray() {
		// TODO Auto-generated method stub
		int[] a={10,20,30};
		int[] b={40,50,60};
		int[] c=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++){
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++){
			c[j]=b[i];
			j++;
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}
	private void palindromeNo() {
		// TODO Auto-generated method stub
		int no=17711;
		int temp=no;
		int rev=0;
		while(no>0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(temp==rev){
			System.out.println("palindrome");
		}else{
			System.out.println("not a palindrome");
		}
	}
	private void ascending() {
		// TODO Auto-generated method stub
		int[] ar={10,5,2,3,20,17,25,17};
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
	private void a10b5c3() {
		// TODO Auto-generated method stub
		String str="a10b5c3";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int n=0;
				char ch=str.charAt(i-1);
				while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9' ){
					n=(n*10)+str.charAt(i)-48;
					i++;
				}
				for(int j=0;j<n;j++){
					System.out.print(ch);
				}
			}
		}
	}
	private void a5b5c5() {
		// TODO Auto-generated method stub
		String str="a5b5c5";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				int n=str.charAt(i)-48;
				for(int j=0;j<n;j++){
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}
	private void duplicateNo() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,10,20,10,40,50};
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
			//System.out.print(dup[i]+"=>"+ar[i]+"\t");
		}
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<dup.length;i++){
			if(big1<dup[i]){
				big2=big1;
				big1=dup[i];
			}
			else if(big2<dup[i] && big1>dup[i]){
				big2=dup[i];
			}
		}
		System.out.println(big1);
		System.out.println(big2);
		for(int i=0;i<ar.length;i++){
			if(big2==dup[i])
				System.out.println(ar[i]);
		}
		
	}
	private void strongNo() {
		// TODO Auto-generated method stub
		int no=145;
		int temp=no;
		int sum=0;
		while(no>0){
			int rem=no%10;
			sum=sum+fac(rem);
			no=no/10;
		}
		if(temp==sum)
			System.out.println("strong no");
		else
			System.out.println("not a strong no");
	}
	private int fac(int i) {
		// TODO Auto-generated method stub
		int res=1;
		while(0<i){
			res=res*i;
			i--;
		}
		System.out.println(res);
		return res;
	}
	private void perfectNo() {
		// TODO Auto-generated method stub
		int no=6;
		int div=1;
		int sum=0;
		while(no>div){
			if(no%div==0){
				sum=sum+div;
			}
			div++;
			
		}
		if(no==sum){
			System.out.println("perfect no");
		}
		else{
			System.out.println("not a perfect no");
		}
		
	}
	private void spyNo() {
		// TODO Auto-generated method stub
		int no=132;
		int temp=no;
		int sum=0;
		int mul=1;
		while(no>0){
			int rem=no%10;
			sum+=rem;
			mul*=rem;
			no/=10;
		}
		if(sum==mul)
			System.out.println("spy no");
		else
			System.out.println("not a spy no");
	}
	private void neonNo() {
		// TODO Auto-generated method stub
		int no=9;
		int sqr=no*no;
		int total=0;
		while(sqr>0){
			int rem=sqr%10;
			total=total+rem;
			sqr=sqr/10;
		}
		if(no==total)
			System.out.println("neon no");
		else
			System.out.println("neon a spy no");
	}
	private void amstrongNo() {
		// TODO Auto-generated method stub
		int no=154;
		int temp=no;
		int total=0;
		while(no>0){
			int rem=no%10;
			total+=rem*rem*rem;
			no=no/10;
		}
		if(temp==total)
			System.out.println("amstrong");
		else
			System.out.println("not amstrong");
	}
	private void primeNumber() {
		// TODO Auto-generated method stub
		int no=18;
		int div=2;
		boolean check=true;
		while(no>div){
			if(no%div==0){
				check=false;
				break;
			}
			div++;
		}
		if(check){
			System.out.println("prime no");
		}
		else{
			System.out.println("not a prime");
		}
	}
	int first=0;
	int second=1;
	int third;
	private void fibonacciUsingRecursion(int n) {
		// TODO Auto-generated method stub
		if(n>0){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
			fibonacciUsingRecursion(n-1);
		}
		
	}
	private int fact(int n) {
		if(n==1)
			return 1;
		
		return n*fact(n-1);
	}
	private void fibonacci() {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third;
		int count=10;
		for(int i=0;i<count;i++){
			System.out.print(first+" ");
			third=first+second;
			first=second;
			second=third;
					
		}
	}
	private void jaggedArray() {
		// TODO Auto-generated method stub
		int[][] ar=new int[3][];
		ar[0]=new int[5];
		ar[1]=new int[3];
		ar[2]=new int[1];
		int count=1;
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				ar[i][j]=count++;
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	private void printArray() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[4];
		String[] str=new String[4];
		char[] ch=new char[4];
		for(int i=0;i<ar.length;i++){
			//System.out.println("Enter No");
			//ar[i]=sc.nextInt();
			//System.out.println("Enter String");
			//str[i]=sc.next();
			//str[i]=sc.nextLine();
			System.out.println("Enter Character");
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<str.length;i++){
			System.out.println(ar[i] + "   "+ str[i] +"  "+ ch[i]);
		}
	}
	private void pattern4() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many row you want?");
		int rows=sc.nextInt();

		for(int row=1;row<=rows;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	private void pattern3() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many row you want?");
		int rows=sc.nextInt();

		for(int row=1;row<=rows;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private void pattern2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many row you want?");
		int row=sc.nextInt();
		for(int rows=1;rows<=row;rows++) {
			for(int col=1;col<=row-rows;col++) {
				System.out.print("  ");
			}
			for(int col=1;col<=rows;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}			
	}
	private void pattern1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many row you want?");
		int row=sc.nextInt();
		for(int rows=1;rows<=row;rows++) {
			for(int col=1;col<=(row+1)-rows;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private void powerOfCube() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int no1=sc.nextInt();
		System.out.println("Enter Ending Number");
		int no2=sc.nextInt();
		int result=0;
		while(no1<=no2) {
			result=no1*no1;
			System.out.print(result+"  ");
			no1++;
		}
		
	}

	private void powerOfSquare() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int no1=sc.nextInt();
		System.out.println("Enter Ending Number");
		int no2=sc.nextInt();
		int result=0;
		while(no1<=no2) {
			result=no1*no1*no1;
			System.out.print(result+"  ");
			no1++;
		}
		
	}

	private void allFactorial() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		while (0 < no) {
			int rem=no%10;
			no/=10;
			int fact = 1;
			while (0 < rem) {
				fact = fact * rem;
				rem--;
			}
			System.out.println(fact);
		}
	}

	private void factorial() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int fact=1;
		while(0<no) {
			fact=fact*no;
			no--;
		}
		System.out.println(fact);
	}

	private void palindrome() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int copy=no;
		int reverse=0;
		while(0<no) {
			int rem=no%10;
			reverse=(reverse*10)+rem;
			no=no/10;
		}
		if(copy==reverse) {
			System.out.println(copy+" is palindrome");
		}
		else {
			System.out.println(copy+" is not palindrome");
		}
	}

	private void smallestCommonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int smallest=0;
		while(div<no) {
			if(no%div==0) {
				smallest=div;
				break;
			}
			div++;
		}
		System.out.println(smallest);
	}

	private void greatestCommonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int greatest=0;
		while(div<no) {
			if(no%div==0) {
				greatest=div;
			}
			div++;
		}
		System.out.println(greatest);
	}

	private void commonDivisor() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no1=sc.nextInt();
		System.out.println("Enter the Number");
		int no2=sc.nextInt();
		int div=2;
		while(div<no2) {
			if(no1%div==0 && no2%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
		
		
	}

	private void reverseNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int reverse=0;
		while(0<no) {
			int rem=no%10;
			reverse=(reverse*10)+rem;
			no=no/10;
		}
		System.out.println(reverse);
	}

	private void printReverseNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		while(0<no) {
			int rem=no%10;
			System.out.print(rem);
			no=no/10;
		}
	}

	private void additionOf_N_No() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter Ending Number");
		int end=sc.nextInt();
		int sum=0;
		while(start<=end) {
			sum=sum+start;
			start++;
		}
		System.out.println(sum);
	}

	private void divisorOfNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		while(div<no) {
			if(no%div==0) {
				System.out.print(div+" ");
			}
			div++;
		}
	}

	private void primeNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				count++;
			}
			div++;
		}
		if(count==0) {
			System.out.println(no+" is prime no");
		}
		else {
			System.out.println(no+" is not prime no");
		}
	}

}
