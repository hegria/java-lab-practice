public class StringMethod {
		
	// Returns a string created by adding 's2' after position 'index' of 's1'.
	static String addString(String s1, int index, String s2) {
		String stemp = s1.substring(0,index+1);
		stemp = stemp.concat(s2);
		stemp = stemp.concat(s1.substring(index+1,s1.length()));
		return stemp;
	}
	// Returns a reversed string of 's'
	static String reverse(String s) {
		String stemp = s.substring(s.length()-1,s.length());
		for (int i= s.length()-2; i>=0;i--) {
			stemp = stemp.concat(s.substring(i,i+1));
		}
		return stemp;
	}
	// Returns a string removed all 's2' tokens from 's1'
	static String removeString(String s1, String s2) {
		String stemp = s1.split(s2)[0];
		for (int i=1 ; i< s1.split(s2).length; i++) {
			stemp = stemp.concat(s1.split(s2)[i]);
		}
		return stemp;
	}
	public static void main(String[] args) {
		System.out.println(addString("0123456", 3, "-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000", "00"));
	}
} 