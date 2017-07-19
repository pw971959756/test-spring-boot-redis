import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by pw on 2017/7/17.
 */
public class JavaRedisTest {

    private final String host = "192.168.1.2";

    @Test
    public void test1(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis(host,6379);
        String set = jedis.set("JavaRedisTest Test1 ", "Hello World ~!");
        System.out.println("Connection to server sucessfully   "+set );
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());
    }



    @Test
    public void test2(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis(host);
        System.out.println("Connection to server sucessfully");
        //set the data in redis string
        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorialname"));
    }


    @Test
    public void test3(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis(host);
        System.out.println("Connection to server sucessfully");

        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0 ,5);

        for(int i = 0; i<list.size(); i++) {
            System.out.println("Stored string in redis:: "+list.get(i));
        }
    }


}









