import java.util.*;

public class Anagram {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            System.out.println("false");
        } else {
            for (int i = 0; i < n1; i++) {
                if (str1[i] != str2[i]) {
                    System.out.println("false");
                }
            }

            System.out.println("Are anagrams");

        }
    }

}