/*
 * 文件名：StudentService.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.service;

import java.util.List;

import com.bonc.demo.entity.Student;
import com.bonc.demo.entity.StudetnScore;
import com.bonc.demo.util.JsonResult;

public interface StudentService
{
    JsonResult allStudent();
    JsonResult findStudentByName(String name);
    List<Object>partStudent(String name);
    JsonResult findStudentByNames(String name);
    JsonResult pageStudent(int page,int pagesize);
    JsonResult getAllStudentListQBC();
    JsonResult findStudentByNameQBC(String name);
    JsonResult findStudentByNameLike(String name);
    JsonResult findStudentAnd(Long id,String department);
    Student  uniqueStudent(Long id);
    JsonResult pageStudentQBC(int page,int pagesize);
    List<Object> getAllStudentListYS();
    List<StudetnScore> addEntity();
}
