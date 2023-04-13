
package press;

public class Handle {
    public static String convertToHandle(String name){
        StringBuffer sb=new StringBuffer();
        String[] words=name.split(" ");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i].toLowerCase());
            if(i!=0){
                sb.append("_");
            }
        }
        return "@"+sb.toString();
    }
}
