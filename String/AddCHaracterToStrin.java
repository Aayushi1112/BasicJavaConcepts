package String;

public class AddCHaracterToStrin {
    public static void main(String args[]){
    char a='s';
    String str="GeeksForGeek";
    String str1=str+a;
    System.out.println(str1);

        char a1 = 'G';
        String str11 = "eeksforGeeks";
        String str22 = a1 + str11;
        System.out.println(str22);

        String blogName = "GeeksorGeeks";
        char two = 'f';
        StringBuffer stringBuffer = new StringBuffer(blogName);
        stringBuffer.insert(5, two);
        String cblogName=stringBuffer.toString();

        String blogName11 = "GeeksorGeeks";
        char two11 = 'f';
        int pos11=5;
        String cblogName11=blogName11.substring(0, pos11) + two11
                + blogName11.substring(pos11);

}}
