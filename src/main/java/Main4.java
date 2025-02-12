public class Main4 {
    public static void main(String[] args) {
        String firstText =
                "Hello! My name is Mike. " +
                        "My number phone: 89676400942. " +
                        "I leave in the city Sochi!";
        String secondText =
                "Hello! My name is Marina. " +
                        "My number phone: 89676400910. " +
                        "I leave in the city Sochi!";
        String thirdText =
                "Hello! My name is Artem. " +
                        "My number phone: 89676400999. " +
                        "I leave in the city Sochi!";

        String fourthText =
                "Hello! My name is Gena. " +
                        "I leave in the city Sochi!";

        String fifthText =
                "Hello! My name is Ulya. " +
                        "My number phone: ";

        System.out.println(getNumberPhone(firstText));
        System.out.println(getNumberPhone(secondText));
        System.out.println(getNumberPhone(thirdText));
        System.out.println(getNumberPhone(fourthText));
        System.out.println(getNumberPhone(fifthText));
    }

    public static String getNumberPhone(String text) {
        String textNumberPhone = "number phone:";
        int start = text.indexOf(textNumberPhone);

        if (start < 0) {
            return "";
        }

        int end = text.indexOf(".", start);
        if (end < 0) {
            return "";
        }

        String numberPhone = text.substring(
                start + textNumberPhone.length(), end);

        return numberPhone;
    }
}
