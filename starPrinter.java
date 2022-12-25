import java.util.Scanner;

	

public class starPrinter {
	public static void star(int a) {
		for(int j = 0 ; j<a ; j++) {
			System.out.print("*");
		}
	
		
		
	}
	public static void blank(int a){
		for(int j = 0 ; j<a ; j++) {
			System.out.print(" ");
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter a odd number: ");
		int star = input.nextInt() ;
		if(star % 2 == 1) {
			for(int i =1 ; i<=star ; i+=2 ) {
				blank((star-i)/2) ;
				star(i) ;
				blank((star-i)/2) ;

				System.out.println();
			}
			for(int i = star-2 ; i>=1 ; i-=2 ) {
				blank((star-i)/2) ;
				star(i) ;
				blank((star-i)/2) ;
				System.out.println();
				
			}
			
			
			
			
			
		}
		else {
			System.out.print("Its an even number. Please try again . !!!");
		}
		
	}
	
	}

