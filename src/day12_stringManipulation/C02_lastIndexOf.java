package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

         /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamis.
                - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.


         */
        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkKullanim = cumle.indexOf(kelime);
        int sonKullanim = cumle.lastIndexOf(kelime);

        if (ilkKullanim == (-1)) {
            System.out.println("girilen kelime kullanilmamais");
        } else if (ilkKullanim == sonKullanim) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }


      String str="EClipse";
        System.out.println(str.lastIndexOf("p"));

    }
}