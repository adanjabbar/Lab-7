/*You are given a string. In the first line, print the third character of this string. 
In the second line, print the second to last character of this string. 
In the third line, print the first five characters of this string. In the fourth line, print all but the last two characters of this string. 
In the fifth line, print all the characters of this string with even indices (remember indexing starts at 0, so 
the characters are displayed starting with the first). In the sixth line, print all the characters of this string with odd indices (i.e. starting with the second 
character in the string). In the seventh line, print all the characters of the string in reverse order. 
In the eighth line, print every second character of the string in reverse order, starting from the last one. In the ninth line, print the length of the given string.*/


import java.util.Scanner;

public class LabTask10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 2));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(0, str.length() - 2));

        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
        System.out.println();

        for (int i = 1; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
        System.out.println();

        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
        System.out.println();

        for (int i = str.length() - 1; i >= 0; i -= 2)
            System.out.print(str.charAt(i));
        System.out.println();

        System.out.println(str.length());
    }
}
