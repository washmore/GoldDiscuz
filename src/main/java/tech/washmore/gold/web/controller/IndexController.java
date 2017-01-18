package tech.washmore.gold.web.controller;

import com.alibaba.fastjson.JSON;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.washmore.gold.web.dao.Dao;

import java.util.Enumeration;
import java.util.Map;

/**
 * @author Washmore
 * @version V1.0
 * @summary todo
 * @Copyright (c) 2016, Lianjia Group All Rights Reserved.
 * @since 2016/12/12
 */
@Controller
public class IndexController {
    @RequestMapping("/welcome")
    public String welcome() {
        return "redirect:/";
    }

    @RequestMapping({"/", ""})
    public String index(
            @RequestHeader(required = false) String name,
            HttpServletRequest request
    ) {
        Enumeration<String> hns = request.getHeaderNames();
        while (hns.hasMoreElements()) {
            String hn = hns.nextElement();
            System.out.println(hn + " : " + request.getHeader(hn));
        }
        System.out.println("userName:" + name);
        return "/index";
    }

    @Autowired
    Dao dao;

    @ResponseBody
    @RequestMapping("test")
    public String test() {
        return JSON.toJSONString(dao.selectList("DemoMapper.select"), true);
    }

    @ResponseBody
    @RequestMapping("webhook")
    public Map webhook(@RequestParam Map map) {
        System.out.println(JSON.toJSONString(map, true));
        return map;
    }


//    @RequestMapping({"/", ""})
//    public String welcome() {
//        return "/index";
//    }
}
