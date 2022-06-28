public class SaCasa2 {
    public static void main(String[] args) {
        //Zadatak2:
        //napraviti metodu `int stepen(int broj, int n)`
        //input: int broj, int n
        //output: broj "na" n, odnosno, broj^n
        //primer: stepen(2, 3) -> 8, stepen(4, 3) -> 64, stepen(0, 2) -> 0, stepen(3, 0) -> 1, stepen(-1, 3) -> -1
        //BONUS napraviti da radi i za negativan stepen

        System.out.println("Stepen unetih brojeva je " + stepen(4, -2));

    }
    public static double stepen (double broj, double n) {
        double stepenovanje = 1;
        for (int i = 0; i < n; i++) {
            stepenovanje = stepenovanje * broj;

        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                stepenovanje = stepenovanje * broj;
            }
            stepenovanje = 1 / stepenovanje;
            return stepenovanje;
        }
        return stepenovanje;
    } // U klasi SaCasa1 ima bolje resenje za ovaj drugi deo zadatka, ali podrazumeva koriscenje jos jedne metode
}
