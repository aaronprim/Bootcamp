import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public void sumAndGreaterThan10(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }

    public void shuffle(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newListTooLong = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newListTooLong.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newListTooLong);
    }

    public void shuffleAlphabet(){
        ArrayList<String> alphabetArr = new ArrayList<String>();
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){
            alphabetArr.add(Character.toString(alpha));
        }
        System.out.println(alphabetArr);
        Collections.shuffle(alphabetArr);
        System.out.println(alphabetArr);

        System.out.println("First letter of shuffled array: " + alphabetArr.get(0));
        System.out.println("Last letter of shuffled array: " + alphabetArr.get(25));
        String sample = alphabetArr.get(0);

        if("AEIOU".indexOf(sample) > 0){
            System.out.println("The first letter is a vowel")
        }
    }

    public void randNumber() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int number = Random.current().nextInt(55, 101);
            randomNumbers.add(number);
        }
        System.out.println(randomNumbers);
    }

    public void sortRandNumbers() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int number = Random.current().nextInt(55,101);
            randomNumbers.add(number);
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);
        System.out.println("Smallest random number is: " + min);
        System.out.println("Largest random is: " + max);
    }

    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

    public void randomStringStrings(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalString = randString.toString();
            randList.add(finalString);
            randString.setLength(0);
        }
        System.out.print(randList);
    }
}