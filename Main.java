import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password,pick, tekrarDene;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adı : ");
        userName = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("metin2") && password.equals("3131")) {
            System.out.println("Hesap Bağlandı !");
        } else {
            System.out.println("Hesap Adı yada Şifre Yanlış !\n Şifrenizi Sıfırlamak istiyor musunuz ?");
        }
        pick = input.nextLine();

        if (pick.equals("Yes")) {
            System.out.println("Lütfen Yeni Şifre Giriniz");
            password = input.nextLine();
            System.out.println("Şifreyi Tekrar Girin");
            password = input.nextLine();
        if (password.equals("3131")) {
            System.out.println("Yeni Şifreniz Eskisiyle Aynı Olamaz !\n Tekrar Giriniz !");

        }else {
            System.out.println("Şifre Başarıyla Değiştirildi !");
        }
        }
            tekrarDene = input.nextLine();
            if (tekrarDene.equals("OK")) {
                System.out.println("Farklı bir şifre girmeyi unutmayınız ! \n Şifreyi tekrar giriniz !");
            password = input.nextLine();
            if (password.equals("3131")) {
                System.out.println("Hesabınız Askıya Alındı !");
            }else {
                System.out.println("Şifre Başarıyla Değiştirildi .");
            }

            }



    }           
}