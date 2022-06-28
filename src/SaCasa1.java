import java.util.Scanner;

public class SaCasa1 {
    public static void main(String[] args) {
        //napraviti metodu int apsolut(int broj)
        //input: int broj
        //output: int apsolutBroj
        //primer: apsolut(5) -> 5, apsolut(-5) -> 5, apsolut(0) -> 0
        //Bonus preko skenera
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj da biste dobili apsolutnu vrednost tog broja: ");
        int broj = sc.nextInt();
        System.out.println("Apsolutna vrednost broja je " + apsolut(broj));

        System.out.println("---------------------------");
        System.out.println("stepen dva broja je " + stepen(4, -2));
    }
    public static int apsolut (int broj) {
     //   if (broj < 0) return broj * -1;
     //   return broj;                  Moze jos svedenije da se napise
        return (broj < 0) /*prvo ide uslov (condition)*/ ? -broj /* Ako je tacan ide prvo grananje*/ : broj; /*Ako ne onda drugo*/
    }

    //U NASTAVKU DRUGI ZADATAK GDE POZAJMLJUJEMO OVU METODU APSOLUT
    public static double stepen (double broj, int n) {
        double stepenovaniBr = 1;
        for (int i = 0; i < apsolut(n); i++) {
            stepenovaniBr = stepenovaniBr * broj;
        }
        return (n < 0) ? 1/stepenovaniBr : stepenovaniBr;
    }
}
