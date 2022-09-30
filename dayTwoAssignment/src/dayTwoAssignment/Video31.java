package dayTwoAssignment;

public class Video31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video31Product product = new Video31Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		System.out.println(product.getName());
		
		Video31ProductManager productManager = new Video31ProductManager();
		productManager.Add(product);
	}

}
