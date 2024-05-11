package com.entity.vo;

import com.entity.ZiliaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 阅读资料
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ziliao")
public class ZiliaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 阅读资料名称
     */

    @TableField(value = "ziliao_name")
    private String ziliaoName;


    /**
     * 资料类型
     */

    @TableField(value = "ziliao_types")
    private Integer ziliaoTypes;


    /**
     * 封面
     */

    @TableField(value = "ziliao_photo")
    private String ziliaoPhoto;


    /**
     * 文件
     */

    @TableField(value = "ziliao_file")
    private String ziliaoFile;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 点击次数
     */

    @TableField(value = "ziliao_click_number")
    private Integer ziliaoClickNumber;


    /**
     * 审核状态
     */

    @TableField(value = "ziliao_yesno_types")
    private Integer ziliaoYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "ziliao_yesno_text")
    private String ziliaoYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：阅读资料名称
	 */
    public String getZiliaoName() {
        return ziliaoName;
    }


    /**
	 * 获取：阅读资料名称
	 */

    public void setZiliaoName(String ziliaoName) {
        this.ziliaoName = ziliaoName;
    }
    /**
	 * 设置：资料类型
	 */
    public Integer getZiliaoTypes() {
        return ziliaoTypes;
    }


    /**
	 * 获取：资料类型
	 */

    public void setZiliaoTypes(Integer ziliaoTypes) {
        this.ziliaoTypes = ziliaoTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getZiliaoPhoto() {
        return ziliaoPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setZiliaoPhoto(String ziliaoPhoto) {
        this.ziliaoPhoto = ziliaoPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getZiliaoFile() {
        return ziliaoFile;
    }


    /**
	 * 获取：文件
	 */

    public void setZiliaoFile(String ziliaoFile) {
        this.ziliaoFile = ziliaoFile;
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
	 * 设置：点击次数
	 */
    public Integer getZiliaoClickNumber() {
        return ziliaoClickNumber;
    }


    /**
	 * 获取：点击次数
	 */

    public void setZiliaoClickNumber(Integer ziliaoClickNumber) {
        this.ziliaoClickNumber = ziliaoClickNumber;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getZiliaoYesnoTypes() {
        return ziliaoYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setZiliaoYesnoTypes(Integer ziliaoYesnoTypes) {
        this.ziliaoYesnoTypes = ziliaoYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getZiliaoYesnoText() {
        return ziliaoYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setZiliaoYesnoText(String ziliaoYesnoText) {
        this.ziliaoYesnoText = ziliaoYesnoText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
