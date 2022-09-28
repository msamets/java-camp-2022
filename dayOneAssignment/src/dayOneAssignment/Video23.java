package dayOneAssignment;



public class Video23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 11;
		boolean varMi = false;
		
		for (int i : sayilar) {
			if(i == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi)
			System.out.println("Sayı mevcuttur.");
		else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
