import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        } else {
            while (a != b){
                if (a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.printf("Greatest common factor: %d",a);
        }
    }
}
