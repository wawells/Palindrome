package palindrome;
import java.io.*;

public class palindrome {
    //racecar; deed; rotator; kayak

    
    public static boolean isPalindrome(String word) {
        
        boolean same = false;
        
        int startPos = 0;           // 0 , 1 , 2, 3, 4, 5, ...
        int endPos = word.length() - 1; // ... 8, 7, 6, 5, ..., 0
        
        //System.out.println("Startpos: " + startPos);
        //System.out.println("EndPos: " + endPos);

        
        char first = word.charAt(startPos);
        char last = word.charAt(endPos);        

        //System.out.println("first: " + first);
        //System.out.println("last: " + last);

        
        
        if (endPos <= startPos && first == last) 
        {
            same = true;
        }
        else if (first == last) 
        {
            same = isPalindrome(word.substring(startPos + 1, endPos));
        }
        
        
        return same;
    }
    
    
    
    public static void main(String args[]) {
        
        try {
            
            System.out.print("Enter word to test: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String toTest = reader.readLine();
            boolean result = isPalindrome(toTest);
            
            System.out.print(toTest);
            if (result) System.out.println(" is a palindrome");
            else if (!result)
            {
                System.out.println(" is not a palindrome");
            }
            
        } catch (IOException err) {
            
            System.out.println("Shit's broke.");
        }
        
        
    }
}
