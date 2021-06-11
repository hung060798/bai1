import java.util.Scanner;

public class docSo {
    public static void main(String[] args) {
        System.out.println("nhap so can doc: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0 && num <10){
            switch (num){
                case 1:
                    System.out.println("mot");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 5:
                    System.out.println("nam");
                    break;
                case 6:
                    System.out.println("sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
                case 0:
                    System.out.println("khong");
                    break;
            }
        }else if(num>=10 && num<20){
            int num1 = num%10;
            switch (num1){
                case 1:
                    System.out.println("elven");
                    break;
                case 2:
                    System.out.println("twe");
                    break;
                case 3:
                    System.out.println("thriteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                case 0:
                    System.out.println("twenty");
                    break;
            }
        }
    }
}
