public class ArrayComparator {

    boolean compareArrays(int []arrayX, int[]arrayY) {

        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i]!=arrayY[i]||arrayX.length!=arrayY.length){
                return false;
            }
            return true;
        }

        for (int j = 0; j < arrayX.length; j++) {
            if (arrayX[j]!=arrayY[j]||arrayX.length!=arrayY.length){
                return false;
            }
            return true;
    }
    if (arrayX==arrayY){
        return true;
    }else{
        return false;
    }
}}





