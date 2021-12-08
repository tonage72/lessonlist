import java.util.ArrayList;

public class CreateResult {

    String[][] monthDays = {{"January","31"},{"February","28"},{"March","31"},{"April","30"},{"May","31"},{"June","30"},{"July","31"},
        {"August","31"},{"September","30"},{"October","31"},{"November","30"},{"December","31"}};

    protected CreateResult(int monthNumber, int dayNumber, int lessonsNumber) {
        for(int i = 0 ; i < 12 ; i++) {
            for(int j = 0 ; j < 2 ; j++) {
                System.out.println(monthDays[i][j] + " ");
            }
        }

        System.out.println(Integer.toString(monthNumber));
        System.out.println(Integer.toString(dayNumber));
        System.out.println(Integer.toString(lessonsNumber));

    }
}