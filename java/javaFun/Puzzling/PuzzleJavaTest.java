public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava test = new PuzzleJava();

        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        test.sumAndGreaterThan10(testArr);

        String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        test.shuffle(testList);

        test.shuffleAlphabet();

        test.randNumber();

        test.sortRandNumbers();

        test.randomString();

        test.randomStringStrings();
    }
}