package com.sg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zsy
 * @since 2019-06-11
 */
@ApiModel(value = "网关路由")
public class Zuul_route extends Model<Zuul_route> {

    private static final long serialVersionUID = 1L;
   @ApiModelProperty(value = "网关路由id")
    private String id;
   @ApiModelProperty(value="前台路径")
    private String path;
   @ApiModelProperty(value="程序名称")
    private String service_id;
   @ApiModelProperty(value="后台访问路径")
    private String url;
   @ApiModelProperty(value="是否重试")
    private Boolean retryable;
   @ApiModelProperty(value="是否可用")
    private Boolean enabled;
   @ApiModelProperty(value="去除前缀")
    private Boolean strip_prefix;
   @ApiModelProperty(value="服务中文名称")
    private String api_name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getRetryable() {
        return retryable;
    }

    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getStrip_prefix() {
        return strip_prefix;
    }

    public void setStrip_prefix(Boolean strip_prefix) {
        this.strip_prefix = strip_prefix;
    }

    public String getApi_name() {
        return api_name;
    }

    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Zuul_route{" +
        "id=" + id +
        ", path=" + path +
        ", service_id=" + service_id +
        ", url=" + url +
        ", retryable=" + retryable +
        ", enabled=" + enabled +
        ", strip_prefix=" + strip_prefix +
        ", api_name=" + api_name +
        "}";
    }
}
