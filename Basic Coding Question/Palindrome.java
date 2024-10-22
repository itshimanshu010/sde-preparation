import java.util.Scanner;

public class Palindrome{
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

  public static void main(String a[]){
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    Palindrome palindromeChecker = new Palindrome();
    boolean result = palindromeChecker.isPalindrome(input);

   System.out.println(result);
    
  }
    
}
