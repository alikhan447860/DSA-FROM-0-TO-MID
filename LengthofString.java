public class LengthofString{
    public static void main(String[] args) {
        String str = "Hello,World!";
        int length = 0;

        char[] chararr = str.toCharArray();

        for (char c : chararr) {
            length++;
        }

        System.out.println("The length of the string is: " + length);
    }
}
