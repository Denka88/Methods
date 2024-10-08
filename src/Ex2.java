import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во раундов:");
        int x = scan.nextInt();

        kub(x);

    }

    public static void kub(int x) {

        Random random = new Random();

        int p1 = 0;
        int p2 = 0;

        for (int i = 1; i < x; i++){

            p1+=random.nextInt(6);
            p2+=random.nextInt(6);

            System.out.println("Игрок 1: " + p1 + " очков");
            System.out.println("Игрок 2: " + p2 + " очков");

            if (p1 < p2){
                System.out.println("В раунде " + i + " победил игрок 1");
            }else if(p2 < p1){
                System.out.println("В раунде " + i + " победил игрок 2");
            }else {
                System.out.println("В раунде " + i + " ничья");
            }
        }

        System.out.println("Игрок 1: " + p1 + " очков");
        System.out.println("Игрок 2: " + p2 + " очков");

        if (p1 < p2){
            System.out.println("Победил игрок 1");
        }else if(p2 < p1){
            System.out.println("Победил игрок 2");
        }else {
            System.out.println("Ничья");
        }

    }

}
