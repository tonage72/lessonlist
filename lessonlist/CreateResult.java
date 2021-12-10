package lessonlist;

public class CreateResult {

    String[][] monthDays = {{"January","31"},{"February","28"},{"March","31"},{"April","30"},{"May","31"},{"June","30"},{"July","31"},
        {"August","31"},{"September","30"},{"October","31"},{"November","30"},{"December","31"}};

    protected CreateResult(int monthNumber, int dayNumber, int lessonsNumber) {
        
        monthNumber = monthNumber -1;

        for(int i = 0; i < lessonsNumber; i++) {
            System.out.println(monthDays[monthNumber][0] + " " + dayNumber + " - " + "Ch " + Integer.toString(i + 1));
        
            if (dayNumber == Integer.parseInt(monthDays[monthNumber][1])) {
                if (monthNumber == 11) {
                    monthNumber = 0;
                    dayNumber = 1;
                } else {
                    monthNumber = monthNumber + 1;
                    dayNumber = 1;
                }
            } else {
                dayNumber++;
            }
        }
    }
}