import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 9, 7, 0};
        int[] array2 = {1, 3, 4, 9, 7, 0,11};

        String wtab1 = Arrays.toString(array1);
        System.out.println(wtab1);
        String wtab2 = Arrays.toString(array2);
        System.out.println(wtab2);

        ArrayComparator check = new ArrayComparator(array1,array2);
        boolean ArrayComparator = check.compareArrays();
        if (true) {
            System.out.print("Tablice są równe");
        } else {
            System.out.println("Tablice nie są równe");
        }
    }
}



