
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test in=new Test();
		//in.mergeArray();
		//in.binaryOrNot();
		//in.checkNo();
		//in.palindrome();
		//in.isContain();
		//in.shiftFirstAndLast();
		//in.addZero();
		//in.swappingArray();
		//in.swappingArrayWithout();
		//in.leftIncrease();
		//in.leftDecrease();
		//in.rightIncrease();
		//in.rightDecrease();
		//in.upTriangle();
		//in.downTriangle();
		//in.diamond();
		//in.outlineDiamond();
		//in.outlineSquare();
		//in.Xpattern();
		//in.plusPattern();
		int[] c={1,3,3,5,2,4,6,6,2,6,7,7};
		//in.sorting(c);
		//in.duplicate(c);
		//in.duplicateElement(c);
		//in.secondHighestElement(c);
		//in.spiral();
		//in.spiralPattern();
		//in.zicZoc();
		//in.a1b2c3();
		//in.a10b12();
		//in.checkPalindrome();
		//in.sumOfDigitAndSort();
		//int fact=in.factorial(5);
		//int result=in.powerOfGivenNo(6,3);
		//in.squareRoot();
		//in.binaryToDecimal();
		//in.decimalToBinary();
	}

	
	private void decimalToBinary() {
		// TODO Auto-generated method stub
		int decimal=8;
		String total="";
		while(0<decimal){
			int rem=decimal%2;
			total=rem+total;
			decimal=decimal/2;
		}
		System.out.println(total);
	}


	private void binaryToDecimal() {
		// TODO Auto-generated method stub
		int binary=1000;
		int base=2;
		int power=0;
		int total=0;
		while(binary>0){
			int rem=binary%10;
			rem=rem*powerOfGivenNo(base, power);
			total+=rem;
			power++;
			binary=binary/10;
		}
		System.out.println(total);
		
	}


	private void squareRoot() {
		// TODO Auto-generated method stub
		int no=9;
		int div=2;
		
		while(div<=no/2){
			if(no/div==div){
				System.out.println(div);
			}
			div++;
		}
	}


	private int powerOfGivenNo(int base, int power) {
		
		int total=1;
		if(power==0){
			//System.out.println(1);
			return 1;
		}
		while(power>0){
			total*=base;
			power--;
		}
		//System.out.println(total);
		return total;
	}


	private int factorial(int no) {
		int total=1;
		
		while(no>0){
			total*=no;
			no--;
		}
		System.out.println(total);
		return total;
		
	}


	private void sumOfDigitAndSort() {
		// TODO Auto-generated method stub
		int[] ar={12,11,15,13,24};
		int[] digit=new int[ar.length];
		for(int i=0;i<ar.length;i++){
			int sum=0;
			int n=ar[i];
			while(0<n){
				int rem=n%10;
				sum+=rem;
				n=n/10;
			}
			digit[i]=sum;
			//System.out.print(digit[i]+" ");
		}
		System.out.println();
		for(int i=0;i<digit.length;i++){
			for(int j=i+1;j<digit.length-1;j++){
				if(digit[i]==digit[j]){
					int temp=digit[i]; 
					digit[i]=digit[j]; 
					digit[j]=temp;
					
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
					
				}
				else if(digit[i]>digit[j]){
					int temp=digit[i]; 
					digit[i]=digit[j]; 
					digit[j]=temp;    
					
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
			System.out.print(ar[i]+"("+digit[i]+")"+" ");
		}
	}

	private void checkPalindrome() {
		// TODO Auto-generated method stub
		String str="hi mam how are you madam";
		str+=" ";
		String word="";
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)!=' '){
				word=word+str.charAt(i);
			}
			else{
				if(isPalidrome(word)){
					//System.out.println(word);
				}
				else{
					System.out.print(word+" ");
				}
				word="";
			}
		}
	}

	private boolean isPalidrome(String word) {
		// TODO Auto-generated method stub
		String reverse="";
		for(int i=word.length()-1;i>=0;i--){
			
			reverse=reverse+word.charAt(i);
		}
		if(word.equals(reverse)){
			return true;
		}
		return false;
	}

	private void a10b12() {
		// TODO Auto-generated method stub
		String str="a10b12c1";
		for(int i=0;i<str.length();i++){
					
					if(str.charAt(i)>='0' && str.charAt(i)<='9'){
						int num=0;
						char temp=str.charAt(i-1);
						while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
							num =(num*10)+(str.charAt(i)-48);
							i++;
						}
						for(int j=0;j<num;j++){
							System.out.print(temp);
						}
						//System.out.println(num);
					}
					
				}
			
	}

	private void a1b2c3() {
		// TODO Auto-generated method stub
		String str="a1b2c7d4";
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				
				int n=str.charAt(i)-48;
				//System.out.println(n);
				for(int j=0;j<n;j++){
					System.out.print(str.charAt(i-1));
				}
			}
		}
	}

	private void zicZoc() {
		// TODO Auto-generated method stub
		int[][] a=new int[5][5];
		int value=1;
			for(int i=0;i<a.length;i++){
				
				if(i%2==0){
					for(int j=0;j<a[i].length;j++){
						a[i][j]=value;
						value++;
					}
				}
				else{
					for(int j=a[i].length-1;j>=0;j--){
						a[i][j]=value;
						value++;
					}
				}
		}
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					System.out.print(a[i][j]+"       ");
				}
				System.out.println();
			}
	}

	private void spiralPattern() {
		// TODO Auto-generated method stub
		int[][] a=new int[10][10];
		
		int minCol=0;
		int minRow=0;
		int maxCol=a[0].length;
		int maxRow=a.length;
		int n=maxRow*maxCol;
		int value=1;
		while(value<=n){
			
			
			for(int i=minCol;i<maxCol;i++){ //top-->(left to right)
				a[minRow][i]=value;
				value++;
			}
			minRow++;
			for(int i=minRow;i<maxRow;i++){ //right-->(top to bottom)
				a[i][maxCol-1]=value;
				value++;
			}
			maxCol--;
			for(int i=maxCol-1;i>=minCol;i--){ //bottom-->(right to left)
				a[maxRow-1][i]=value;
				value++;
			}
			maxRow--;
			for(int i=maxRow-1;i>=minRow;i--){ //left-->(bottom to top)
				a[i][minCol]=value;
				value++;
			}
			minCol++;
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"       ");
			}
			System.out.println();
		}
	}

	private void spiral() {
		// TODO Auto-generated method stub
		int[][] a={{1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12},
				  {13,14,15,16}};
		
		int minCol=0;
		int minRow=0;
		int maxCol=a[0].length;
		int maxRow=a.length;
		
		while(minRow<maxRow && minCol<maxCol){
			
			for(int i=minCol;i<maxCol;i++){
				System.out.print(a[minRow][i]+" ");
			}
			minRow++;
			System.out.println();
			for(int i=minRow;i<maxRow;i++){
				System.out.print(a[i][maxCol-1]+" ");
			}
			maxCol--;
			System.out.println();
			for(int i=maxCol-1;i>=minCol;i--){
				System.out.print(a[maxRow-1][i]+" ");
			}
			maxRow--;
			System.out.println();
			for(int i=maxRow-1;i>=minRow;i--){
				System.out.print(a[i][minCol]+" ");
			}
			minCol++;
		}
		
		
	}

	private void secondHighestElement(int[] ar) {
		// TODO Auto-generated method stub
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>big1) {
				big2=big1;
				big1=ar[i];
			}
			else if(ar[i]>big2 && big1>ar[i]) {
				big2=ar[i];
			}
		}
		System.out.println("First biggest no: "+big1);
		System.out.println("Second biggest no: "+big2);
	}

	private void plusPattern() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==n/2+1 || j==n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void Xpattern() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void outlineSquare() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	private void outlineDiamond() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<i;j++){
				if(j==1)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				if(j==i)
					System.out.print("* ");
					else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<n;j++){
				
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				if(j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void diamond() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<n;j++){
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void downTriangle() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<n;j++){
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void upTriangle() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void rightDecrease() {
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

	private void rightIncrease() {
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

	private void leftDecrease() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void leftIncrease() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void swappingArrayWithout() {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int b[]={4,5,6};
		for(int i=0;i<a.length;i++){
			a[i]=a[i]+b[i];
			b[i]=a[i]-b[i];
			a[i]=a[i]-b[i];
			System.out.println(a[i]);
		}
	}

	private void swappingArray() {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int b[]={4,5,6};
		int c[]=new int[a.length];
		System.out.println("before swapping a");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("before swapping b");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
		for(int i=0;i<c.length;i++){
			c[i]=a[i];
			a[i]=b[i];
			b[i]=c[i];
		}
		System.out.println();
		System.out.println("after swapping a");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("after swapping b");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
		
	}

	private void addZero() {
		// TODO Auto-generated method stub
		int a=12345;
		String str=String.valueOf(a);
		char[] arr=str.toCharArray();
		String ss="";
		for(int i=0;i<arr.length;i++){
			
			ss=ss+arr[i]+"0";
		
		}
		int aa=Integer.parseInt(ss);
		System.out.println(aa);
	}

	private void shiftFirstAndLast() {
		// TODO Auto-generated method stub
		int a=3878878;
		String str=String.valueOf(a);
		char[] arr=str.toCharArray();
		char temp=arr[arr.length-1];
		arr[arr.length-1]=arr[0];
		arr[0]=temp;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

	private void isContain() {
		// TODO Auto-generated method stub
		String s="this is string";
		String key="is";
		String merge="";
		int count=0;
		String[] split=s.split(" ");
		for(String ss:split){
			if(ss.contains("is")){
				count++;
				merge=merge+ss+" ";
			}
			else{
				System.out.print(merge.toUpperCase());
				
				merge=ss+" ";
				System.out.print(merge);
			}
		}
		System.out.println(count);
	}


	private void palindrome() {
		// TODO Auto-generated method stub
		String name="abcxyz";
		String rev="";
		for(int i=name.length()-1;i>=0;i--){
			
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}

	private void checkNo() {
		// TODO Auto-generated method stub
		String name="A123CCvv";
		//name=name.toLowerCase();
		boolean check=true;
		for(int i=0;i<name.length();i++){
			
			if(name.charAt(i)>='a' && name.charAt(i)<='z' || name.charAt(i)>='A' && name.charAt(i)<='Z'){
				
				check=false;
				break;
			}
		}
		if(check){
			System.out.println("number");
		}
		else{
			System.out.println("not a number");
		}
	}

	private void binaryOrNot() {
		// TODO Auto-generated method stub
		int a=12100;
		boolean check=true;
		while(a>0){
			if(a%10>1){
				check=false;
			}
			a=a/10;
		}
		if(check){
			System.out.println("binary");
		}
		else{
			System.out.println("not a binary");
		}
	}

	private void mergeArray() {
		// TODO Auto-generated method stub
		int[] a={1,3,3,5};
		int[] b={2,4,6,6};
		int merge=a.length+b.length;
		int[] c=new int[merge];
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
		System.out.println();
		sorting(c);
	/*	for(int i=0;i<c.length;i++){
			int temp=0;
			for(int k=1;k<c.length;k++){
				if(c[k-1]>c[k]){
					temp=c[k-1];
					c[k-1]=c[k];
					c[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("ascending order");
		for(int i=0;i<c.length;i++){
			
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("decending order");
		for(int i=c.length-1;i>=0;i--){
			
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("duplicate element");
		int dup=0;
		for(int i=0;i<c.length;i++){
			for(int k=i+1;k<c.length;k++){
				if(c[i]==c[k]){
					dup++;
					//System.out.print(c[k]+" ");
				}
			}
		}
		
		aumbmcak
		aum
		
		
		*/
		
		int countElement[]=new int[c.length];
		
		for(int i=0;i<c.length;i++){
			int count=1;
			int key=c[i];
			for(int k=i+1;k<c.length;k++){
				if(key==c[k]){
					countElement[k]=-1;
					count++;
				}
				
			}
			if(countElement[i]!=-1){
				countElement[i]=count;
			}
		}
		for(int i=0;i<countElement.length;i++){
			if(countElement[i]==1){
				System.out.print(c[i]+" ");
			}
			//System.out.print(countElement[i]+" ");
		}
		
	}

	private void sorting(int[] c) {
		// TODO Auto-generated method stub
		for(int i=0;i<c.length;i++){
			int temp=0;
			for(int j=1;j<c.length-i;j++){
				
				if(c[j]<c[j-1]){
					temp=c[j];
					c[j]=c[j-1];
					c[j-1]=temp;
				}
			}
	
		}
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		int count=countOfDup(c);
	}

	private int countOfDup(int[] c) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					count++;
					//System.out.println(c[i]);
				}
			}
		}
		//System.out.println("   "+count);
		return count;
	}

private void duplicate(int[] c) {
	// TODO Auto-generated method stub
	for(int i=0;i<c.length;i++){
		for(int j=i+1;j<c.length;j++){
			if(c[i]==c[j]){
				System.out.println(c[i]);
			}
		}
	}
}

private void duplicateElement(int[] c) {
	// TODO Auto-generated method stub
	int countElement[]=new int[c.length];
	for(int i=0;i<c.length;i++){
		int count=1;
		for(int j=i+1;j<c.length;j++){
			if(c[i]==c[j]){
				countElement[j]=-1;
				count++;
			}
		}
		if(countElement[i]!=-1){
			countElement[i]=count;
		}
	}
	for(int i=0;i<countElement.length;i++){
		if(countElement[i]>1 || countElement[i]<0){
		System.out.print("*"+" ");
		}
		else{
			System.out.print(c[i]+" ");
		}
	}
	
	int big=Integer.MIN_VALUE;
	for(int i=0;i<countElement.length;i++){
			if(big<countElement[i]){
				big=countElement[i];
			}
	}
	System.out.println(big);
	for(int i=0;i<countElement.length;i++){
		if(countElement[i]==big){
			System.out.println(c[i]);
		}
}
}

}
