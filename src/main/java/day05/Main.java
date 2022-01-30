package day05;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringStatistics ss=new StringStatistics();
        Map<Character,Integer> result=new StringStatistics().getCharsInText("almafa");
        for(Map.Entry<Character,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        result=new StringStatistics().getCharsInTextLinked("almafa");
        for(Map.Entry<Character,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        result=new StringStatistics().getCharsInTextTree("almafa");
        for(Map.Entry<Character,Integer> entry:result.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}