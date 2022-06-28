public class SaCasa3 {
    public static void main(String[] args) {
//Zadatak3:
//napraviti metodu `String obrniString(String s)`
//input: String s
//output: String sObrnuto
//primer: obrniString("cao") -> "oac", obrniString("naravno") -> "onvaran", obrniString("ana") -> "ana"
        System.out.println(obrniString("anan"));
        System.out.println("-----------");
        System.out.println("Da li je palindrom?");
        System.out.println(isPalindrom("anan"));

    }

    public static String obrniString(String s) {
        String sObrnuto = "";
        String [] niz = s.split("");
        for (int i = niz.length - 1; i >= 0; i--) {
            sObrnuto = sObrnuto + niz[i];
        }

        return sObrnuto;
    }
    //BONUS proveri da li je palindrom
    public static boolean isPalindrom (String s) {
       boolean palindrom = false;

        return s.equals(obrniString(s)) ? true : false;
    }
}
