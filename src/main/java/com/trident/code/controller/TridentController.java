package com.trident.code.controller;

import com.trident.code.service.TridentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 119329038@qq.com
 */
@Controller
@RequestMapping(value = "/trident")
public class TridentController {
    @Autowired
    private TridentService authorityService;

    @RequestMapping(value = "call")
    public String index(HttpServletRequest request,HttpServletResponse response,
                        @RequestParam(value="get",required = false)String get,
                        @RequestParam(value="post",required = false)String post
                        ){

		return null;
    }
}
