package dayOneAssignment;

public class Video18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bug�n hava �ok g�zel";
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split("")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
	}

}
