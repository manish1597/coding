package String;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static boolean panagram( String s){
        s=s.toLowerCase();
        for (char c1='a';c1<='z';c1++){
            if(s.indexOf(c1)<0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPanagram(String str)
    {
        str.toLowerCase();
        int n =str.length();//first calculate the length of the string
        if (n<26){ // we have 26 English Aplphabates
            return false;
        }
        boolean visited[] = new boolean[26];
        for( int i=0;i<n;i++){
            char x =str.charAt(i);
            if(x>='a'&& x<='z'){
                visited[x-'a']=true;
            }
            if(x>='A' && x<='Z'){
                visited[x-'A']=true;

            }
        }
        for (int i=0;i<26;i++){
            if(visited[i]==false){
                return false;
                //break;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        String s = "Thequickbrownfoxjumpsoverthelazydog";
      //  System.out.println(panagram(s));
        System.out.println(isPanagram(s));


    }
}
