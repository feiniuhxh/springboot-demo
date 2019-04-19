package com.imooc.firstappdemo.domain;

/**
 * @ClassName User
 * @Description TODO
 * @Author xiaohui.huang
 * @Date 2019/4/17 15:05
 * @Version 1.0
 */
public class User {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
