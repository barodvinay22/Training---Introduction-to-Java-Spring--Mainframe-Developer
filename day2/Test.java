import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Test{
    public static void main(String... a){
        String testString="Vinay is java developer from bangalore";
        String[] wordArray=testString.split(" ");
        List<String> wordList=new ArrayList<>(wordArray);
        wordList.stream().map(c->{
            new HashMap<String,Integer>().put(c,Integer.valueOf(c.toCharArray().length)  );
        }).forEach(s-> System.out::println);
        
    }
}