public class PalindromicRunner {
    public static void main(String[] args) {
        // be sure you're testing each method as you work then produce your final output using the toString method
        int mileage = 72927;
        PalindromicNumberFinder test = new PalindromicNumberFinder(mileage);
        int milesToGo = test.searchForPalindromicNum(mileage) - mileage;
        System.out.println(milesToGo);
        

        

    }
}
