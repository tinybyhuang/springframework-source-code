package dev.mark.user.service.impl;

import dev.mark.user.entity.User;
import dev.mark.user.service.UserService;

/**
 * @author markhuang
 * @since 2020/12/7 18:31
 */
public class UserServiceImpl implements UserService {
    public User loadById(String id) {
        return new User(id, "demo");
    }
}
