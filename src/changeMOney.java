import java.util.Scanner;

public class changeMOney {
    public static void main(String[] args) {
        int rate =23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien dola: ");
        int USD = sc.nextInt();
        System.out.println(USD*rate + "VND");
    }
}
