import java.text.ChoiceFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Odevler41 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz.");

        String ates = ruzgar.nextLine();
        
        System.out.println("İlk Sayı: "+ ates +" İkinci sayıyı giriniz.");
        
        String ates1 = ruzgar.nextLine();
        
        System.out.println("İlk Sayı:"+ ates + "İkinci Sayı:" + ates1 + "Üçüncü Sayıyı Girin.");
        
        String ates2 = ruzgar.nextLine();
        
        System.out.println("Tüm Sayıları Girdiniz İşleminiz Yapılıyor");
        
                double ates3 = Double.parseDouble(ates);
                        double ates4 = Double.parseDouble(ates1);
                                double ates5 = Double.parseDouble(ates2);

        
        Double[] sayilar = {ates3,ates4,ates5};
        
        Arrays.sort(sayilar);
    
        System.out.println("Sıralı Hali (Küçükten Büyüğe):");
        
        System.out.println(sayilar[0] + " < " + sayilar[1] + " < " + sayilar[2]);
        
    }
} // İf ile sıraladıgımda çok uzun sürüyodu bide neredeyse 9 tane ayrı ayrı if kullandım bunları sort yapmak daha kolay yine string olarak alıp double yaptım cünkü direkt double yapınca 5.5 gibi kabıl etmiyo