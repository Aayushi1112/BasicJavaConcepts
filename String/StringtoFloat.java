package String;

/*Exceptions:

        NullPointerException: When the string parsed is null
        NumberFormatException: When the string parsed does not contain a parsable float
     */
public class StringtoFloat {

    public static void main(String[] args) {
        // Input string
        String str = "100";

        // Returning the float value
        // represented by the string argument
        float val = Float.parseFloat(str);

        // Prints the float value of the string
        System.out.println("String is converted to float "
                + val);

        float floatValue=Float.valueOf(str);
        System.out.println("String is converted to float "
                + floatValue);

    }
}