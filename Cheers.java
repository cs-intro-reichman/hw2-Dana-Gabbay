public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int n = Integer.parseInt(args[1]);
            word = word.toUpperCase();
            String vowels = "AEFHILMNORSX";
            int i = 0;
            char c;
            while (i<word.length())
            {
                c = word.charAt(i);
                if (vowels.indexOf(c) == -1) 
                        System.out.println ("Give me a  "+ c + ": " + c + "!");
                        else
                        System.out.println ("Give me an "+ c + ": " + c + "!");
                i = i+1;
            }
            System.out.println ("What does that spell?");
            while (n>0) 
            {
            System.out.println (word+ "!!!");
            n=n-1;
            }

            
        }
}
