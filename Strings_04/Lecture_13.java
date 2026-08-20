package Strings_04;

public class Lecture_13 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Get a charector from index 0
        System.out.println(sb.charAt(0));

        // Set a charector at index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // Insert a charector at index 1
        sb.insert(1, 'T');
        System.out.println(sb);

        // Delete a substring from StringBuilder
        sb.delete(0, 1);
        System.out.println(sb);

        StringBuilder hlo = new StringBuilder("H");
        System.out.println(hlo);

        // Append a charector in a StringBuilde
        hlo.append("e");
        hlo.append("l");
        hlo.append("l");
        hlo.append("o");
        System.out.println(hlo);

        // Get a length of a StringBuilder
        System.out.println(hlo.length());

    }
}
