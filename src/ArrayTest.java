import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] tablica1 = {1, 3, 4, 9, 7, 0, 99};
        int[] tablica2 = {1, 4, 88, 97, 0, 100};

        String wtab1 = Arrays.toString(tablica1);
        System.out.println(wtab1);
        String wtab2 = Arrays.toString(tablica2);
        System.out.println(wtab2);

        ArrayComparator check = new ArrayComparator(tablica1, tablica2);
        boolean ArrayComparator = check.compareArrays();

        if (ArrayComparator) {
            System.out.println("Tablice sa takie same");
        } else {
            System.out.println("Tablice nie sa takie same");
        }
    }


}
