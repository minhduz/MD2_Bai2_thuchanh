import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("[[[------MENU------]]]");
            System.out.println("1. Vẽ Tam Giác");
            System.out.println("2. Vẽ Hình Vuông");
            System.out.println("3. Vẽ hình Chữ Nhật");
            System.out.println("0. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6-i; j > 0 ; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 103; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }

    }
}

