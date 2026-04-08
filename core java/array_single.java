//OBJECTIVE 
/*  Definition : ARRAY IN JAVA IS AN OBJECT THAT CAN HOLD MULTIPLE VALUE OF SAME TYPE IN CONTIGUOUS LOCATION
    1) Declaration of single dimension array 
    2) declaration with initialisation 
    3) printing of array 
 */

public class array_single {
    public static void main(String[] args) {
        // 1) Declaration 
        int[] arr1;
        int[] arr2;
        int arr3[];

        // 2) Declaration with initialisation 
        int num[] = {5, 6, 7, 8};
        int num1[] = new int[4]; // creates array of 4 elements, each defaults to 0 

        // 3) Initialisation and printing using for loop 
        // We must initialize arr1 with a size before using it
        arr1 = new int[11]; // do this way

        for (int i = 0; i <arr1.length; i++) {
            arr1[i] = i;
            System.out.println("Element at index " + i + ": " + arr1[i]);
        }
        for (int i = 0; i<num1.length ; i++ ){
            System.out.println(num1[i]);
        }
        for (int i = 0; i<num.length ; i++ ){
            System.out.println(num[i]);
        }
    }
}



    

