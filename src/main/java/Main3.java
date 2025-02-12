public class Main3 {
    public static void main(String[] args) {
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";
        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));
    }

    public static String getEncoding(String header) {
        String charSet = "charset=";
        int start = header.indexOf(charSet);
        if (start < 0) {
            return "";
        }

        int end = header.indexOf(";", start);

        if (end < 0) {
            return "";
        }

        String encoding = header.substring(start + charSet.length(), end);
        return encoding;
    }
}
