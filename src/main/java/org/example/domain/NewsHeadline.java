package org.example.domain;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hp
 * @TableName news_headline
 */
@TableName(value ="news_headline")
@Data
public class NewsHeadline implements Serializable {
    private Integer hid;

    private String title;

    private String article;

    private Integer type;

    private Integer publisher;

    private Integer pageViews;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}