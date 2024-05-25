public class Main {
    public static void main(String[] args) {
        Text simpleText = new PlainText("Hello, World!");

        Text boldText = new BoldText(simpleText);
        Text boldAndUnderlinedText = new UnderlineText(boldText);

        System.out.println(simpleText.render()); // Output: Hello, World!
        System.out.println(boldText.render()); // Output: <b>Hello, World!</b>
        System.out.println(boldAndUnderlinedText.render()); // Output: <u><b>Hello, World!</b></u>
    }
}