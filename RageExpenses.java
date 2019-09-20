import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keybordPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();

        double totalPrice = (lostGames / 2) * headsetPrice + (lostGames / 3) * mousePrice + (lostGames / 6) * keybordPrice + (lostGames / 12) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
