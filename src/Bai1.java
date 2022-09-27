import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean check = true;

        if(number<2){
            check = false;
        }

        for (int i = 2; i < number-1; i++) {
            if(number % i ==0){
                check = false;
            }
        }

        if (check){
            System.out.printf("%d là số nguyên tố",number);
        } else {
            System.out.printf("%d không phải số nguyên tố",number);
        }
    }
}