/*
 * 文件名：StudentDao.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import com.bonc.demo.entity.Student;
import com.bonc.demo.entity.StudetnScore;

public interface StudentDao
{
    List<Student> getAllStudentList();
    List<Student> findStudentByName(String name);
    List<Object> partStudent(String name);
    List<Student> findStudentByNames(String name);
    List<Student> pageStudent(int page,int pagesize);
    
    List<Student> getAllStudentListQBC();
    List<Student> findStudentByNameQBC(String name);
    List<Student> findStudentByNameLike(String name);
    
    List<Student> findStudentAnd(Long id,String department);
    Student uniqueStudent(Long id);
    List<Student> pageStudentQBC(int page,int pagesize);
    
    List<Object> getAllStudentListYS();
    List<StudetnScore> addEntity();
}
