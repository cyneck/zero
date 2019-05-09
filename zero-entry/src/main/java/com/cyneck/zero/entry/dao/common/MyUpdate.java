package com.cyneck.zero.entry.dao.common;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao.common
 * @Description : TODO
 * @Create on : 2019/5/9 09:01
 **/
public class MyUpdate {

    private Class<? extends Object> myClass;
    private Object object;
    private String[] memberArray;// 类变量
    private Object[] resultArray;// get结果
    private int length;// 变量个数
    private String className;

    public MyUpdate(Object object) {
        this.myClass = object.getClass();
        this.object = object;

        try {
            myInit();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void myInit() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            NoSuchMethodException, SecurityException {
        // 成员变量
        Field[] declaredFields = myClass.getDeclaredFields();

        length = declaredFields.length;

        memberArray = new String[length];

        resultArray = new Object[length];

        for (int i = 0; i < length; i++) {
            String name = declaredFields[i].getName();

            memberArray[i] = name;

            // 得到get方法的结果
            resultArray[i] = myClass.getMethod("get" + (char) (name.charAt(0) - 32) + name.substring(1)).invoke(object);
        }

        String[] split = myClass.getName().split("\\.");

        className = split[split.length - 1];
    }

    // 拼接sql语句
    public String getSql() {

        String sql = "update " + className + " set " + memberArray[1];

        for (int i = 2; i < length; i++) {
            sql += "=? ," + memberArray[i];
        }

        sql += "=? where " + memberArray[0] + "=?";

        return sql;
    }

    public Object[] getResultArray() {
        return resultArray;
    }

    public int getLength() {
        return length;
    }
}
