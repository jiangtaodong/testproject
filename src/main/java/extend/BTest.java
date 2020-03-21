package extend;

public class BTest extends ATest{
	
	private int address;
	
	private enum en{A,B,C};
	
	@Override
	public void infoMession() throws Exception,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		super.infoMession();
		
		System.out.println("BTest ---------------- ");
		
	}
	
	public static void info1() {
		
		
		
	}
	
	public void info() {
		
		
		
	}
	
public static void main(String[] args) throws Exception {
		
		ATest b = new BTest();
		
		b.infoMession();
		
		System.out.println(BTest.en.A);
		
	}

}
