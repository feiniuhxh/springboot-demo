package com.imooc.firstappdemo.repository;

import com.imooc.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author xiaohui.huang
 * @Date 2019/4/17 15:10
 * @Version 1.0
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型存储方式
     */
    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();

    /**
     * id自增长
     */
    private final static AtomicInteger idGenerator = new AtomicInteger();


    /**
     * 保存用户对象
     *
     * @param user
     * @return
     */
    public boolean save(User user) {
        //id从1开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id, user) == null;
    }

    /**
     * 返回所有用户信息
     *
     * @return
     */
    public Collection<User> findAll() {
        return repository.values();
    }

}
