public class ArrayComparator {

    boolean compareArrays(int []arrayX, int[]arrayY) {

        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayY.length; j++) ;
            if (arrayX[i]!=arrayY[i]||arrayX.length!=arrayY.length){
                return false;
            }
            return true;
        }

        if (arrayX.length == arrayY.length) {
            return true;
        } else {
            return false;
        }
    }
}





