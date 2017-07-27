/*
 * 文件名：ScoreServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.demo.dao.impl.ScoreImpl;
import com.bonc.demo.service.ScoreService;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService
{
    @Autowired
    private ScoreImpl scoreImpl;
    public List countGrade(){
        return scoreImpl.countGrade();
    }
    
    public Object[]  someGrade(){
        return scoreImpl.someGrade();
    }
    

}
