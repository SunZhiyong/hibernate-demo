/*
 * 文件名：Score.java
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
public class Score
{
    @Id
    @Column(  name = "id",unique = true)
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    @Column( name = "stu_id")
    private Long StuId;
    @Column( name = "cname")
    private String CName;
    @Column( name = "grage")
    private int Grage;
    
    public Score()
    {
    }

    public Score(Long id, Long stuId, String cName, int grage)
    {
        super();
        Id = id;
        StuId = stuId;
        CName = cName;
        Grage = grage;
    }

    public Long getId()
    {
        return Id;
    }

    public void setId(Long id)
    {
        Id = id;
    }

    public Long getStuId()
    {
        return StuId;
    }

    public void setStuId(Long stuId)
    {
        StuId = stuId;
    }

    public String getCName()
    {
        return CName;
    }

    public void setCName(String cName)
    {
        CName = cName;
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
