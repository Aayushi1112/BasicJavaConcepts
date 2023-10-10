package String;

public class CharacterToString {
    public static void main(String[] args)
    {
        char c='G';
        String s1=""+c;
        System.out.println("Char to string using concatenation"+ " "+s1);
        String s2 = Character.toString(c);
        System.out.println("Char to String using  toString "+ s2);
        String s3 = String.valueOf(new char[] { c });
        System.out.println(
                "Char to String using String.valueOf(new char[]) method :"
                        + " " + s3);

        String s4 = String.valueOf(c);

        // Print and display the String s
        System.out.println(
                "Char to String using String.valueOf() method :"
                        + " " + s4);

    }

}
