import java.util.LinkedHashMap;
import java.util.Map;

public class tmp {
    public static void main(String[] args) {
        Map<String, Object> setIndepthCheckupParams = new LinkedHashMap<>();
        Map<String, Object> cacheParams = new LinkedHashMap<>();
        setIndepthCheckupParams.put("cache_params", cacheParams);
        cacheParams.put("cache_flag", 10);
        System.out.println(((Map<String, Integer>)setIndepthCheckupParams.get("cache_params")).get("cache_flag"));
    }
}
