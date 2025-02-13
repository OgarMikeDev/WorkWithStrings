import java.util.Calendar;

public class Main6 {
    public static void main(String[] args) {
        String firstName = "Mike";
        int firstAge = 24;
        double firstWeight = 72.6;
        boolean firstIsStudent = false;
        Calendar firstBirthday = Calendar.getInstance();
        firstBirthday.set(Calendar.YEAR, 2000);
        firstBirthday.set(Calendar.DAY_OF_MONTH, 6);
        firstBirthday.set(Calendar.MONTH, 12 - 1);
        int firstAcademicPerformance = 93;


        String secondName = "Kiril";
        int secondAge = 30;
        double secondWeight = 80.9;
        boolean secondIsStudent = false;
        Calendar secondBirthday = Calendar.getInstance();
        secondBirthday.set(Calendar.YEAR, 1990);
        secondBirthday.set(Calendar.DAY_OF_MONTH, 12);
        secondBirthday.set(Calendar.MONTH, 11 - 1);
        int secondAcademicPerformance = 99;


        //weight, isStudent, data, percent academic performance
        String template = "Current person{%n" +
                          "{\"name\"} : {\"%s\"}; {\"age\"} : {\"%d\"}%n" +
                          "{\"weight}\" : {\"%f\"}; {\"isStudent\"} : \"%b\"%n" +
                          "{\"birthday\"} : {\"%tD\"}; {\"academic performance\"} : {\"%d%%\"}" +
                          "%n}";
        String firstResult = String.format(
                template,
                firstName, firstAge, firstWeight,
                firstIsStudent, firstBirthday, firstAcademicPerformance
                );
        String secondResult = String.format(
                template,
                secondName, secondAge, secondWeight,
                secondIsStudent, secondBirthday, secondAcademicPerformance
                );

        System.out.println(firstResult);
        System.out.println(secondResult);

    }
}
