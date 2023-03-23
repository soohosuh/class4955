package Chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num<10) {
			int n = 2;
						
			while(n<10) {
				System.out.printf(n + "X" + num + "=" + n*num + "\t");
				n++;
			}
			
			//System.out.println("2 x " + num + " = " + num*2);
			//System.out.print("2 x " + num + " = " + num*2);
			//System.out.print("\t 3 x " + num + " = " + num*3);
			//System.out.print("\t 4 x " + num + " = " + num*3);
			//...
			
			//System.out.print("\t 9 x " + num + " = " + num*3);
			
			System.out.println();
			
			num++;
		}
		

	}

}
