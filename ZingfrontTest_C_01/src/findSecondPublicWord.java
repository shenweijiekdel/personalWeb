import java.util.*;
import java.util.Comparator;

class SortComparator implements Comparator<String> {

    /**
     * 降序排列 
     * @param o1
     * @param o2
     * @return
     */
    public int compare(String o1, String o2) {
        if(o1.equalsIgnoreCase(o2)) return 0;//字符串相同不放入多个
        int index = (o2.length()-o1.length());
        if(index == 0) index = -1;
        return index;
    }

}

/**
 * 1. 求两个字符串的第二公共单词 

 */
public class findSecondPublicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String t = scanner.nextLine().trim();
        String secondSameWord = getSecondSameWord(s,
                t);
        System.out.println(secondSameWord);
    }
    /**
     * 获取第二个或第一个相同的单词 
     * @param str1
     * @param str2
     * @return
     */
    public static String getSecondSameWord(String
                                                   str1,String str2){
        if
                (str1==null||str2==null||str1.equals("")||str2.equals("")){
            return null;
        }
        List<String> list = new ArrayList<String>();
        // 转化成数组 
        String[] str1Array = str1.split("\\s+");
        String[] str2Array = str2.split("\\s+");
        // 去重 
        Set<String> strSet1 =
                removeRepeatWords(str1Array);
        Set<String> strSet2 =
                removeRepeatWords(str2Array);
        // 比较相同的单词 
        Iterator<String> iterator1 =
                strSet1.iterator();

        boolean flag;
        while(iterator1.hasNext()){
            flag=true;
            String word1 = iterator1.next();
            Iterator<String> iterator2 =
                    strSet2.iterator();
            while(iterator2.hasNext()&&flag){
                String word2 = iterator2.next();
                // 相同添加到数组里 
                if(word1.equalsIgnoreCase(word2)){
                    list.add(word2);
                    flag = false;
                }
            }

        }


        // 如果长度大于 2，则返回第二个单词，如果长度为 1，则返回第 一个单词，否则返回空
        if (list.size()>=2){
            return list.get(1).toLowerCase(); //根据例子的输出要求转成小写
        }else if(list.size()==1){
            return list.get(0);
        }else return null;
    }

    /**
     * 数组去重 
     * @param strings
     * @return
     */
    public static Set<String>
    removeRepeatWords(String[] strings){
        Set<String> wordSet = new TreeSet<String>(new
                SortComparator());
        for(String word : strings){
            wordSet.add(word);
        }
        return wordSet;
    }

}