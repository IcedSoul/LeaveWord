package com.leaveword.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
public class Word {
    @Id
    @GeneratedValue
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '留言主键'")
    private int wordId;
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '用户外键'")
    private int userId;
    @Column(nullable = false, columnDefinition = "varchar(100) COMMENT '留言标题' default '未命名'")
    private String title;
    @Column(nullable = false, columnDefinition = "varchar(20000) COMMENT '留言内容' default '没有内容'")
    private String content;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '留言时间'")
    private Timestamp leaveTime;
}
