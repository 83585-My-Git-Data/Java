

public class Invoice {
private String part_no;
private String part_desc;
private int quantity;
private double price_per_item; 
double total_price;




Invoice(String part_no, String part_desc, int quantity,double price_per_item){
	this.part_no = part_no;
	this.part_desc = part_desc;
	this.quantity = quantity;
	this.price_per_item = price_per_item;
}


public String getPart_no() {
	return part_no;
}

public void setPart_no(String part_no) {
	this.part_no = part_no;
}

public String getPart_desc() {
	return part_desc;
}

public void setPart_desc(String part_desc) {
	this.part_desc = part_desc;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price_per_item;
}

public void setPrice(double price) {
	this.price_per_item = price;
}

void calculate_Invoice() {
	if(quantity<0 && price_per_item<0) {
//		System.out.println("Quantity cannot be Zero !!!");
		quantity = 0;
		price_per_item = 0;
	}
	else {
		total_price = price_per_item  * quantity;
	}
	System.out.println("Total Price is : " + total_price); 
}

}
