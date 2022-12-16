package Arrays;

//       data type  nameOfArray [][]  =  new datatype [row size] [colume size];  // initialition
// example   2*2 matrix
//        data type  nameOfArray [][]  =  value  ;
//        int twoDArray[][] = new int[row size][colume size] ;
//        twoDArray [0][0] = 40;   // storing the value
//        twoDArray [0][1] = 50;
//        twoDArray [1][0] = 60;
//        twoDArray [1][1] = 70;


public class TwoDArray {
    public static void main(String[] args) {

        int rowsize = 2;
        int colsize = 2;
        int twoDArray[][] = new int[rowsize][colsize];

        twoDArray[0][0]= 30;
        twoDArray[0][1]= 40;
        twoDArray[1][0]= 50;
        twoDArray[1][1]= 60;

        System.out.println( " 2 D array matrix ");

        for (int i = 0; i < rowsize ; i++){
            for (int j = 0 ; j < colsize;j++){
                System.out.print(twoDArray[i][j]+ " ");
            }
            System.out.println();
        }




    }
}
