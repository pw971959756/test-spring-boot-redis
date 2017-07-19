package com.test.pw.spring.boot.redis.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pw on 2017/7/17.
 */
@Data
@Entity
@DynamicUpdate   //不修改全部列
@DynamicInsert   //不插入全部列
@Table(name = "redis_bean")
public class RedisBean implements Serializable{

    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "redis_key")
    private String redisKey;
    @Column(name = "redis_value")
    private String redisValue;

    public RedisBean() {
    }

    public RedisBean(String redisKey, String redisValue) {
        this.redisKey = redisKey;
        this.redisValue = redisValue;
    }
}
