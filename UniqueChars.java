/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        String UniqueStr = "";
        for (int i = 0; i < str.length(); i++){
            char letter = (char) str.charAt(i);
            if ((UniqueStr.indexOf(letter) == -1) || (letter == 32)){
                UniqueStr = UniqueStr + letter; 
            }
            //how to get rid of the null? and what is the , in the terminal  
            //else{
                
            //}
        }
        return UniqueStr;
    }
}