//package core java;
/* OBJECTIVE 
    1) Learn jagged array : A 2 dimensional array where each of its sub-arrays (rows) can have a different length.
                            (Basically you define rows but not number of columns in each row)
                            int nums[][] = new int[3][]
    2)Learn 3d array : A 3 dimensional array where you first specify the number of rows and then specify the number of coloumns and then at each cell the number of elements
                       int nums = new int[3][4][5] : Meaning 3 rows , 3 coloumns , 5 elements in each cell.
*/
//create another class for 3d array 
class array_3d{
    public void print_3d(int arr[][][])
    {
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                for(int k = 0 ; k<arr[i][j].length ; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    
    }
}




public class array_jagged {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[3]; // first row has 3 elements : or say first array element has 3 elements
        nums[1] = new int[2]; // second row has 2 elements : or say second array element has 2 elements
        nums[2] = new int[5]; // third row has 5 elements : or say third array element has 5 elements

        // To initialsise values 
        for(int i = 0 ; i<nums.length ; i++)
            {
                for(int j = 0 ; j<nums[i].length ; j++){
                    nums[i][j] = i*j;
                }
            }
        
        // To print values 
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0 ; j<nums[i].length ; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println();

        array_3d threadd = new array_3d();
        int arr[][][] = new int[3][4][5];
        threadd.print_3d(arr);

}
    
}
