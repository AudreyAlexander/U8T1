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
}
