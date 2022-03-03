import java.util.Arrays;
public class FunWith2DArrays {
    public static int totalElements(int[][] newArray){
        int total = 0;
        for (int[] row : newArray)
        {
            total += row.length;
        }
        return total;
    }
    public static void fourCorners(String[][] newArray){
        int rows = -1;
        int columns = 0;
        for (String[] row : newArray)
        {
            rows += 1;
            columns = row.length - 1;
        }
        System.out.println(newArray[0][0]);
        System.out.println(newArray[0][columns]);
        System.out.println(newArray[rows][0]);
        System.out.println(newArray[rows][columns]);
    }
    public static double average (int[][] intArr){
        double total = 0;
        int count = 0;
        for (int[] numList : intArr){
            for (int num : numList){
                total += num;
                count ++;
            }
        }
        double avg = total/count;
        return avg;
    }

    public static int[] indexFound(String[][] strArr, String target){
       int row = -1;
       int column = -1;

        for (int k = 0; k < strArr.length; k++){
            for(int i = 0; i < strArr[0].length; i++){
                if (strArr[k][i].equals(target)){
                    row = k;
                    column = i;
                }
            }
        }

        int[] newIntArr = {row, column};
        return newIntArr;

    }
}
