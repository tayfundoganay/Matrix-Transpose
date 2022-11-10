import java.util.Scanner;

public class MatrixTransposeExample{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix row index: ");
        int m = scanner.nextInt();
        System.out.print("Enter matrix column index: ");
        int n = scanner.nextInt();

        // creating a matrix
        int matrix[][] = new int[m][n];
        int transpose[][] = new int[m][n];

        // matrix value assignment
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Code to transpose a matrix
        for(int i=0;i< n;i++){
            for(int j=0;j< m;j++){
                transpose[i][j]=matrix[j][i];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
