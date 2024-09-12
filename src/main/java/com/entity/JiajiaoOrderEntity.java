package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 家教订单
 *
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiajiao_order")
public class JiajiaoOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiajiaoOrderEntity() {

	}

	public JiajiaoOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 家教
     */
    @TableField(value = "jiajiao_id")

    private Integer jiajiaoId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 见面时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiajiao_time",fill = FieldFill.UPDATE)

    private Date jiajiaoTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：家教
	 */
    public Integer getJiajiaoId() {
        return jiajiaoId;
    }


    /**
	 * 获取：家教
	 */

    public void setJiajiaoId(Integer jiajiaoId) {
        this.jiajiaoId = jiajiaoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：见面时间
	 */
    public Date getJiajiaoTime() {
        return jiajiaoTime;
    }


    /**
	 * 获取：见面时间
	 */

    public void setJiajiaoTime(Date jiajiaoTime) {
        this.jiajiaoTime = jiajiaoTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JiajiaoOrder{" +
            "id=" + id +
            ", jiajiaoId=" + jiajiaoId +
            ", yonghuId=" + yonghuId +
            ", jiajiaoTime=" + jiajiaoTime +
            ", createTime=" + createTime +
        "}";
    }
}
