public class Main6 {
    public static void main(String[] args) {
        String name = "Mike";
        int birthYear = 2000;

        String secondName = "Sofia";
        int secondBirth = 2005;

        //{"name" : "Mike", "birthYear" : "2000"}
        String template = "{\"name\" : \"%s\", \"birthYear\" : \"%d\"}";
        String result = String.format(template, name, birthYear);
        String secondResult = String.format(template, secondName, secondBirth);

        System.out.println(result);
        System.out.println(secondResult);
    }
}
