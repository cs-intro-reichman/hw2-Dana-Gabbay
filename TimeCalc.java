public class TimeCalc {
    public static void main(String[] args) {
        int time = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1) + args[0].charAt(3) + args[0].charAt(4));
		int minutesToAdd = Integer.parseInt ("" + args [1]);
        int hours = time/100;
        int minutes = time%100;
        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int NewHours = totalHours%24;
        int NewMinutes = totalMinutes - (totalHours*60);
        if (NewHours<10)
            System.out.print("0"+ NewHours);
            else 
            System.out.print (NewHours);
        if (NewMinutes<10)
            System.out.print(":0"+ NewMinutes);
            else
            System.out.print(":"+ NewMinutes);

        

    }
}
