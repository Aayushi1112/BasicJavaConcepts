package String;

public class CountOccurenceOfSubString {
    public static void main(String arg[])
    {
        String str="Java is very good java";
        String substring="java11";
        String[] strarr=str.split(" ");
        int count=0;
        for(String strword:strarr){
            if(strword.toLowerCase().equals(substring.toLowerCase())){
                count++;
            }}
        if(count!=0){
        System.out.println("Substring"+substring+" "+"appears"+count+"times");}
        else{
            System.out.println("this substring isnt presnt");
        }
    }
}

