package dayOneAssignment;



public class Video22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 220, sayi2 = 284;
		int toplam1 = 0, toplam2 = 0;
		
		
		for (int i = 1; i < sayi1; i++) {
			if(sayi1%i==0)
				toplam1 +=i;
			
		}
		
		
		for (int i = 1; i < sayi2; i++) {
			if(sayi2 %i == 0) {
				toplam2 +=i;
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		}
		else {
			System.out.println("Bu iki sayı arkadaş değildir.");
		}
		
		
	}

}
