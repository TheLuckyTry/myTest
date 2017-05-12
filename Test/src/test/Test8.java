package test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test8 {
    
   // private String name="111";
    
//    private int age=11;
//    
   private Date Time;
    
    
    
//    public String getName() {
//        return name;
//    }
//
//
//
//    public void setName(String name) {
//        this.name = name;
//    }



//    public int getAge() {
//        return age;
//    }



//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//
    public Date getTime() {
        return Time;
    }



    public void setTime(Date time) {
        Time = time;
    }



    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        Test8 t =new Test8();
        
        Class cls=t.getClass();
        
        Field[] fields = cls.getDeclaredFields();
        for(Field field:fields){
            PropertyDescriptor pd = new PropertyDescriptor("Time", cls);
            //获得set方法
            Method method = pd.getWriteMethod();
           method.invoke(t, new Object[]{new Date()});
            //获得get方法
            Method get = pd.getReadMethod();
            Object getValue = get.invoke(t, new Object[]{});
            String value=String.valueOf(getValue);
            if (getValue instanceof Date){
                
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                
               value= sdf.format(getValue);
            }
            System.out.println(field.getGenericType());
            System.out.println("field:"+field.getName()+"---getValue:"+value);
        }
     

    }

    
   
}
