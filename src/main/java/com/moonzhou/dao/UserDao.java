package com.moonzhou.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.moonzhou.model.User;

@Repository
public interface UserDao {

    /**
     * 登录
     *
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 查找用户列表
     *
     * @param map
     * @return
     */
    List<User> findUsers(Map<String, Object> map);

    /**
     * @param map
     * @return
     */
    Long getTotalUser(Map<String, Object> map);

    /**
     * 实体修改
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(Integer id);
}
