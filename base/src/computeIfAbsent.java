import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeIfAbsent {
    public static void main(String[] args) {

        List<String> list;
        Map<String, List> map = new HashMap();

        //java8 之后的骚操作
        list = map.computeIfAbsent("list", (key) -> new ArrayList<>());
        list.add("World");
        System.out.println(list);
        System.out.println(map);
    }
}
