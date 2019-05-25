package OOPS2;

public class testProduct {

	public static void main(String[] args) {
	
		String productActualval= "Apple MAcbook";
		Product p= new Product();
		
	p.setProductName("Apple mac");
	p.setProductBrand("Apple");
	p.setProductDescription("16 inches white laptop");
	p.setProductPrice(1.89);
	p.setSelleName(" Xion Inter.");
	
	System.out.println(p.getProductName());

	}

}
