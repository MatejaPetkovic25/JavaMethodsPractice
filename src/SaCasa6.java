import java.util.Scanner;

public class SaCasa6 {
    public static void main(String[] args) {
        //Zadatak6:
        //napraviti metodu `int zbirCifaraBroja(int broj)`
        //input: int broj
        //output: int zbirCifara
        //primer: zbirCifaraBroja(1234) -> 10, zbirCifaraBroja(47296) -> 28

        System.out.println(zbirCifaraBroja(1125));
    }

    public static int zbirCifaraBroja (int broj) {
        int zbirCifara = 0;
        int cifra = 0;
        while (broj > 0) {
            cifra = broj % 10;
            zbirCifara = zbirCifara + cifra;
            broj = broj / 10;
        }
        return zbirCifara;
    }
}
