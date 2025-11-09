public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int m = 3;
		double pi = 1;
		int x = -1;
		while (n>1)
		{
			pi = (double)pi+(x*(double)(1.0/m));
			x = x*(-1);
			n = n-1;
			m = m+2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi*4);
	}
}
