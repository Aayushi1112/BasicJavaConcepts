package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurenceOfEachCahracterr {
    public static  void main(String args[]){
        String str="papa mama lala";
        Map<String,Integer> charmap=new HashMap<String,Integer>();
        char[] cr=str.toCharArray();
        for(Character character:cr)
        {
            String c=character.toString().toLowerCase();

            if(charmap.containsKey(c)){
                charmap.put(c, charmap.get(c)+1);
            }
            else{
                charmap.put(c,1);
            }
        }
        Set<String> charSet=charmap.keySet();
        for(String s:charSet){
            if(!s.equals(" ")){
            System.out.println("Character "+s+" apears "+ charmap.get(s)+" times");}
        }

    }
}
