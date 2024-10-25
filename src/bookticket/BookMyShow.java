package bookticket;
import java.util.Scanner;
public class BookMyShow {
	static int ticket=100;
	static int cost=50;
	
	public static void bookticket(Scanner sc) {
		System.out.println("ENTER NUMBER OF TICKETS");
		int count=sc.nextInt();
		ticket=ticket-count;
		System.out.println("TOTAL PRICE  : "+count*cost);
		System.out.println("press....1 for proceed\n press....2 for cancel");
		int cou=sc.nextInt();
		if(cou==1) {
			System.out.println("THANKS FOR THE BOOKING ENJOY THE SHOW 😊😊");
			System.out.println("Available tickets  :"+ticket +"\n");
		}
		else if(cou==2) {
			review(sc);	
		}	
	}
    public static void review(Scanner sc) {
    	System.out.println("ok we will improve ,Thank you");
		
	}
	public static void cancel(Scanner sc) {
		System.out.println("ENTER NUMBER OF TICKETS TO CANCEL");
		int count=sc.nextInt();
		ticket=ticket+count;
		System.out.println("Available tickets  :"+ticket +"\n");
	}
	public static void avilableticket(Scanner sc) {
		System.out.println("TOTAL TICKETS AVAILABLE"+ticket);
		
	}
	public static void operation(Scanner sc) {
		boolean select=true;
		while(select) {
			System.out.println("welcome to the Booking application \n select here\n press....1 for Bookticket"
					+ "\n press....2 for Cancel\n press....3 for Available tickets");
			int a=sc.nextInt();
			
			switch(a) {
			case 1:bookticket(sc);
			break;
			case 2:cancel(sc);
			break;
			case 3:avilableticket(sc);
			break;
			case 4:{System.out.println("Exit");
			select=false;}
			break;
			default:System.out.println("invalid operation");
			}
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		operation(sc);
		
	}

}
