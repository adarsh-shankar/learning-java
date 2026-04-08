/*
    OBJECTIVE: 
    1) class name == filename.java
    2) static method == Method directly belong to class
    3) all type of method depending how they take or return thee data 
 */

// A NOTE : that for the filename.java , the name of the class will be always public class filename {no main}
public class methoding{
    // learning different type of methods 
    public static void main(String[] args) {
        // the main function in which every other function would get called 
        message(); // takes nothing , returns nothing 
        int c = calc(10,20 );
        System.out.println(c);
        mult(10,567);
        int d = div();
        System.out.println(d);


        
    }

    static void message()
    {
        System.out.println("I am the static member function");
    }
    static int calc(int a , int b)
    {
        return a+b;
    }
    static void mult(int c, int d){
        System.out.println(c*d);
    }

    static int div(){
        int a=15,b=3;
        if(a>=b){
            return a/b;
        }else{
            return a*b;
        }
    }
    // Note : putting static keyword is necessary to tell the compilerr that i am the member of class directly
}