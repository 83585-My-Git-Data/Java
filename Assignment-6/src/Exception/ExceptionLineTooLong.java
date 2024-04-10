package Exception;

public class ExceptionLineTooLong extends Exception{
	private String mesg;
	public ExceptionLineTooLong(String mesg){
		this.mesg = mesg;
		
		
	} 
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println(mesg);
	}
}
