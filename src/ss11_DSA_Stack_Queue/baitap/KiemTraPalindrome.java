package ss11_DSA_Stack_Queue.baitap;
import java.util.LinkedList;
import java.util.Queue;

public class KiemTraPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            queue.add(ch);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!queue.isEmpty()) {
            reversedStr.append(queue.remove());
        }

        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        String input1 = "Able was I ere I saw Elba";
        String input2 = "Hello World";
        String input3 = "racecar";

        System.out.println("Input 1 is Palindrome: " + isPalindrome(input1));
        System.out.println("Input 2 is Palindrome: " + isPalindrome(input2));
        System.out.println("Input 3 is Palindrome: " + isPalindrome(input3));
    }
}
