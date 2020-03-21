package character;

public class TestCharacter {

	public static void main(String[] args) {
		
		Character ch = 'a';
		
		char c = ch;
		
		String str = "helloworld";
		
			byte[] by = str.getBytes();
			
			for(byte b : by) {
				
				System.out.println(b);
				
			}

	}

}
