package org.example.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName news_user
 */
@TableName(value ="news_user")
@Data
public class NewsUser implements Serializable {
    @TableId
    private Integer uid;

    private String username;

    private String userPwd;

    private String nickName;

    private Integer version;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}