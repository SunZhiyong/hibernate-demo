/*
 * 文件名：StudentController.java
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bonc.demo.dao.impl.StudentImpl;
import com.bonc.demo.entity.Student;
import com.bonc.demo.entity.StudetnScore;
import com.bonc.demo.service.StudentService;
import com.bonc.demo.util.JsonResult;

@Controller
public class StudentController
{   
    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;
    
    @RequestMapping("/allStudent")
    @ResponseBody
    public JsonResult allStudent(){
        return studentService.allStudent();
    }
    
    @RequestMapping("/findStudentByName")
    @ResponseBody
    public JsonResult findStudentByName(@RequestParam("name") String name){
        return studentService.findStudentByName(name);
    }
    
    @RequestMapping("/partStudent")
    @ResponseBody
    public List<Object> partStudent(@RequestParam("name") String name){
        return studentService.partStudent(name);
    }
    
    @RequestMapping("/findStudentByNames")
    @ResponseBody
    public JsonResult findStudentByNames(@RequestParam("name") String name){
        return studentService.findStudentByNames(name);
    }
    
    @RequestMapping("/pageStudent")
    @ResponseBody
    public JsonResult pageStudent(@RequestParam("page") int page,
                                  @RequestParam("pagesize") int pagesize){
        return studentService.pageStudent(page, pagesize);
    }
    
    @RequestMapping("/getAllStudentListQBC")
    @ResponseBody
    public JsonResult getAllStudentListQBC(){
        return studentService.getAllStudentListQBC();
    }
    
    @RequestMapping("/findStudentByNameQBC")
    @ResponseBody
    public JsonResult findStudentByNameQBC(@RequestParam("name") String name){
        return studentService.findStudentByNameQBC(name);
    }
    
    @RequestMapping("/findStudentByNameLike")
    @ResponseBody
    public JsonResult findStudentByNameLike(@RequestParam("name") String name){
        return studentService.findStudentByNameLike(name);
    }
    
    @RequestMapping("/findStudentAnd")
    @ResponseBody
    public JsonResult findStudentAnd(@RequestParam("id") Long id,
                                     @RequestParam("department") String department){
        return studentService.findStudentAnd(id, department);
    }
    
    @RequestMapping("/uniqueStudent")
    @ResponseBody
    public Student uniqueStudent(Long id){
        return studentService.uniqueStudent(id);
    }
    
    @RequestMapping("/pageStudentQBC")
    @ResponseBody
    public JsonResult pageStudentQBC(@RequestParam("page") int page,
                                  @RequestParam("pagesize") int pagesize){
        return studentService.pageStudentQBC(page, pagesize);
    }
    
    @RequestMapping("/getAllStudentListYS")
    @ResponseBody
    public List<Object>getAllStudentListYS(){
        return studentService.getAllStudentListYS();
    }
    
    @RequestMapping("/addEntity")
    @ResponseBody
    public List<StudetnScore> addEntity(){
        return studentService.addEntity();
    }
}
