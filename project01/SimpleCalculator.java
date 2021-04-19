import java.util.Scanner;

public class SimpleCalculator {
	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator cal = new SimpleCalculator();
		Scanner scn = new Scanner(System.in);
		while (true) {
			
			String b = scn.nextLine();
			int indexchar = 0;
			if (b.indexOf('-')!=-1) {
				indexchar = b.indexOf('-');
			}
			if (b.indexOf('+')!=-1) {
				indexchar = b.indexOf('+');
			}

			char c = b.charAt(indexchar);
			int a = Integer.parseInt(b.substring(0, indexchar));
			int d = Integer.parseInt(b.substring(indexchar+1));
			try {
				if ( c == '-') {
					System.out.println(cal.subtract(a, d));
					}
				if ( c == '+') {
					System.out.println(cal.addition(a, d));
				}
			} catch (AddZeroException e) {
				e.printStackTrace();
			} catch (SubtrackZeroExcption e) {
				e.printStackTrace();
			} catch (OutofRangeException e) {
				e.printStackTrace();
			}
			
		}
	}
	public int addition(int a, int b) throws OutofRangeException, AddZeroException{

		if (a==0 || b==0) {
			throw new AddZeroException();
		}
		if (a>1000 || b>1000||a+b>1000) {
			throw new OutofRangeException();
		}
		return a+b;
	}
	public int subtract(int a, int b) throws OutofRangeException, SubtrackZeroExcption{
		
		if( a==0||b==0) {
			throw new SubtrackZeroExcption();
			
		}
		if( a>1000 || b>1000 || a-b<0) {
			throw new OutofRangeException();
		}
		return a-b;
	}
	
}

class OutofRangeException extends Exception {
	
	public OutofRangeException(){
		
	}
}
class AddZeroException extends Exception {
	
	public AddZeroException(){
		
	}
}
class SubtrackZeroExcption extends Exception {
	
	public SubtrackZeroExcption(){
		
	}
}

