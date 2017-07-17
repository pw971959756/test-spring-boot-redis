import com.alibaba.fastjson.JSON;
import com.test.pw.spring.boot.redis.RedisAppliction;
import com.test.pw.spring.boot.redis.entity.RedisBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pw on 2017/7/17.
 */

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = RedisAppliction.class) // 指定我们SpringBoot工程的Application启动类
public class RedisTest {


    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate<String, Object> objectRedisTemplate;


    @Test
    public void test1() {
        System.out.println("Hello World !~");
    }

    @Test
    public void test2() {
        System.out.println(redisTemplate);
    }

    @Test
    public void test3() {
        redisTemplate.opsForValue().set("Hello World Spring Boot ", "中文测试");
    }

    @Test
    public void test4() {
        System.out.println(redisTemplate.opsForValue().get("Hello World Spring Boot "));
    }
//
//    @Test
//    public void test5() {
//        template.opsForValue().set("1",new RedisBean(1,"key1","文本1"));
//        template.opsForValue().set("2",new RedisBean(2,"key2","文本2"));
//    }

    @Test
    public void test6() {
        redisTemplate.opsForValue().set("json-user-1", JSON.toJSONString(new RedisBean(1,"2","3")));
    }

    @Test
    public void test7() {
        System.out.println(redisTemplate.opsForValue().get("json-user-1"));
    }

    @Test
    public void test8() {
        objectRedisTemplate.opsForValue().set("obj-01",new RedisBean(2,"3","4"));
        objectRedisTemplate.opsForValue().set("obj-03",new RedisBean(3,"3","4"));
        objectRedisTemplate.opsForValue().set("obj-04",new RedisBean(4,"3","4"));
    }

    @Test
    public void test9() {
        System.out.println(JSON.toJSONString(objectRedisTemplate.opsForValue().get("obj-01")));
    }

    @Test
    public void test0() {
    }

}
