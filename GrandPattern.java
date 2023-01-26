package pattern;

import java.util.Scanner;

public class GrandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter any 1 to 9 number");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			GrandPattern.pattern1();
			break;
			
		case 2:
			GrandPattern.pattern2();
			break;
		case 3:
			GrandPattern.pattern3();
			break;
		case 4:
			GrandPattern.pattern4();
			break;	
		case 5:
			GrandPattern.pattern5();
			break;
		case 6:
			GrandPattern.pattern6();
			break;
		case 7:
			GrandPattern.pattern7();
			break;
		case 8:
			GrandPattern.pattern8();
			break;
		case 9:
			GrandPattern.pattern9();
			break;	
		case 11:
			System.out.println("ThankYou!");
			System.exit(0);
			
		}
		}

	}
	
	static void pattern1() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==7||j==4||j==5-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern2() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==7&&i<=4||j==1&&i>=4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern3() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==7) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern4() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4||j==5||j==5-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern5() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==1&&i<=4||j==7&&i>=4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern6() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||j==1||i==7||i==4||j==7&&i>=4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern7() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||j==8-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern8() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==1||j==7)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

static void pattern9() {
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==4||i==7||j==7||j==1&&i<=4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			
	}
			System.out.println();
    }
	}

}
