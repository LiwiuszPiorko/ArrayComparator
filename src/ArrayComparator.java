public class ArrayComparator {

    boolean compareArrays(int[] array1, int[] array2) {
        boolean check = true;
        if (array1 != null && array2 != null) {
            if (array1.length != array2.length) {
                check = false;
            } else
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] != array2[i]) {
                        check = false;
                    }
                }
        } else {
            check = false;
        }
        return check;
    }
}














