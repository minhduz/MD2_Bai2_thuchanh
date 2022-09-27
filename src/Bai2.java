import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền: ");
        double money = scanner.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        int months = scanner.nextInt();
        System.out.print("Nhập lãi suất hằng năm (%): ");
        double laiSuat = scanner.nextDouble();;
        double tongTienLai = 0;
        for (int i = 0; i < months; i++) {
            tongTienLai += money * (laiSuat/100)/12 * months;
        }
        System.out.printf("Tổng tiền lãi là %f",tongTienLai);
    }
}
