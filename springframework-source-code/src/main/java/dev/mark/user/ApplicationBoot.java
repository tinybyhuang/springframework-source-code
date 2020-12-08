package dev.mark.user;

import dev.mark.user.entity.User;
import dev.mark.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * @author markhuang
 * @since 2020/12/7 18:36
 */
public class ApplicationBoot {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("services.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        User user = userService.loadById("1");
        Assert.isTrue(user != null, "user can not null");
    }
}
