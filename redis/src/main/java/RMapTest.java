import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;

import java.util.concurrent.TimeUnit;


public class RMapTest {
    public static void main(String[] args) {
//        Config config = new Config();
        Config config = new Config();
        SingleServerConfig singleServerConfig = config.useSingleServer();
        singleServerConfig.setAddress("redis://127.0.0.1:6379");
//        singleServerConfig.setPassword("9client!");

        RedissonClient redissonClient = Redisson.create(config);

        redissonClient.getBucket("123").set(10222,10, TimeUnit.SECONDS);
//        RMap<String, Object> map = redissonClient.getMap("myMap");
//
//        map.put("bbbb", "4321");
//        map.put("aaaa", "1234");
//
//        System.out.println(map.get("aaaa"));
//
        redissonClient.shutdown();
    }
}
