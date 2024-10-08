import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во раундов: ");
        int x = scan.nextInt();

        kub(x);

    }

    public static void kub(int x) {

        Random random = new Random();
        
        int winsP1 = 0;
        int winsP2 = 0;
        int noWins = 0;

        for (int i = 1; i <= x; i++){

            System.out.println("+++Раунд №" + i + "+++");
            
            int p1 = random.nextInt(1, 7);
            int p2 = random.nextInt(1, 7);

            System.out.println("\nИгрок 1: " + p1 + " очков");
            System.out.println("Игрок 2: " + p2 + " очков");
            if (p1 < p2){
                System.out.println("Победил игрок 1\n");
                winsP1++;
            }else if(p1 > p2){
                System.out.println("Победил игрок 2\n");
                winsP2++;
            }else {
                System.out.println("Ничья\n");
                noWins++;
            }
            
        }
        System.out.println("+++РЕЗУЛЬТАТЫ+++");
        System.out.print("Побед игрока 1: " + winsP1 + "\nПобед игрока 2: " + winsP2 + "\nНичьих: " + noWins);

    }

}
