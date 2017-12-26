package com.demo.server;
import java.util.HashMap;
import java.util.Map;

import com.demo.export.IHello;

/** 
 * 模拟配置，实际的框架中大部分都是使用xml进行配置的，比如Hessian是配置在web.xml的servlet属性里的 
 * 
 */  
public class ConfMonitor {  
    public static Map<String, Class> conf = new HashMap<String, Class>();  
      
    static {  
        conf.put(IHello.class.getName(), HelloImpl.class);  
    }
}  