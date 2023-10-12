package com.task.program;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		//t.duplicateElement();
		//t.duplicateNumber();
		//t.sortingElement();
		//t.swappingNo();
		//int[] ar={10,30,50,20,40,50,10};
		//System.out.println(secondBiggestNo(ar));
		//System.out.println(secondSmallestNo(ar));
		//t.reverseElement();
		//t.linearSearch();
		int[] a={1,2,3,4,5};
		//int[] ar=t.leftMove(a);
		//int ar[]=t.rightMove(a);
		//t.moveNthTime(a);
		//reverseNumber();
		//spiralMethod();
		//t.addMatrix();
		//t.multipleMatrix();
		//t.a5b3c3();
		t.a10b10c5();
	}

	

	private void a10b10c5() {
		// TODO Auto-generated method stub
		String str="a10b10c5";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				char ch=str.charAt(i-1);
				int n=0;
				while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9' ){
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
				char ch=str.charAt(i-1);
				int n=str.charAt(i)-48;
				for(int j=0;j<n;j++){
					System.out.print(ch);
				}
			}
		}
	}



	private void multipleMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2},{1,2}};
		int[][] b={{1,2},{1,2}};
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
		int[][] a={{1,2},{1,2}};
		int[][] b={{1,2},{1,2}};
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]+=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}



	private static void spiralMethod() {
		// TODO Auto-generated method stub
		int[][] a=new int[4][4];
		int minRow=0;
		int minCol=0;
		int maxRow=a.length;
		int maxCol=a[0].length;
		int n=maxRow*maxCol;
		int val=1;
		while(val<=n){
			for(int i=minCol;i<maxCol;i++){
				a[minRow][i]=val++;
			}
			minRow++;
			for(int i=minRow;i<maxRow;i++){
				a[i][maxCol-1]=val++;
			}
			maxCol--;
			for(int i=maxCol-1;i>=minCol;i--){
				a[maxRow-1][i]=val++;
			}
			maxRow--;
			for(int i=maxRow-1;i>=minRow;i--){
				a[i][minCol]=val++;
			}
			minCol++;
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}



	private static void reverseNumber() {
		// TODO Auto-generated method stub
		int no=1234;
		int rev=0;
		while(no>0){
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(rev);
	}



	private void moveNthTime(int[] a) {
		// TODO Auto-generated method stub
		int p=2;
		for(int i=0;i<p;i++){
			leftMove(a);
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}



	private int[] rightMove(int[] a) {
		// TODO Auto-generated method stub
		int temp=a[a.length-1];
		int i;
		for(i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		a[i]=temp;
		return a;
	}



	private int[] leftMove(int[] a) {
		// TODO Auto-generated method stub
		int temp=a[0];
		int i;
		for(i=0;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		a[i]=temp;
		return a;
	}



	private void linearSearch() {
		// TODO Auto-generated method stub
		int[] ar={10,20,30,40,50};
		int no=70;
		int min=0;
		int max=ar.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(ar[mid]==no){
				System.out.println("number is present which position is "+ mid );
				break;
			}
			else if(ar[mid]<no){
				min=mid+1;
			}
			else{
				max=mid-1;
			}
			if(min>max){
				System.out.println("number is not present");
			}
		}
	}

	private void reverseElement() {
		// TODO Auto-generated method stub
		String str="amma";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}

	private static int secondSmallestNo(int[] ar) {
		// TODO Auto-generated method stub
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
		return small2;
	}

	private static int secondBiggestNo(int[] ar) {
		// TODO Auto-generated method stub
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
		//System.out.println(big1+"  "+big2);
		return big2;
	}

	private void swappingNo() {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=30;
		x=x+y+z;
		z=x-(y+z);
		y=x-(y+z);
		x=x-(y+z);
		System.out.println(x+"  "+y+"  "+z);
	}

	private void sortingElement() {
		// TODO Auto-generated method stub
		int[] ar={10,5,3,5,10,7,5,5,1};
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

	private void duplicateNumber() {
		// TODO Auto-generated method stub
		int[] ar={10,5,3,5,10,7,5,5,1};
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
				dup[i]=count++;
			}
			System.out.println(ar[i]+">>> "+dup[i]);
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
			System.out.println(ch[i]+"  ==="+dup[i]);
		}
		
		
	}

}
