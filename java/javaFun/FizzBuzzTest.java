public class FizzBuzzTest {
    public static void main(String[] args){
        FizzBuzz fB = new FizzBuzz();
        String outputOne = fB.fizzBuzz(3);
        System.out.println(outputOne);
        String outputTwo = fB.fizzBuzz(5);
        System.out.println(outputTwo);
        String outputThree = fB.fizzBuzz(15);
        System.out.println(outputThree);
        String outputFour = fB.fizzBuzz(7);
        System.out.println(outputFour);
    }
}