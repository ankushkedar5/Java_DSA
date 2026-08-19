package Strings_04;
import java.util.Scanner;

// Strings:
// We have a class named "String" bydefault in java.
// Declaration of String:
//     type stringName = "Our string";
//     ex.-> 
//         String name = "Ankush";
//         String fullName = "Ankush Kedar";
// strings are Immutable in java
// This means once a String object is created, it cannot be changed

// String from user/keyboard:
//     Scanner sc = new Scanner(System.in);
//     String name = sc.next(); // for single name 
//     String fullName = sc.nextLine(); // for full line/multiple words

public class Lecture_12 {

    // Homework Problems:
    // 1.Take an array of Strings input from the user & find the cumulative (combined)
    //   length of all those strings
    // 2.input a string from the user, create a new string called `result` in which you
    //   replace the letter `e` in the original string withletter `i`
    //   Example : 
    //       original = “eabcdef"; result = “iabcdif”;
    //       Original = “xyz”; result = “xyz”;
    // 3.input an email from the user, you have to create a username from the email 
    //   by deleting the part that comes after `@`. Display that username to the user.
    //   Example:
    //       email="apnaCollegeJava@gmail.com"; username="apnaCollegeJava"
    //       email="helloWorld123@gmail.com"; username="helloWorld123"

    Scanner sc = new Scanner(System.in);

    // Homework Problem 1:
    void combinedLength() {

        System.out.print("Enter length of array: ");
        int length = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[length];

        System.out.println("Enter " + length + " Strings: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        String total = String.join("", arr);
        System.out.println("The combined length of given strings are: " + total.length());

    }

    // Homework Problem 2:
    void replaceLetter() {

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace('e', 'i');

    System.out.println("result = " + result);
    }

    // Homework Problem 3:
    void createUsername() {
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        int index = email.indexOf('@');
        if(index == -1) {
            System.out.println("Invalid email format (no @ found)");
        }
        else {
            String username = email.substring(0, index);
            System.out.println(username);
        }
    }

    public static void main(String[] args) {
        Lecture_12 obj = new Lecture_12();

        // obj.combinedLength();
        // obj.replaceLetter();
        obj.createUsername();
        
        // 1.concatenation of two Strings 
        // syntax: 
        //     string1 + string2 => string1string2
        //     ex.->
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println();

        // 2.length of given String
        // syntax: 
        //     string.length()
        //     ex.->
        int len = fullName.length();
        System.out.println(len);
        System.out.println();

        // 3.charectors of given String
        // syntax:
        //     string.charAt(index)
        //     ex.->
        // char firstChar = fullName.charAt(0);
        // System.out.println(firstChar);
        for(int i=0; i<len; i++) {
            char charector = fullName.charAt(i);
            System.out.print(charector + " ");
        }
        System.out.println();

        // 4.comparision between two strings
        // It compares in three condition 
        //     1. string1 > string2 : return +ve value
        //     2. string1 == string2 : return 0
        //     3. string1 < string2 : return -ve value
        // It compare lexicographically ( a < b < c < d.....)
        // This is casesensitive.
        // synxat: 
        //     string1.compareTo(string2)
        //     ex.->
        if(firstName.compareTo(lastName) < 0) {
            System.out.println("string1 is less than string2");
        }
        else if(firstName.compareTo(lastName) == 0) {
            System.out.println("string1 is equal to string2");
        }
        else {
            System.out.println("string1 is greater than string2");
        }System.out.println();

        // 5.substring of given string 
        // syntax:
        //     string.substring(startIndex, endIndex)
        // endIndex bydefault consider as last index of string
        String sentence = "My Name is Tony";
        String name = sentence.substring(11);
        System.out.println(name);
        System.out.println();

        // 6.check exact equality of two strings
        // syntax:
        //     string1.equals(string2)
        //     ex.->
        if(firstName.equals("Tony")) {
            System.out.println("First name is Tony.");
        }
        else {
            System.out.println("First name is NOT Tony.");
        }
        System.out.println();

        // 7.check equality by ignoring case of strings 
        // syntax:
        //     string1.equalsIgnoreCase(string2)
        //     ex.->
        if(firstName.equalsIgnoreCase("tony")) {
            System.out.println("First name is tony.");
        }
        else {
            System.out.println("First name is NOT tony.");
        }
        System.out.println();

        // 8.check any substring is present in a given string or not
        // syntax:
        //     string.contains(CharSequence substring) // CharSequence is a dataType
        //     ex.->
        String text = "I love java programming";
        if(text.contains("java")) {
            System.out.println("java present in text");
        }
        else {
            System.out.println("java is not present in text");
        }
        System.out.println();
        
        // 9.Checks if a string begins or ends with a given substring
        // syntax:
        //     string.startsWith(String prefix) // String is a dataType
        //     string.endsWith(String suffix) // String is a dataType
        //     ex.->
        if(text.startsWith("java") || text.endsWith("programming")) {
            System.out.println("its about programming language");
        }
        else {
            System.out.println("its not about programming language");
        }
        System.out.println();

        // 10.Find index/startIndex of first occurrence of charector/substring in a given string
        // It returns -1 if charector/substring not present in given string
        // It will always find first occurrence of a charector/substring
        // syntax:
        //     string.indexOf(String str) // String is a dataType
        //     ex.->
        String intro = "My name is ankush";
        int index1 = intro.indexOf("a");
        System.out.println("first occurrence of charector/substring is at index/startIndex: " + index1);
        System.out.println();

        // 11.Find index/startIndex of last occurrence of charector/substring in a given string
        // It returns -1 if charector/substring not present in given string
        // It will always find last occurrence of a charector/substring
        // syntax: 
        //     string.lastIndexOf(String str) // String is a dataType
        //     ex.->
        int index2 = intro.lastIndexOf("a");
        System.out.println("last occurrence of charector/substring is at index/startIndex: " + index2);
        System.out.println();

        // 12.checks if a given String is empty or not
        // It returns boolean true if given string is empty
        // It returns boolean false if given string is not empty
        // If string contains whitespace then it will not consider as empty
        // syntax:
        //     string.isempty()
        //     ex.->
        String empty = " ";
        if(empty.isEmpty()) {
            System.out.println("Given string is empty");
        }
        else {
            System.out.println("Given string is not empty");
        }
        System.out.println();

        // 13.checks if the string is empty or contains only whitespace
        // It returns boolean true if given string is empty or only contains whitespace
        // It returns boolean false if given string is not empty/contains anything other than whitespace
        // syntax: 
        //     string.isBlank()
        //     ex.->
        if(empty.isBlank()) {
            System.out.println("Given string is Blank");
        }
        else {
            System.out.println("Given string is not Blank");
        }
        System.out.println();

        // 14.Converts all characters in the string to lower or upper case
        // .toLowerCase() converts all charectors in a given string to lower case and return a new string
        // .toUpperCase() converts all charectors in a given string to upper case and return a new string
        // syntax:
        //     string.toLowerCase() // converts in lower case and return it
        //     string.toUpperCase() // converts in upper case and return it
        //     ex.->
        String lower = intro.toLowerCase();
        String upper = intro.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);
        System.out.println();

        // 15.Removes leading and trailing whitespace (spaces, tabs, newlines)
        // Leading → whitespace at the beginning
        // Trailing → whitespace at the end
        // It does not remove whitespace between words.
        // syntax:
        //     string.trim()
        //     ex.->
        String str = "   Hello Java   ";
        System.out.println("trimed text str: " + str.trim());
        System.out.println();

        // 16.Removes leading and trailing whitespace that also handles Unicode whitespace
        // A more modern version of .trim()
        // We will prefer .strip() more than .trim()
        // syntax:
        //     string.strip()
        //     ex.->
        String str1 = "\u2003Hello Java\u2003";
        System.out.println("trimed text str1: " + str1.trim());
        System.out.println("striped text str1: " + str1.strip());
        System.out.println();

        // 17.Replaces all occurrences of a specific character from given string
        // syntax:
        //     string.replace(char oldChar, char newChar) // char is a dataType
        //     ex.->
        String name1 = "kedar";
        String name2 = name1.replace('k','b');
        System.out.println(name2);
        System.out.println();

        // 18.Replaces all occurrences of a specific substring from given string
        // syntax:
        //     string.replace(CharSequence target, CharSequence replacement) // CharSequence is a dataType
        //     ex.->
        String sentence1 = sentence.replace("Tony","Ankush");
        System.out.println(sentence1);
        System.out.println();

        // 19.Replaces only the first occurrence of a substring that matches a regular expression
        // syntax:
        //     string.replaceFirst(String regex, String replacement)
        //     ex.->
        String greet = "Hii arun, My name is arun too";
        String greet1 = greet.replaceFirst("arun", "friend");
        System.out.println(greet);
        System.out.println(greet1);
        System.out.println();

        // 20.Converts a string into a new character array
        // syntax: 
        //     string.toCharArray()
        //     ex.->
        char array[] = greet1.toCharArray();
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println();

        // 21.Splits the string into a String[] array based on a delimiter (like a comma or space)
        // syntax:
        //     string.split(String regex)
        //     ex.->
        String arr[] = greet.split(" ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();

        // 22.combine multiple strings into one String, putting a specified delimiter between them
        // syntax:
        //     String.join(CharSequence delimiter, CharSequence... elements) // CharSequence is a dataType
        //     ex.->
        String str2 = String.join("", "A", "N","K","U", "S", "H");
        System.out.println(str2);
        String reGreet = String.join(" ", arr);
        System.out.println(reGreet);
        System.out.println();

        // 23.Joins two strings. This does the same thing as the + operator
        // syntax:
        //     string1.concat(String string2)
        //     ex.->
        String ironMan = firstName.concat(lastName);
        System.out.println(ironMan);
    }
}
