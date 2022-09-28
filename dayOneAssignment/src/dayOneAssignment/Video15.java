package dayOneAssignment;

public class Video15 {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,1.4,4.3};
		double total = 0;
		double max = myList[0];
		for (double d : myList) {
			if( max <d)
				max = d;
			
			total += d;
			System.out.println(d);
		}
		
		System.out.println("Toplam = "+total);
		System.out.println("En Büyük = "+ max);
	}

}
