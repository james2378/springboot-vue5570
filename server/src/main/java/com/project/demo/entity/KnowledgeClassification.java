package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 知识分类：(KnowledgeClassification)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "KnowledgeClassification")
public class KnowledgeClassification implements Serializable {

    // KnowledgeClassification编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knowledge_classification_id")
    private Integer knowledge_classification_id;

    // 知识分类
    @Basic
    private String knowledge_classification;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
