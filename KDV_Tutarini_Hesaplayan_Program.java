import java.util.Scanner;

public class KDV_Tutarini_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvTutari, kdvliMiktar, kdvOrani=0.18;

        System.out.println("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();
        if (tutar>0 && tutar<=1000)
        {
            kdvOrani= 0.18;
            kdvTutari= tutar * kdvOrani;
            kdvliMiktar = tutar+kdvTutari;
            System.out.println("KDV'siz tutar: "+tutar);
            System.out.println("KDV oranı: "+ kdvOrani);
            System.out.println("KDV tutarı: "+ kdvTutari);
            System.out.println("KDV'li tutar: "+ kdvliMiktar);
        } else if (tutar>1000) {
            kdvOrani= 0.8;
            kdvTutari= tutar * kdvOrani;
            kdvliMiktar = tutar+kdvTutari;
            System.out.println("KDV'siz tutar: "+tutar);
            System.out.println("KDV oranı: "+ kdvOrani);
            System.out.println("KDV tutarı: "+ kdvTutari);
            System.out.println("KDV'li tutar: "+ kdvliMiktar);
        }

        else {
            System.out.println("Lütfen geçerli bir tutar giriniz!");
        }
    }
}
