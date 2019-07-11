import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static String getLikes(String[] strings){
        String string;
        ArrayList<String> newArrayList = new ArrayList<String>();
        for(int i = 0; i < strings.length; i++){
            if (!newArrayList.contains(strings[i])){
                newArrayList.add(strings[i]);
            }
        }

        if(newArrayList.size() == 0){
            string = "no likes for this post";
        }else if (newArrayList.size() == 1){
            string = strings[0] + " like this post";
        }else if (newArrayList.size() == 2){
            string = strings[0] + " and " + strings[1] + " like this post";
        }else if (newArrayList.size() == 3){
            string = strings[0] + ", " + strings[1] +  " and " + strings[2] + " like this post";
        }else {
            int count = newArrayList.size() - 2;
            string = strings[0] + ", " + strings[1] + " and " + count + " others like this post";
        }
        return string;
    }
}
