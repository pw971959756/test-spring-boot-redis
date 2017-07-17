package com.test.pw.spring.boot.redis.entity;

import java.io.Serializable;

/**
 * Created by pw on 2017/7/17.
 */
public class RedisBean implements Serializable{

    private static final long serialVersionUID = -1L;

    private Integer id;
    private String key;
    private String value;


    public RedisBean() {
    }

    public RedisBean(Integer id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
