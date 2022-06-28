import java.util.Arrays;

public class SaCasa5 {
    public static void main(String[] args) {
//Zadatak5:
//napraviti metodu `int[] presekNiza(int[] a, int[] b)`
//input: int[] a, int[] b
//output: int[] presek
//primer: presekNiza(new int[]{1,2,3,4,5}, new int[]{1,4,3,8,5,10}) -> new int[] {1,3,5}
//			presekNiza(new int[]{1, 3, 5}, new int[]{2,4,6}) -> {}

       System.out.println(Arrays.toString(presekNiza(new int[] {1, 2, 2, 4, 5, 5, 3}, new int[]{2, 5, 3, 5})));
       // System.out.println(Arrays.toString(presekNiza(new int[]{1, 2, 3, 4, 5}, new int[]{1, 4, 3, 9})));

    }
    public static int[] presekNiza(int[] a, int[] b) {
       int duzina;
       int duzinaKracegNiza;
        if (a.length > b.length) {
            duzina = a.length;
            duzinaKracegNiza = b.length;
        } else {
            duzina = b.length;
            duzinaKracegNiza = a.length;
        }

        int [] presek = new int[duzina];
        int z = 0;

        for (int i = 0; i < duzina; i++) {
            for (int j = 0; j < duzinaKracegNiza; j++) {
                if (a[i] == b[j]) {
                    presek[z] = a[i];
                    z++;
                }
            }
        }
        int[] rezultujuciNizBezNula = new int [z];
        for (int i = 0; i < z; i++) {
            rezultujuciNizBezNula[i] = presek[i];
        }

        return rezultujuciNizBezNula;

    }
}
