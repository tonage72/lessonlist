public class LessonList {

    public static void main(String[] args) {

        //String num = "12345";
        //System.out.print(Integer.parseInt(num)+"\n\n");

        GatherInfo gatherInfo = new GatherInfo();

        int monthNumber = gatherInfo.getMonth();
        
        int dayNumber = gatherInfo.getDay();

        int lessonsNumber = gatherInfo.getNumberOfLessons();

        new CreateResult(monthNumber, dayNumber, lessonsNumber);
    }
}