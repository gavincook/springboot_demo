package com.example.demo.controller;

import com.example.demo.entity.User;
import java.util.List;
import me.gavincook.moon.response.CommonResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 用户控制器测试
 *
 * @author gavincook
 * @date 2018-08-29 14:12
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void search() {
        CommonResponse<List<User>> response = userController.search();
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getResult());
    }
}