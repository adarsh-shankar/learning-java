//package core java;
/*
        OBJECTIVE : 1) learn string 
                    2) How to define : 2 ways 
                    3) predefined function
        Defintion : A String is an object that represents as a sequence of characters.
                    the java.lang.String class is used to create and manipulate string objects.
                    two ways to define string
                    1) Using string literal 
                    2) Using new keyword
                    
*/
public class string {

    public static void main(String[] args) {
        //1) Using string literal
        String s = "Adarsh";
        String s2 = "Adarsh"; // doesnt create another new object reuses the same one of s in pool(As both has same value) 
        System.out.println(s);
        System.out.println(s2);
        
        //2) Using new keyword : lesser use 
        String s3 = new String("Aditya");
        System.out.println(s3);


        // string method : concat,length, equals(object) ,  substring(int begin_index)
        //                  replace(), split, compareTo, intern()
        
        System.out.println(s.concat(" Singh"));            // concat : Appends a string to the end
        System.out.println(s.length());                    // length : Returns the number of characters
        System.out.println(s.equals(s2));                  // equals(object) : Compares string content
        System.out.println(s.substring(2));                // substring(int begin_index) : Returns partial string starting at index
        System.out.println(s.replace('A', 'a'));           // replace() : Replaces specific characters
        String[] words = "Hello World".split(" ");         // split : Splits string into an array by a delimiter
        System.out.println(s.compareTo(s3));               // compareTo : Lexicographically compares strings
        String s4 = s3.intern();                           // intern() : Retrieves string from the constant pool
        
    }
    
    
}
