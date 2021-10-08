import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự");
        String s = sc.nextLine();
        String a = s.toUpperCase();
        System.out.println("Chuyển thành chữ hoa: " + a );
    }
}