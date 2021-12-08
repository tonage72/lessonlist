public class LessonList {

    public static void main(String[] args) {
        GatherInfo gatherInfo = new GatherInfo();
        int numOfDays = gatherInfo.getDays();
        System.out.println(Integer.toString(numOfDays));
    }
}