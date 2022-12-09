import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ques1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> dic = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            if (dic.containsKey(String.valueOf(ch))) {
                dic.get(String.valueOf(ch)).add(strs[i]);
            } else {
                List<String> each = new ArrayList<>();
                each.add(strs[i]);
                dic.put(String.valueOf(ch), each);
            }
        }
        for (List<String> item: dic.values()) {
            ans.add(item);
        }
        return ans;
    }
}
class Main3{
    public static void main(String args[]){
        Ques1 a=new Ques1();
        String[] str= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(a.groupAnagrams( str));
    }
}