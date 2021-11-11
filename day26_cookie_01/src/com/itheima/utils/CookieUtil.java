package com.itheima.utils;

import javax.servlet.http.Cookie;

public class CookieUtil {
    public static Cookie createAndSetCookie(String name, String value, int time, String path) {
        //1. 创建一个cookie对象，存储键值对
        Cookie cookie = new Cookie(name, value);
        //设置cookie的有效期
        cookie.setMaxAge(time);

        //设置cookie有效路径
        cookie.setPath(path);
        return cookie;
    }
    public static String getCookieValue(Cookie[] cookies,String name) {
        String value = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //匹配cookie的name
                if (cookie.getName().equals(name)) {
                    //它就是我们想要的那个cookie
                    //我们就获取它的value
                    value = cookie.getValue();
                }
            }
        }
        return value;
    }

}
