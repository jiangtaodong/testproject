package functiondemo;

public class MainClass {

	public static void main(String[] args) {
		
		int ndisks = 3;
		
		doTower(ndisks,'A','B','C');

	}

	public static void doTower(int topN, char from, char inter, char to) {
		
		if(topN == 1) {
			
			 System.out.println("Disk 1 from " + from + " to " + to);
			            
			
		}else {
			
			doTower(topN - 1, from, to, inter);
			
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			
			doTower(topN - 1, inter, from, to);
			
		}
		
	}

}
