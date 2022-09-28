package dayOneAssignment;

public class Video21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number  = 6;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if(number %i == 0) {
				total += i;
			}
			
		}
		
		if(total == number) {
			System.out.println("Mükemmel sayıdır.");
		}
		else {
			System.out.println("Mükemmel sayı değildir.");
		}
		
		
	}

}
