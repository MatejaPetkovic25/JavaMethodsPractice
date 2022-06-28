import java.util.Arrays;

public class SaCasa5SamoUnikati {

        //Resenje prethodnog zadatka, ali ovoga puta presek se pravi bez ponavljanja brojeva

    public static void main(String[] args) {

        System.out.println(Arrays.toString(presekNizova(new int[]{1, 2, 3, 4, 5, 3}, new int[]{1, 4, 3, 3, 3})));

    }

    public static int[] presekNizova(int[] a, int[] b) {
        int duzinaNiza;
        int duzinaKracegNiza;
        if (a.length > b.length) {
            duzinaNiza = a.length;
            duzinaKracegNiza = b.length;
        } else {
            duzinaNiza = b.length;
            duzinaKracegNiza = a.length;
        }

        int[] presek = new int[duzinaNiza];
        int z = 0;

        for (int i = 0; i < duzinaNiza; i++) {
            kraciniz:
            for (int j = 0; j < duzinaKracegNiza; j++) {
                if(a[i] == b[j]) {
                    //petalja koja proverava da li su clanovi unikatni,
                    //ako jesu, dodaj ih u niz, ako nisu, nastavi
                    //Set<Integer>;
                    for (int k = 0; k < z; k++) {
                        if (a[i] == presek[k]) {
                            continue kraciniz;
                        }
                    }
                    presek[z] = a[i];
                    z++;
                }
            }
        }

        int[] rezultujuciNizBezNula = new int[z];
        for (int i = 0; i < z; i++) {
            rezultujuciNizBezNula[i] = presek[i];
        }

        return rezultujuciNizBezNula;
        //return Arrays.copyOfRange(presek, 0, z);
    }
}
