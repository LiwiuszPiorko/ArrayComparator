import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] tablica1 = {3, 6, 8, 8, 9, 10,11};
        int[] tablica2 = {4, 7, 8, 8, 9, 10,11};

        String wtab1 = Arrays.toString(tablica1);
        System.out.println(wtab1);
        String wtab2 = Arrays.toString(tablica2);
        System.out.println(wtab2);

        ArrayComparator check = new ArrayComparator();
        boolean ArrayComparator = check.compareArrays(tablica1,tablica2);

        if (ArrayComparator) {
            System.out.print("Tablice są równe");
        } else {
            System.out.println("Tablice nie są równe");
        }
    }
}



