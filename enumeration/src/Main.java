public class Main {
    public static void main(String[] args) {
        System.out.println(Colors.RED);
        System.out.println(Colors.GREEN);
        System.out.println(Colors.YELLOW);

        System.out.println("-----");

        Colors selectedColor = Colors.BLUE;
        System.out.println(selectedColor);

        System.out.println("-----");

        Colors newColor = Colors.RED;
        System.out.println(newColor.hexCode);
    }
}