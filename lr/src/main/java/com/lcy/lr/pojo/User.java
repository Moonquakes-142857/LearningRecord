package com.lcy.lr.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data //生成getset方法及tostring，equals方法
@Entity //表示这是一个实体类
@Table(name = "user") //数据库对应的表名
@JsonIgnoreProperties({"handler","hiberbateLazyInitializer"}) //这两个属性无须 json 化，忽略掉
public class User {

    @Id //一个实体类的属性映射为数据库的主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY) //生成一个唯一标识的主键
    @Column(name = "id") //标识实体类与数据表的对应关系
    int id;
    String username;
    String password;
}
