import java.util.Scanner;
public class Main {
    static int toplama(int a, int b){
        int result = a + b;
        System.out.println("İşlem sonucu : " + result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b;
        System.out.println("İşlem sonucu : " + result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a * b;
        System.out.println("İşlem sonucu : " + result);
        return result;
    }
    static double bolme(double a, double b){
        double result = a / b;
        System.out.println("İşlem sonucu : " + result);
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("İşlem sonucu : " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "Lütfen yapmak istediğiniz işlemi seçiniz :\n1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n5- Mod Alma\n6-Çıkış";
        while (true){
            System.out.print("Lütfen ilk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz : ");
            int b = input.nextInt();
            System.out.println(menu);
            select = input.nextInt();
            if ( select == 6){
                break;
            }
            switch (select){
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    mod(a, b);
                    break;
            }
        }
    }
}