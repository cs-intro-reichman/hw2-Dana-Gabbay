public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int i=0;
		int X=1;
		int num=X;		
		while(X<=N)
		{
			num = X;
			i = 0;
			if (X==1)
			{
				if (mode== 'v')
				{		
				System.out.println ("1 4 2 1 (4)");
				}
				X = X+1;
				
			}
			else
			{
				num = X;
				i=0;
				if (mode=='v')
				{
					System.out.print(X);
					i=i+1;
				while (num!=1)
				{
					if (num%2==0)
						num = num/2;
					else
						num = num*3 +1;
					if (mode=='v')
					{
						System.out.print (" "+num);
						i= i+1;
					}
				}
				if (mode=='v')
					System.out.println (" (" +i+")");
			}
			
			X =X+1;
		}
			
		}
		System.out.println("Every one of the first "+ N + " hailstone sequences reached 1.");
	}
}
	
