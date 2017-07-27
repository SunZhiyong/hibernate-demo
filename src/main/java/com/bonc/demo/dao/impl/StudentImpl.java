/*
 * 文件名：StudentImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bonc.demo.dao.StudentDao;
import com.bonc.demo.entity.Student;
import com.bonc.demo.entity.StudetnScore;
import com.bonc.demo.util.HibernateUtil;

@Repository
public class StudentImpl implements StudentDao
{

    public List<Student> getAllStudentList(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        String hql = "from Student";
        Query query = session.createQuery(hql);
        List<Student> studentList = query.list();
        session.getTransaction().commit();
        return studentList;  
    }
    
    public List<Student>findStudentByName(String name){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        String hql = "from Student where StuName=?";
        Query query = session.createQuery(hql);
        // 索引从0开始 
        query.setString(0, name);
        List<Student> studentList = query.list();
        session.getTransaction().commit();
        return studentList;  
    }
    
    public List<Object> partStudent(String name){
            Session  session = HibernateUtil.getSession();
            session.beginTransaction();
            String hql = "select StuName,Department,Address from Student where StuName=?";
            Query query = session.createQuery(hql);
            // 索引从0开始 
            query.setString(0, name);
            List<Object> studentList = query.list();
            session.getTransaction().commit();
            return studentList;
    }
    
    public List<Student>findStudentByNames(String name){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        String hql = "from Student where StuName=:name";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        List<Student> studentList = query.list();
        session.getTransaction().commit();
        return studentList;  
    }
    
    public List<Student> pageStudent(int page,int pagesize){
        Session  session = HibernateUtil.getSession();
        int first = (page-1)*pagesize;
        session.beginTransaction();
        String hql = "from Student";
        Query query = session.createQuery(hql);
        query.setFirstResult(first);
        query.setMaxResults(pagesize);
        List<Student> studentList = query.list();
        session.getTransaction().commit();
        return studentList;
    }
    
    public List<Student> getAllStudentListQBC(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Student.class);
       //c.addOrder(Order.desc("id"));
        c.addOrder(Order.asc("id"));
        List<Student> studentList = c.list();
        session.getTransaction().commit();
        return studentList;
        
    }
    
    public List<Student> findStudentByNameQBC(String name){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Student.class);
        c.add(Restrictions.eq("StuName", name));
        List<Student> studentList = c.list();
        session.getTransaction().commit();
        return studentList;
        
    }
    
    public List<Student> findStudentByNameLike(String name){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Student.class);
        c.add(Restrictions.like("StuName", name));
        List<Student> studentList = c.list();
        session.getTransaction().commit();
        return studentList;
    }
    public List<Student> findStudentAnd(Long id,String department){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Student.class);
        c.add(Restrictions.or(Restrictions.eq("StuId", id),
            Restrictions.eq("Department", department)));
        List<Student> studentList = c.list();
        session.getTransaction().commit();
        return studentList;
    }
    
    public Student  uniqueStudent(Long id){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Student.class);
        c.add(Restrictions.eq("id", id));
        Student studentList =(Student) c.uniqueResult();
        session.getTransaction().commit();
        return studentList;
    }
    
    public List<Student> pageStudentQBC(int page,int pagesize){
            Session  session = HibernateUtil.getSession();
            int first = (page-1)*pagesize;
            session.beginTransaction();
            Criteria c = session.createCriteria(Student.class);
            c.setFirstResult(first);
            c.setMaxResults(pagesize);
            List<Student> studentList = c.list();
            session.getTransaction().commit();
            return studentList;
    }
    
    public List<Object> getAllStudentListYS(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
//        String sql ="select stu_id,stu_name,department from student";
        String sql = "select score.stu_id,stu_name,grage from score,student where score.stu_id=student.stu_id";
        List<Object> lists = session.createSQLQuery(sql).list();
        return lists;
    }
    
    public List<StudetnScore> addEntity(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        String sql = "select score.stu_id,stu_name,grage from score,student where score.stu_id=student.stu_id";
        SQLQuery query = session.createSQLQuery(sql).addEntity(StudetnScore.class);
        List<StudetnScore> list = query.list();
        return list;

    }
}
