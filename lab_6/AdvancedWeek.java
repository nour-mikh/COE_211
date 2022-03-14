public class AdvancedWeek {

    private String day_1 = "Monday";
	private String day_2 = "Tuesday";
	private String day_3 = "Wednesday";
	private String day_4 = "Thursday";
	private String day_5 = "Friday";
	private String day_6 = "Saturday";
	private String day_7 = "Sunday";
	
    public String toString() {	
        int i = 1;
        return i + ": " + day_1 + ",\n" + (i + 1) + ": " + day_2 + ",\n"+ (i + 2) + ": "  + day_3 + ",\n" + (i + 3) + ": " + day_4 + ",\n" + (i + 4) + ": " + day_5 + ",\n" + (i + 5) + ": " + day_6 + ",\n" + (i + 6) + ": " + day_7 + ".";
    }

}	
