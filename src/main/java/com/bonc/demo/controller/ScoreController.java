/*
 * 文件名：ScoreController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.demo.service.ScoreService;

@Controller
public class ScoreController
{
    @Autowired
    @Qualifier("scoreService")
    private ScoreService scoreService;
    
    @RequestMapping("/countGrade")
    @ResponseBody
    public List countGrade(){
        return scoreService.countGrade();
    }
    
    @RequestMapping("/someGrade")
    @ResponseBody
    public Object[]  someGrade(){
        return scoreService.someGrade();
    }
}
