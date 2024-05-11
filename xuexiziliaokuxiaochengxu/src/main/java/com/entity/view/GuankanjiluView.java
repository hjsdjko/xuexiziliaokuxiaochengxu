package com.entity.view;

import com.entity.GuankanjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 观看记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("guankanjilu")
public class GuankanjiluView extends GuankanjiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 ziliao
			/**
			* 阅读资料名称
			*/
			private String ziliaoName;
			/**
			* 资料类型
			*/
			private Integer ziliaoTypes;
				/**
				* 资料类型的值
				*/
				private String ziliaoValue;
			/**
			* 封面
			*/
			private String ziliaoPhoto;
			/**
			* 文件
			*/
			private String ziliaoFile;
			/**
			* 阅读资料 的 用户
			*/
			private Integer ziliaoYonghuId;
			/**
			* 点击次数
			*/
			private Integer ziliaoClickNumber;
			/**
			* 审核状态
			*/
			private Integer ziliaoYesnoTypes;
				/**
				* 审核状态的值
				*/
				private String ziliaoYesnoValue;
			/**
			* 审核结果
			*/
			private String ziliaoYesnoText;

	public GuankanjiluView() {

	}

	public GuankanjiluView(GuankanjiluEntity guankanjiluEntity) {
		try {
			BeanUtils.copyProperties(this, guankanjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




















				//级联表的get和set yonghu

					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


				//级联表的get和set ziliao

					/**
					* 获取： 阅读资料名称
					*/
					public String getZiliaoName() {
						return ziliaoName;
					}
					/**
					* 设置： 阅读资料名称
					*/
					public void setZiliaoName(String ziliaoName) {
						this.ziliaoName = ziliaoName;
					}

					/**
					* 获取： 资料类型
					*/
					public Integer getZiliaoTypes() {
						return ziliaoTypes;
					}
					/**
					* 设置： 资料类型
					*/
					public void setZiliaoTypes(Integer ziliaoTypes) {
						this.ziliaoTypes = ziliaoTypes;
					}


						/**
						* 获取： 资料类型的值
						*/
						public String getZiliaoValue() {
							return ziliaoValue;
						}
						/**
						* 设置： 资料类型的值
						*/
						public void setZiliaoValue(String ziliaoValue) {
							this.ziliaoValue = ziliaoValue;
						}

					/**
					* 获取： 封面
					*/
					public String getZiliaoPhoto() {
						return ziliaoPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setZiliaoPhoto(String ziliaoPhoto) {
						this.ziliaoPhoto = ziliaoPhoto;
					}

					/**
					* 获取： 文件
					*/
					public String getZiliaoFile() {
						return ziliaoFile;
					}
					/**
					* 设置： 文件
					*/
					public void setZiliaoFile(String ziliaoFile) {
						this.ziliaoFile = ziliaoFile;
					}

					/**
					* 获取：阅读资料 的 用户
					*/
					public Integer getZiliaoYonghuId() {
						return ziliaoYonghuId;
					}
					/**
					* 设置：阅读资料 的 用户
					*/
					public void setZiliaoYonghuId(Integer ziliaoYonghuId) {
						this.ziliaoYonghuId = ziliaoYonghuId;
					}


					/**
					* 获取： 点击次数
					*/
					public Integer getZiliaoClickNumber() {
						return ziliaoClickNumber;
					}
					/**
					* 设置： 点击次数
					*/
					public void setZiliaoClickNumber(Integer ziliaoClickNumber) {
						this.ziliaoClickNumber = ziliaoClickNumber;
					}

					/**
					* 获取： 审核状态
					*/
					public Integer getZiliaoYesnoTypes() {
						return ziliaoYesnoTypes;
					}
					/**
					* 设置： 审核状态
					*/
					public void setZiliaoYesnoTypes(Integer ziliaoYesnoTypes) {
						this.ziliaoYesnoTypes = ziliaoYesnoTypes;
					}


						/**
						* 获取： 审核状态的值
						*/
						public String getZiliaoYesnoValue() {
							return ziliaoYesnoValue;
						}
						/**
						* 设置： 审核状态的值
						*/
						public void setZiliaoYesnoValue(String ziliaoYesnoValue) {
							this.ziliaoYesnoValue = ziliaoYesnoValue;
						}

					/**
					* 获取： 审核结果
					*/
					public String getZiliaoYesnoText() {
						return ziliaoYesnoText;
					}
					/**
					* 设置： 审核结果
					*/
					public void setZiliaoYesnoText(String ziliaoYesnoText) {
						this.ziliaoYesnoText = ziliaoYesnoText;
					}










}
