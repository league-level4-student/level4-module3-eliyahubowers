package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	static double divide(double one, double two) throws IllegalArgumentException{
		double quotient = one/two;
		if(quotient == 0) {
			throw new IllegalArgumentException(); 
		}else {
			return quotient;
		}
	}
	
	static String reverseString(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException(); 
		}
		String ret = "";
		for(int i = s.length()-1; i > -1; i --) {
			ret += s.charAt(i);
		}
		return ret;
	}
	
}
