package com.springbootshirorestful;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@RestController
public class Control {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(String username,String passwd) {
        UsernamePasswordToken token = new UsernamePasswordToken(username,passwd);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
        System.out.println("has login");
        //验证是否登录成功
        if(currentUser.isAuthenticated()){
            SecurityUtils.getSubject().getSession().setAttribute("currentUserId",username);
            System.out.println("认证通过");

        }else{
            token.clear();  return "认证未通过";
        }
        return null;
    }

    String binaryReader(HttpServletRequest request) throws IOException {
        int len = request.getContentLength();
        ServletInputStream iii = request.getInputStream();
        byte[] buffer = new byte[len];
        iii.read(buffer, 0, len);
        return new String(buffer).toString();
    }
}
