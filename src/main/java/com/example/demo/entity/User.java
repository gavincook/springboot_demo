package com.example.demo.entity;

/**
 * 用户实体
 *
 * @author gavincook
 * @date 2018-08-29 10:57
 * @since 1.0.0
 */
public class User {

    /**
     * 主键，递增
     */
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 年龄，默认0
     */
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
