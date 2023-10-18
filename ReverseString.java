/*  
write a program of recursive method to reverse a given string.
*/ 


public class ReverseString {
    //recurssive function to reverse a string
    public String reverseString(String str)
    {
        //check if the string is empty
        if (str.isEmpty())
        {
            System.out.println("String is empty."); 
            //if the above condition is true returns the same string
            return str;
        }
        else
        {
           return reverseString(str.substring(1))+ str.charAt(0);
           
        }
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String resultantString1 = rs.reverseString("JAVATPOINT");
        String resultantString2 = rs.reverseString("COMPUTER");
        String resultantString3 = rs.reverseString("INDIA");
        System.out.println(resultantString1);
        System.out.println(resultantString2);
        System.out.println(resultantString3);
    }
}
