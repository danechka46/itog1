import java.util.Scanner;

public class itog1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        Double kurs = s.nextDouble();
        System.out.print("Количество рублей: ");
        Double sum = s.nextDouble();
        System.out.printf("Итого: %.2f %s", sum/kurs,"долларов");
    }
}
