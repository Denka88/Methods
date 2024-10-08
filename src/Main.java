import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите сторону а:");
        int a = scan.nextInt();
        System.out.print("Введите сторону b:");
        int b = scan.nextInt();
        System.out.print("Введите сторону c:");
        int c = scan.nextInt();

        triangle(a, b, c);

    }

    public static void triangle(int a, int b, int c){

        if(a + b > c && a + c > b && b + c > a){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }

}