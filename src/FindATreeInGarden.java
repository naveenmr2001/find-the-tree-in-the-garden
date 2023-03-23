import java.util.Scanner;

public class FindATreeInGarden {

    public static String FunctionToCheckTile(int[][] doraGarden,int tileToCheck){

        int eachTileValue = 1;

        for(int iteratorRow = 0;iteratorRow<doraGarden.length;iteratorRow++){

            for(int iteratorColumn = 0;iteratorColumn<doraGarden[iteratorRow].length;iteratorColumn++){

                if(tileToCheck == eachTileValue){

                    if(iteratorRow == 0 || iteratorColumn == 0 || iteratorColumn == 4){

                        return "Yes";

                    }

                }

                eachTileValue++;
            }

        }

        return "No";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the row size: ");
        int rowSize =  scan.nextInt();

        System.out.println("Enter the column size");
        int columnSize = scan.nextInt();

        System.out.println("Enter the tile to check: ");
        int tileToCheck = scan.nextInt();

        int[][] doraGarden = new int[rowSize][columnSize];

        String tileIsPresentOrNot = FunctionToCheckTile(doraGarden,tileToCheck);

        System.out.println(tileIsPresentOrNot);

    }
}