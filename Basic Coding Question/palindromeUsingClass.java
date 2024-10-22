import java.util.Scanner;

class Check{
  public boolean isPalindrome(String str){
    int i = 0,j = str.length()-1;
    while(i<j){
      if(str.charAt(i)!=str.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
    
}

public class Palindrome extends Check{
    

  public static void main(String a[]){
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    Check palindromeChecker = new Check();
    boolean result = palindromeChecker.isPalindrome(input);

   System.out.println(result);
    
  }
}
