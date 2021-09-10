package SRP;

public class Main {
    public static void main(String[] args) {
        TextManipulator text_manipulator = new TextManipulator("Adesh kumar shukla");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_PROBLEMS_EXAMPLE"));
        textPrinter.printOutEachWordOfText();
    }
}
