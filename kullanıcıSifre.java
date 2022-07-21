import java.util.Scanner;
public class kullanıcıSifre {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int secim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adinizi giriniz : ");
        userName = inp.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("kerem") && password.equals("123java")){
            System.out.print("Giris Aktiflesti :");
        } else {
            System.out.println("Biilgiler yanlis : ");
            System.out.println("Şifrenizi Değiştirmek İSter Misiniz?\n1-Evet\n2-Hayir");

            secim = inp.nextInt();

            if(secim==1){
                System.out.print("Lutfen Yeni Sifrenizi Giriniz: ");
                newPassword = inp.next();
                if(newPassword.equals("123java")){
                    System.out.print("Yeni Sifreniz Eskisiyle AynI Olamaz!!!");

        }   else {
                    System.out.println("Sifreniz basariyla degistirildi :");}

                }

            }
            }


    }
}
