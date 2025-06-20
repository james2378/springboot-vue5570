package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 应急知识：(EmergencyKnowledge)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "EmergencyKnowledge")
public class EmergencyKnowledge implements Serializable {

    // EmergencyKnowledge编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emergency_knowledge_id")
    private Integer emergency_knowledge_id;

    // 知识标题
    @Basic
    private String knowledge_title;
    // 知识分类
    @Basic
    private String knowledge_classification;
    // 封面图片
    @Basic
    private String cover_photo;
    // 知识视频
    @Basic
    private String knowledge_video;
    // 知识内容
    @Basic
    private String knowledge_content;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
