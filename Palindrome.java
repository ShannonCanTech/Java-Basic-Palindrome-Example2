import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

//        Input string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.nextLine();

//        Split str by each individual letter
        String[] word = str.split("", str.length());

//        Technically not needed but will be used in this example
        StringBuilder build = new StringBuilder();

//        Runs through str forward not reverse, alternatively can do normal int i = 1; i <= str.length(); i++
        for(int i = str.length(); i >= 1; i--){
            String letter = word[str.length()-i]; // stores str in the variable letter
            build.append(letter); // adds each individual letter to the StringBuilder build
            StringBuilder reverseBuild = new StringBuilder(build.toString()); // used to get reverse of build string
            String reverseWord = reverseBuild.reverse().toString(); // stores reverse in string

//            This is to prevent program from stopping and analyzing a word with a single letter
            if(build.length()!= 1){
//                Test the reverse word against the normal string
                if(reverseWord.equalsIgnoreCase(str)){
                    System.out.printf("Normal: %s, Reverse: %s\n", str, reverseWord);
                    System.out.println("It's a palindrome!");
                }
            }

        }

    }
}
