public class LessonList {

    public static void main(String[] args) {

        GatherInfo gatherInfo = new GatherInfo();

        int monthNumber = gatherInfo.getMonth();
        
        int dayNumber = gatherInfo.getDay();

        int lessonsNumber = gatherInfo.getNumberOfLessons();

        new CreateResult(monthNumber, dayNumber, lessonsNumber);
    }
}