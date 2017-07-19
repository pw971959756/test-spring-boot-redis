import com.alibaba.fastjson.JSON;
import com.test.pw.spring.boot.redis.RedisAppliction;
import com.test.pw.spring.boot.redis.entity.RedisBean;
import com.test.pw.spring.boot.redis.repository.RedisBeanRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pw on 2017/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringApplicationConfiguration(classes = RedisAppliction.class) // 指定我们SpringBoot工程的Application启动类
public class RedisBeanRepositoryTest {

    @Autowired
    private RedisBeanRepository redisBeanRepository;

    @Test
    public void test0() {
        System.out.println(redisBeanRepository);
    }

    @Test
    public void test1() {
        redisBeanRepository.save(new RedisBean("test1","中文测试"));
    }

    @Test
    public void test2() {
        System.out.println(JSON.toJSONString(redisBeanRepository.findAll()));
    }

    @Test
    public void test3() {
    }

    @Test
    public void test4() {
    }

    @Test
    public void test5() {
    }

    @Test
    public void test6() {
    }

    @Test
    public void test7() {
    }

    @Test
    public void test8() {
    }

    @Test
    public void test9() {
    }

}
