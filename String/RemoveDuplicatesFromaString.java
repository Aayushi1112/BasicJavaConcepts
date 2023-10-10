package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromaString {
    public static void main(String args[]){
        String string="Mahiya ve java java , Mahiya ve java java";
        String[] words=string.split(" ");
        Set<String> setofString=new HashSet<>(Arrays.asList(words));
        StringBuilder sb=new StringBuilder();
        for(String s:setofString){
            sb.append(" ");
            sb.append(s);
        }
        string=sb.toString();
        System.out.println("New String is"+string);

        String string1 = Arrays.stream(string.split("\\s+")).distinct().collect(Collectors.joining(" "));
        System.out.println("New String is"+string1);

    }

}
