public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic numbe
/*    public int searchForPalindromicNum(int num){
    

      }
*/

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      String reversed = reverseNum(num);
      Integer number = num;
      String stringNumber;
      stringNumber = number.toString();

      return stringNumber.equals(reversed);

    }



    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      
      String reversedNumber = "";
      Integer number = num;
      String numberString = number.toString();
        
        for (int i = numberString.length() - 1; i >= 0; i--){
          reversedNumber += numberString.substring(i, i + 1);
        }
      
      return reversedNumber;

    }


    //@Override
    //public String toString(){
    //    return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    //}
}
