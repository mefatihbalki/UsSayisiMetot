import java.util.Scanner;

public class Main {
    //Metodun oluşturulduğu yer
    static int ussayi (int base, int exp) {
    //if döngüsü ile tabanın dönüşü hesaplandı
        if (exp <= 0){
            return 1;
        }
        int result;
    //işlemi yaptığımız nokta
    return result = base * ussayi(base,exp - 1);
    }

    public static void main(String[] args) {
    //Kullanıcı Girişleri
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Taban Sayısını Giriniz: ");
        int base = input.nextInt();

        System.out.print("Lütfen Üssü Sayısını Giriniz: ");
        int exp = input.nextInt();
    //Program çıkışı
        System.out.println("Sonuç: " + ussayi(base,exp));

    }

}