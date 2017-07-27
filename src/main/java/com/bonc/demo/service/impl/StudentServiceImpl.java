/*
 * 文件名：StudentServiceImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.demo.dao.StudentDao;
import com.bonc.demo.dao.impl.StudentImpl;
import com.bonc.demo.entity.Student;
import com.bonc.demo.entity.StudetnScore;
import com.bonc.demo.service.StudentService;
import com.bonc.demo.util.JsonResult;

@Service("studentService")
public class StudentServiceImpl implements StudentService
{   
    @Autowired
    private StudentImpl studentImpl;
    public JsonResult allStudent(){
        return new JsonResult(studentImpl.getAllStudentList());
    }
    
    public JsonResult findStudentByName(String name){
        return new JsonResult(studentImpl.findStudentByName(name));
    }
    
    public List<Object> partStudent(String name){
        return studentImpl.partStudent(name);
    }
    
    public JsonResult findStudentByNames(String name){
        return new JsonResult(studentImpl.findStudentByNames(name));
    }
    
    public JsonResult pageStudent(int page,int pagesize){
        return new JsonResult(studentImpl.pageStudent(page, pagesize));
    }
    
 
    public JsonResult getAllStudentListQBC(){
        return new JsonResult(studentImpl.getAllStudentListQBC());
    }
    
    public JsonResult findStudentByNameQBC(String name){
        return new JsonResult(studentImpl.findStudentByNameQBC(name));
    }
    
    public JsonResult findStudentByNameLike(String name){
        return new JsonResult(studentImpl.findStudentByNameLike(name));
    }
    
    public JsonResult findStudentAnd(Long id,String department){
        return new JsonResult(studentImpl.findStudentAnd(id, department));
    }
    public Student uniqueStudent(Long id){
        return studentImpl.uniqueStudent(id);
    }
    
    public JsonResult pageStudentQBC(int page,int pagesize){
        return new JsonResult(studentImpl.pageStudentQBC(page, pagesize));
    }
    
    public List<Object> getAllStudentListYS(){
        return studentImpl.getAllStudentListYS();
    }
    
    public List<StudetnScore> addEntity(){
        return studentImpl.addEntity();
    }
}
