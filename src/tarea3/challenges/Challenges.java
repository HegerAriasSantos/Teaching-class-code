package tarea3.challenges;

public class Challenges {
  // Given an
  // integer x,return true if
  // x is
  // a palindrome, and false otherwise.

  // Example 1:

  // Input:x=121 Output:true Explanation:121
  // reads as 121
  // from left
  // to right
  // and from
  // right to left.Example 2:

  public static boolean isPalindrome(int x) {
    var str = Integer.toString(x);
    var reversedStr = new StringBuilder(str).reverse().toString();
    return str.equals(reversedStr);
  }
}
