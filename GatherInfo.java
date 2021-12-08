import java.util.Scanner;

public class GatherInfo {

     protected int getDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-January\n2-February\n3-March\n4-April\n5-May\n6-June\n7-July\n8-August\n9-September\n10-October\n11-November\n12-December");
        int monthNumber = scanner.nextInt();
        scanner.close();
        return monthNumber;
    }   
}
