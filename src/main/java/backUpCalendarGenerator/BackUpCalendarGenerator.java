package backUpCalendarGenerator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BackUpCalendarGenerator implements  BackupCalendarQueryable{

	@Override
	public int getDiskChoiceForDate(int numberOfDisks, int radix, String dateInQuestion) {
		
		// TODO Auto-generated method stub
		
		int dayOfYearAsint  = getdayofYearandYearForDate(dateInQuestion);
		
		String numberAsString  = Integer.toString(dayOfYearAsint, radix);
		
		// get the base representation of the number in the appropriate base 
		
		/*
		Now we start at the right hand of the string and find the position 
		of the first character where it is not 0.
		so 
		 - 1101 returns 2
		 - 1100 returns 1
		 - 11100 returns 3
		then we check if the value is greater than N, if it is return 1.
		*/
		int chosenDisk = 1;
		String valueInString;
		for (int i = numberAsString.length() ; i > -1; i--) {
			valueInString = numberAsString.substring(i-1, i);
			if (Integer.parseInt(valueInString) > 0){
				break;
			}
			else {
				chosenDisk++;
			}
		}
		// Let's check if it is greater than N
		
		if (chosenDisk > numberOfDisks) {
			chosenDisk = 1;
		}
		
		return chosenDisk;
	}

	private int getdayofYearandYearForDate(String dateInQuestion) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	    //String dateString = "10-Jan-1993";
	    int incomingDayofYear = 0;
	    Date date;
	    try{
	    date = sdf.parse(dateInQuestion);
	    //System.out.println("Date: " + date);
	    Calendar calendar = Calendar.getInstance();
	    // Set calendar to the same time as date
	    calendar.setTime(date);
		incomingDayofYear = calendar.get(Calendar.DAY_OF_YEAR);	
	    }
	    catch (Exception e){
	    	System.out.println("Please enter valid Date");
	    	System.exit(0);
	    }
	    return incomingDayofYear;
	}
}
