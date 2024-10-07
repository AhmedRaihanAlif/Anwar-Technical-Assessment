import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        permute(str, "");

        scanner.close();
    }

    // Function to generate all permutations of the given string
    public static void permute(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                String remain = str.substring(0, i) + str.substring(i + 1);
                permute(remain, prefix + ch);
            }
        }
    }
}
