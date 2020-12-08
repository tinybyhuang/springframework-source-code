package dev.mark.user.service;

import dev.mark.user.entity.User;

/**
 * @author markhuang
 * @since 2020/12/7 18:30
 */
public interface UserService {

    User loadById(String id);
}
