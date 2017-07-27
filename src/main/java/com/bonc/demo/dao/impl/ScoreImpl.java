/*
 * 文件名：ScoreImpl.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.bonc.demo.dao.ScoreDao;
import com.bonc.demo.entity.Score;
import com.bonc.demo.entity.Student;
import com.bonc.demo.util.HibernateUtil;

@Repository
public class ScoreImpl implements ScoreDao
{
    public List countGrade(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        String hql = "select count(*),max(Grage) from Score";
        Query query = session.createQuery(hql);
        List scoreList = query.list();
        session.getTransaction().commit();
        return scoreList;
    }
   
    public Object[] someGrade(){
        Session  session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria c = session.createCriteria(Score.class);
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.sum("Grage"));
        projectionList.add(Projections.min("Grage"));
        projectionList.add(Projections.max("Grage"));
        c.setProjection(projectionList);
        Object[]  lists = (Object[])c.uniqueResult();
        return lists;
    }
}
