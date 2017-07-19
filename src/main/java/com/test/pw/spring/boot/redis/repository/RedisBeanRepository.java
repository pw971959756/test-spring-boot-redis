package com.test.pw.spring.boot.redis.repository;

import com.test.pw.spring.boot.redis.entity.RedisBean;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pw on 2017/7/19.
 */
public interface RedisBeanRepository  extends CrudRepository<RedisBean,Integer> {


}
