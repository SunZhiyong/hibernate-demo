/*
 * 文件名：JsonResult.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：zhiyong
 * 修改时间：2017年7月13日
 */

package com.bonc.demo.util;

import java.io.Serializable;

public class JsonResult implements Serializable
{

    /**
     * 意义，目的和功能，以及被用到的地方<br>
     */
    private static final long serialVersionUID = 6091973330317158401L;
    public static final int SUCCESS = 1;
    public static final int ERROR = 0;
    private int state;
    private Object data;
    private String message;
    
    public JsonResult(){
        
    }
    
    

    public JsonResult(Object data)
    {
        state = SUCCESS;
        this.data = data;
        this.message = "";
    }
    
    public JsonResult(Throwable e)
    {
        state = ERROR;
        this.data = "";
        this.message = e.getMessage();
    }
    
    public JsonResult(int state,Throwable e)
    {
        this.state = state;
        this.data = "";
        this.message = e.getMessage();
    }

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }



    @Override
    public String toString()
    {
        return "JsonResult [state=" + state + ", data=" + data + ", message=" + message + "]";
    }
    
    
    
}
