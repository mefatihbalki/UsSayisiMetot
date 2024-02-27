import java.util.Scanner;

public class Main {
    static int ussayi (int base, int exp) {
        if (exp <= 0){
            return 1;
        }
        int result;

    return result = base * ussayi(base,exp - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Taban Sayısını Giriniz: ");
        int base = input.nextInt();

        System.out.print("Lütfen Üssü Sayısını Giriniz: ");
        int exp = input.nextInt();

        System.out.println("Sonuç: " + ussayi(base,exp));

    }

}