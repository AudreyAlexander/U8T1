import java.util.Arrays;
public class newRunner {
    public static void main(String[] args){
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6
        for (int k = 0; k < testArr1.length; k++){
            for(int i = 0; i < testArr1[0].length; i++){
                System.out.print(testArr1[k][i] + " ");
            }
        }

        System.out.println("\n---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6
        for (int[] numList : testArr1){
            for(int num : numList){
                System.out.print(num + " ");
            }
        }

        System.out.println("\n---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        for (int k = 0; k < testArr1[0].length; k++){
            for(int i = 0; i < testArr1.length; i++){
                System.out.print(testArr1[i][k] + " ");
            }
        }

        /* --- PROBLEM 2 --- */
        System.out.println("\n---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish
        for (String[] strList : testArr2){
            for(String str : strList){
                System.out.print(str + " ");
            }
        }



        System.out.println("\n---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish
        for (int k = 0; k < testArr2[0].length; k++){
            for(int o = 0; o < testArr2.length; o++){
                System.out.print(testArr2[o][k] + " ");
            }
        }

    }
}
