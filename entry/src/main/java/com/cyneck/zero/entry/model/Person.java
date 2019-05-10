package com.cyneck.zero.entry.model;

import com.cyneck.zero.entry.dao.common.Update;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.model
 * @Description : TODO
 * @Create on : 2019/5/9 09:06
 **/
public class Person implements Serializable, Comparable<com.cyneck.zero.entry.model.Person> {

    @NotNull(message = "id不能为空", groups = {Update.class})
    @Min(value = 1, message = "id最小值不能为0", groups = {Update.class})
    private long personId;

    @NotEmpty(message = "不能为空", groups = {Update.class})
    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public Person(long personId, String name, String sex, int age) {
        this.personId = personId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        //1,0,-1都要实现，否则可能会在部分排序中异常
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}
