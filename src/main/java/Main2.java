public class Main2 {
    public static void main(String[] args) {
        String text = "Я родился в 2000 году!";
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            System.out.print(currentSymbol + " - ");
            if (Character.isDigit(currentSymbol)) {
                System.out.println("является числом!");
            } else if (Character.isLetter(currentSymbol)){
                System.out.println("является буквой!");
            } else {
                System.out.println("не является ни буквой, ни числом!");
            }
        }
    }
}
