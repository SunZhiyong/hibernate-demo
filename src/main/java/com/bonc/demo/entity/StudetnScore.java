/*
 * 文件名：StudetnScore.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudetnScore
{   
    @Id
    @Column( name= "stu_id",unique = true)
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long StuId;
    @Column( name= "stu_name")
    private String StuName;
    @Column( name = "grage")
    private int Grage;
    public StudetnScore()
    {
    }
    public StudetnScore(Long stuId, String stuName, int grage)
    {
        super();
        StuId = stuId;
        StuName = stuName;
        Grage = grage;
    }
    public Long getStuId()
    {
        return StuId;
    }
    public void setStuId(Long stuId)
    {
        StuId = stuId;
    }
    public String getStuName()
    {
        return StuName;
    }
    public void setStuName(String stuName)
    {
        StuName = stuName;
    }
    public int getGrage()
    {
        return Grage;
    }
    public void setGrage(int grage)
    {
        Grage = grage;
    }
    
    
}
