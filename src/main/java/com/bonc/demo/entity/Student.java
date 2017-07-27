/*
 * 文件名：Student.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月20日
 */

package com.bonc.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student
{

    @Id
    @Column( name= "stu_id",unique = true)
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long StuId;
    @Column( name= "stu_name")
    private String StuName;
    
    @Column( name= "stu_sex")
    private String StuSex;

    @Column( name= "year")
    @Temporal(TemporalType.DATE)
    private Date Year;
    
    @Column( name= "department")
    private String Department;
    
    @Column( name= "address")
    private String Address;
    
    public Student()
    {
    }
    
    /**
     * Student 构造方法
     * @param stuId
     * @param stuName
     * @param stuSex
     * @param year
     * @param department
     * @param address
     */
    public Student(Long stuId, String stuName, String stuSex, Date year,
                   String department, String address)
    {
        super();
        StuId = stuId;
        StuName = stuName;
        StuSex = stuSex;
        Year = year;
        Department = department;
        Address = address;
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

    public String getStuSex()
    {
        return StuSex;
    }

    public void setStuSex(String stuSex)
    {
        StuSex = stuSex;
    }

    public Date getYear()
    {
        return Year;
    }

    public void setYear(Date year)
    {
        Year = year;
    }

    public String getDepartment()
    {
        return Department;
    }

    public void setDepartment(String department)
    {
        Department = department;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

}
