package com.task.program;

public class Pattern {
	
	public static void main(String[] args) {
		Pattern p=new Pattern();
		//p.leftIncreaseTriangle();
		//p.leftDecreaseTriangle();
		//p.rightIncreaseTriangle();
		//p.rightDecreaseTriangle();
		//p.upTriangle();
		//p.downTriangle();
		p.diamond();
	}

	private void diamond() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			for(int j=i;j<n;j++){
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
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			for(int j=i;j<n;j++){
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
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			for(int j=1;j<i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void rightDecreaseTriangle() {
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

	private void rightIncreaseTriangle() {
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

	private void leftDecreaseTriangle() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void leftIncreaseTriangle() {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
