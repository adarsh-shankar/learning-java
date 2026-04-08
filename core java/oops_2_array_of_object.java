//package core java;
// Array of objects :
/*
    Objective: to solvet the problem of multiple same type of objects for eg. students 
               of school and to change and manipulate all of them at once.
*/

//first define the class 
class student{
    int roll_no;
    String name;
    int marks;

}
public class oops_2_array_of_object 
{
    public static void main(String[] args){
        // here we will create multiple objects we did it manually here.
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.name="adarsh";
        s1.marks=20;
        s1.roll_no=1;

        s2.name="aditya";
        s2.marks=20;
        s2.roll_no=2;   

        s3.name="abhilasha";
        s3.marks=20;
        s3.roll_no=3;


        // Define the array of students
        student[] students = new student[3]; // here an array of objects created
        students[0] = s1; 
        students[1] = s2;
        students[2] = s3;
        // filling of array elements will be done manually always


        //printing
        for(int i = 0 ; i<students.length ; i++){
            System.out.println("Name : "+students[i].name);
            System.out.println("Roll no : "+students[i].roll_no);
            System.out.println("Marks : "+students[i].marks);


    }
}
}
