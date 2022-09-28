package dayOneAssignment;

public class Video16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "İstanbul";
		sehirler[0][2] = "İstanbul";
		sehirler[1][0] = "İstanbul";
		sehirler[1][1] = "İstanbul";
		sehirler[1][2] = "Afyon";
		sehirler[2][0] = "İstanbul";
		sehirler[2][1] = "İstanbul";
		sehirler[2][2] = "İstanbul";
		
		for (int i = 0; i < sehirler.length; i++) {
			
			System.out.println("------------------");
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
