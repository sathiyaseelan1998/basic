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
		//t.linearSearch();
		//t.a5b5c3();
		//t.a10b10c3();
		//t.leftMove();
		//t.rightMove();
		//int[] ar={1,2,3,4,5};
		//t.leftNthMove(ar);
		//t.reverseString();
		//t.reverseNumber();
		//t.spiral();
		//t.addMatrix();
		//t.multipleMatrix();
		//t.pattern1();
		//t.pattern2();
		//t.pattern3();
		//t.pattern4();
		//t.pattern5();
		//t.mergeArray();
		//t.swappingArray();
		t.addZero();
	}

	private void addZero() {
		// TODO Auto-generated method stub
		int no=1234;
		int count=4;
		/*while(no>0){
			//int rem=no%10;
			//count++;
			//no=no/10;
		}*/
		System.out.println(count);
		int[] a=new int[2*count];
		
		while(no>0){
			
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
				
					int rem=no%10;
					a[i]=rem;
				
					no=no/10;
			}
			else{
				a[i]=0;
				
			}
			//System.out.print(a[i]);
		}
		}
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]);
		}
	}

	private void swappingArray() {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] c=new int[a.length];
		for(int i=0;i<c.length;i++){
			c[i]=a[i]+b[i];
			a[i]=c[i]-a[i];
			b[i]=c[i]-b[i];
		}
		// without using third variable
		for(int i=0;i<a.length;i++){
			
			a[i]=a[i]+b[i];
			b[i]=a[i]-b[i];
			a[i]=a[i]-b[i];
		}
		
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]+"  "+b[i]);
		}
		
		
	}

	private void mergeArray() {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] c=new int[a.length+b.length];
		int m=0;
		for(int i=0;i<a.length;i++){
			c[m]=a[i];
			m++;
		}
		for(int i=0;i<b.length;i++){
			c[m]=b[i];
			m++;
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		int n=5;
		int alp=65;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(alp-1+j)+" ");
			}
			System.out.println();
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void multipleMatrix() {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b={{1,2,3},{4,5,6},{7,8,9}};
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=0;
				for(int k=0;k<a[i].length;k++){
					c[i][j]+=a[i][k]+b[k][j];
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
		int[] c[]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	private void spiral() {
		// TODO Auto-generated method stub
		int[][] ar=new int[10][10];
		int n=ar.length*ar[0].length;
		int minRow=0;
		int minCol=0;
		int maxRow=ar.length;
		int maxCol=ar[0].length;
		int val=1;
		while(val<=n){
			for(int i=minCol;i<maxCol;i++){
				ar[minRow][i]=val++;
			}
			minRow++;
			for(int i=minRow;i<maxRow;i++){
				ar[i][maxCol-1]=val++;
			}
			maxCol--;
			for(int i=maxCol-1;i>=minCol;i--){
				ar[maxRow-1][i]=val++;
			}
			maxRow--;
			for(int i=maxRow-1;i>=minRow;i--){
				ar[i][minCol]=val++;
			}
			minCol++;
		}
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
	}

	private void reverseNumber() {
		// TODO Auto-generated method stub
		int no=1234;
		int n=0;
		while(0<no){
			int rem=no%10;
			n=(n*10)+rem;
			no=no/10;
		}
		System.out.println(n);
		
	}

	private void reverseString() {
		// TODO Auto-generated method stub
		String str="dhoni";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

	private void leftNthMove(int[] ar) {
		// TODO Auto-generated method stub
		int p=2;
		for(int i=0;i<p;i++){
			rightMove(ar);
		}
		for(int i=0;i<ar.length;i++){
			System.out.print(ar[i]+" ");
		}
	}

	private void rightMove(int[] ar) {
		// TODO Auto-generated method stub
		//int[] ar={1,2,3,4,5};
		int temp=ar[ar.length-1];
		int i;
		for(i=ar.length-1;i>0;i--){
			ar[i]=ar[i-1];
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++){
			//System.out.print(ar[j]+" ");
		}
	}

	private int[] leftMove(int[] ar) {
		// TODO Auto-generated method stub
		//int[] ar={1,2,3,4,5};
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++){
			ar[i]=ar[i+1];
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++){
			//System.out.print(ar[j]+" ");
		}
		return ar;
	}

	private void a10b10c3() {
		// TODO Auto-generated method stub
		String str="a10b10c3";
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

	private void a5b5c3() {
		// TODO Auto-generated method stub
		String str="a5b5c3";
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

	private void linearSearch() {
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
