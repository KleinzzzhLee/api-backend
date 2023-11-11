package com.api.project.model.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

/**
* api.`InterfaceInfo` 接口信息表
* @TableName InterfaceInfo
*/
public class InterfaceInfo implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 接口名称
    */
    @NotBlank(message="[接口名称]不能为空")
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("接口名称")
    private String name;
    /**
    * 接口描述
    */
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("接口描述")
    private String description;
    /**
    * 接口地址
    */
    @NotBlank(message="[接口地址]不能为空")
    @Size(max= 512,message="编码长度不能超过512")
    @ApiModelProperty("接口地址")
    private String url;
    /**
    * 请求类型
    */
    @NotBlank(message="[请求类型]不能为空")
    @Size(max= 256,message="编码长度不能超过256")
    @ApiModelProperty("请求类型")
    private String method;
    /**
    * 创建人
    */
    @NotNull(message="[创建人]不能为空")
    @ApiModelProperty("创建人")
    private Long userId;
    /**
    * 请求头
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("请求头")
    private String requestHeader;
    /**
    * 响应头
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @ApiModelProperty("响应头")
    private String responseHeader;
    /**
    * 接口状态 0 关闭
    */
    @NotNull(message="[接口状态 0 关闭]不能为空")
    @ApiModelProperty("接口状态 0 关闭")
    private Integer status;
    /**
    * 是否删除
    */
    @NotNull(message="[是否删除]不能为空")
    @ApiModelProperty("是否删除")
    private Integer isDelete;
    /**
    * 创建时间
    */
    @NotNull(message="[创建时间]不能为空")
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 修改时间
    */
    @NotNull(message="[修改时间]不能为空")
    @ApiModelProperty("修改时间")
    private Date updateTime;

    /**
    * 主键
    */
    public  void setId(Long id){
    this.id = id;
    }

    /**
    * 接口名称
    */
    public  void setName(String name){
    this.name = name;
    }

    /**
    * 接口描述
    */
    public  void setDescription(String description){
    this.description = description;
    }

    /**
    * 接口地址
    */
    public  void setUrl(String url){
    this.url = url;
    }

    /**
    * 请求类型
    */
    public  void setMethod(String method){
    this.method = method;
    }

    /**
    * 创建人
    */
    public  void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 请求头
    */
    public  void setRequestHeader(String requestHeader){
    this.requestHeader = requestHeader;
    }

    /**
    * 响应头
    */
    public  void setResponseHeader(String responseHeader){
    this.responseHeader = responseHeader;
    }

    /**
    * 接口状态 0 关闭
    */
    public  void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 是否删除
    */
    public  void setIsDelete(Integer isDelete){
    this.isDelete = isDelete;
    }

    /**
    * 创建时间
    */
    public  void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 修改时间
    */
    public  void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }


    /**
    * 主键
    */
    public  Long getId(){
    return this.id;
    }

    /**
    * 接口名称
    */
    public  String getName(){
    return this.name;
    }

    /**
    * 接口描述
    */
    public  String getDescription(){
    return this.description;
    }

    /**
    * 接口地址
    */
    public  String getUrl(){
    return this.url;
    }

    /**
    * 请求类型
    */
    public  String getMethod(){
    return this.method;
    }

    /**
    * 创建人
    */
    public Long getUserId(){
    return this.userId;
    }

    /**
    * 请求头
    */
    public  String getRequestHeader(){
    return this.requestHeader;
    }

    /**
    * 响应头
    */
    public  String getResponseHeader(){
    return this.responseHeader;
    }

    /**
    * 接口状态 0 关闭
    */
    public  Integer getStatus(){
    return this.status;
    }

    /**
    * 是否删除
    */
    public  Integer getIsDelete(){
    return this.isDelete;
    }

    /**
    * 创建时间
    */
    public  Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 修改时间
    */
    public  Date getUpdateTime(){
    return this.updateTime;
    }

}
