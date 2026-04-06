/*

    OBJECTIVE 
    1) Creation of Class 
    2) Creation of Object 

 */
class calculator {
    int add(int a, int b){
        return a+b;
    }
        int sub(int a, int b){
        return a-b;
    }
        int mul(int a, int b){
        return a*b;
    }
}
public class oops_1 { // the classs which has main method is the driver class 
    public static void main(String[] args) {
        System.out.println("class is the blueprint of the object, its yet not created ");
        System.out.println("I am currently in class");
        //creating object by new keyword
        calculator c = new calculator();
        System.out.println(c.add(12, 26));
        System.out.println(c.sub(12, 26));
        System.out.println(c.mul(12, 26));
        
    }

    
}
