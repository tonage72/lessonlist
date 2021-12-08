import java.util.Scanner;

public class GatherInfo {

    Scanner sc = new Scanner(System.in);

    protected int getMonth() {
        System.out.println("1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December");
        int monthNumber = sc.nextInt();
        return monthNumber;
    }

    protected int getDay() {
        System.out.println("Enter day of the month: ");
        int dayNumber = sc.nextInt();
        return dayNumber;
    }

    protected int getNumberOfLessons() {
        System.out.println("Enter number of lessons: ");
        int lessonsNumber = sc.nextInt();
        return lessonsNumber;
    }
}
