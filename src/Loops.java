
public class Loops {
	public static void printStars() {
		for(int i = 0; i<4;i++) {
			for(int c = 0; c<=5;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void printTwo() {
		for(int i = 0; i<4;i++) {
			for(int c = 0; c<=i;c++) {
				System.out.print("2 ");
			}
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void print$() {
		for(int i = 0; i<4;i++){	
			for(int a = 1; a<=(i*2+1);a++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void printStarsTriangle() {
		for(int i = 0; i<4;i++){	
			for(int a = 1; a<=(i*2+2);a++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		System.out.println("\n");
	}
	
	public static void printIntegers1() {
		for(int i = 0; i<4;i++) {
			for(int c = 1; c<=i+1;c++) {
				
				System.out.print(" "+c);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void printIntegers2() {
		for(int i = 1; i<4;i++) {
			for(int c = 1; c<=i*2+1;c++) {		
				System.out.print(" "+c);
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void printIntegers3() {
		for(int i = 0; i<4;i++) {	
			for(int c = 1; c<=i*2+1;c++) {		
				System.out.print(" "+(i+1));
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		 printStars();
		 printTwo();
		 print$();

		 printStarsTriangle();
		 printIntegers1();
		 printIntegers2();
		 printIntegers3();
	
	}
}
