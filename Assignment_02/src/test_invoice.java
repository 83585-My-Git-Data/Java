
public class test_invoice {

	public static void main(String[] args) {
//		
		
		Invoice in = new Invoice("001","Hammer",2,40 );
		Invoice bin = new Invoice("002","Shoes",3,30 );
		Invoice cin = new Invoice("003","Glasses",5,50 );
		in.calculate_Invoice();
		bin.calculate_Invoice();
		cin.calculate_Invoice();
		
	}

}
