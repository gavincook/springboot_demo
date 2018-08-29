package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import java.util.List;
import me.gavincook.moon.response.CommonResponse;
import me.gavincook.moon.template.ExecuteCallBack;
import me.gavincook.moon.template.ExecuteTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户控制器
 *
 * @author gavincook
 * @date 2018-08-29 11:06
 * @since 1.0.0
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ExecuteTemplate executeTemplate;

    /**
     * 搜索所有用户
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public CommonResponse<List<User>> search() {
        CommonResponse<List<User>> response = new CommonResponse<>();
        executeTemplate.executeWithoutTransaction(new ExecuteCallBack() {
            @Override
            public void check() {

            }

            @Override
            public void service() {
                response.setResult(userMapper.list());
            }
        }, response);
        return response;
    }

}
