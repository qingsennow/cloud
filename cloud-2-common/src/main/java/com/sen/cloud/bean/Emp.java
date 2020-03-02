package com.sen.cloud.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@Component
//@Validated
//@Entity
//@Table(name = "emp")
public class Emp {
    //  @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @Column(name = "name" , length = 7)
    private String name;
    //  @Column
    private int age;
    // @Column
    private Double slaray;
    //  @Column
    private Date birthday;
    private Map map;
    private List list;
    private Long hid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSlaray() {
        return slaray;
    }

    public void setSlaray(Double slaray) {
        this.slaray = slaray;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }



    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", slaray=" + slaray +
                ", brithday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public Emp() {
    }

    public Emp(String name, int age, Double slaray) {
        this.name = name;
        this.age = age;
        this.slaray = slaray;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }
}
