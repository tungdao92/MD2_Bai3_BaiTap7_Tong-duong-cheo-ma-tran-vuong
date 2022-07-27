import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Nhập số hàng , cột của ma trận vuông: ");
        x = sc.nextInt();
        int arr [][] = new int[x][x];
        System.out.println("Nhập các phần tử");
        int tong = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("Vị trí: [" + i + " ][ " + j + " ] ");
                arr[i][j] = sc.nextInt();
                if (i == j){
                    tong +=arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính ma trận vuông: " + tong);
    }
}
