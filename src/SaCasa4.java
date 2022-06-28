public class SaCasa4 {
    public static void main(String[] args) {
        //Zadatak4:
        //napraviti metodu `boolean palindrom(String s)`
        //input: String s
        //output: boolean isPalindrom
        //primer: palindrom("cao") -> false, palindrom("anavolimilovana") -> true
        System.out.println(palindrom("anavolimilovana"));

    }
    public static boolean palindrom (String s) {
        boolean isPalindrom = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrom = false;
                break;
            }

        }
        return isPalindrom;
    }
}
