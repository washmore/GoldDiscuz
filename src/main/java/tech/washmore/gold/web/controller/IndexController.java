package tech.washmore.gold.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.washmore.gold.web.dao.Dao;

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
    public String index() {
        return "/index";
    }

    @Autowired
    Dao dao;

    @ResponseBody
    @RequestMapping("test")
    public String test() {
        return JSON.toJSONString(dao.selectList("TestInfoMapper.select"), true);
    }

//    @RequestMapping({"/", ""})
//    public String welcome() {
//        return "/index";
//    }
}
