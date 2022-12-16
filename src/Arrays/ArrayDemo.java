package Arrays;
//  array is colle2ection of data .  which is same type same data type . it is a continueos memory location store.

//The general form of a one-dimensional array declaration is
//
//        type var-name[];
//        OR
//        type[] var-name;


// there are 3 way to create an array


// 1      data type  nameeOfArray [] ;   //  declaration
// 2      data type  nameOfArray []  =  new datatype[size];  // initialition
// 3      data type   nameofArray [] = {val1,val2,val3,....};

//  and also
//  data type  []  nameofArray   =  new  data type [] { ,, element , , , ,};
//  eg-->>  int []original = new int[] {1,2,3,4,5,6,7,8,9,10,3,5,9};


public class ArrayDemo {
    public static void main(String[] args) {

        int[] rollno;  // declaration


        rollno = new int[10];  // initialization

        int[] studentsIds = {1, 2, 3, 4, 5, 6, 7};   // size of int 4 byte  abdtotal element 7  -->> 7x4=28 bytes of array total value 28 byte  //  memory size 28 (size of data type * length of array)

        System.out.println("total element = " + studentsIds.length); // .length is a static method
        System.out.println(" 0 index" + studentsIds[0]); // []  representation the index of array ans is 1
        System.out.println(" 1 index" + studentsIds[1]);// []  representation the index of array ans is 2
        System.out.println(" 2 index" + studentsIds[2]);// []  representation the index of array ans is 3

        for (int i = 0; i <= studentsIds.length - 1; i++) {    // looping fo 1 dimention
            System.out.print(" , " + studentsIds[i]);             // storing all element one by one
        }

        int[] evenNumbers = new int[11];
        int[] oddNumber = new int[11];
        int j = 0;
        int k = 0;
        for (int i = 0; i <= 21; i++) {      // loop for even number   // i is represent int data
            if (i % 2 == 0) {              // logic
                if (j <= 10)                  // logic
                {
                    evenNumbers[j] = i;
                    j++;
                }

            } else {
                if (k < 11) {                   // odd num
                    oddNumber[k] = i;
                    k++;
                }

            }
        }




        System.out.println();
        System.out.println(" even number arrays = ");
        for (int i = 1; i <= evenNumbers.length - 1; i++) {
            System.out.println(" evennumber[" + i + "] = " + evenNumbers[i] + " ,");
        }
        System.out.println();
        System.out.println(" odd number arrays = ");
        for (int i = 1; i <= oddNumber.length - 1; i++) {
            System.out.println(" oddnumber[" + i + "] = " + oddNumber[i] + " ,");
        }

        double[] factorialvalue = new double[5];   //factorial number logic
        double factto = 1;
        for (int i = 1; i <= 5; i++) {
            factto = factto * i;
            factorialvalue[i - 1] = factto;
        }
        System.out.println(" factorial number ");
        System.out.println();
        System.out.println(" odd number arrays = ");
        for (int i = 0; i <= factorialvalue.length - 1; i++) {
            System.out.println(" factorialvalue[" + i + "] = " + factorialvalue[i] + " ,");
        }


    }
}