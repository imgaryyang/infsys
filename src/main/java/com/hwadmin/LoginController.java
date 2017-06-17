package com.hwadmin;

import com.hw.utils.EncryptUtil;
import com.hw.utils.PropertiesUtil;
import com.hw.utils.StrUtil;
import com.hwadmin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService userService;


    private final static String MAIN_PAGE = "redirect:/";
    private final static String LOGIN_PAGE = "login";
    @RequestMapping(value = "/login")
    private String doLogin(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        //默认首页，第一次进来
        if (StrUtil.isEmpty(userName)) {
            return LOGIN_PAGE;
        }
        String password = request.getParameter("password");
        //密码加密+加盐
        password = EncryptUtil.getPassword(password, userName);
        String msg;

        return LOGIN_PAGE;
    }


    @RequestMapping(value = "/logout")
    private String doLogout(Model model) {
        return LOGIN_PAGE;
    }


}
