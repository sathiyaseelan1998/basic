package com.task.simple;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic b=new Basic();
		//b.duplicateElement();
		//b.sorting();
		
	}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar={30,20,50,15,10,70};
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
			System.out.print(dup[i]+" ");
		}
	}

}
