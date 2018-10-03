public class ArrayComparator {

    private int[] arrayX;
    private int [] arrayY;

    public ArrayComparator(int[] arrayX, int[] arrayY) {
        this.arrayX = arrayX;
        this.arrayY = arrayY;
    }

    boolean compareArrays() {

        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayY.length; j++) ;
        }

        if (arrayX.length == arrayY.length) {
            return true;
        } else {
            return false;
        }
    }
}





