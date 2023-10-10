package String;
enum Fruits {
    Orange,
    Apple,
    Banana,
    Mango;
}

public class EnumToString {

    public static void main(String[] args) {

        // Printing all the values
        System.out.println(Fruits.Orange.name());
        System.out.println(Fruits.Apple.name());
        System.out.println(Fruits.Banana.name());
        System.out.println(Fruits.Mango.name());

        //using tostring()
        // Printing all the values
        System.out.println(Fruits.Orange.toString());
        System.out.println(Fruits.Apple.toString());
        System.out.println(Fruits.Banana.toString());
        System.out.println(Fruits.Mango.toString());
    }
}
