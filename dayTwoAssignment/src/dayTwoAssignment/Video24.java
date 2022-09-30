package dayTwoAssignment;

public class Video24 {

	public static void main(String[] args) {

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 11;
		boolean varMi = false;

		for (int i : sayilar) {
			if (i == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi)
			mesajVer(" ");
		else {
			mesajVer(" ");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
