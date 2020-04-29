package com.sg.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sg.entity.Zuul_route;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="路由查询模型")
public class RouteQuery extends Page<Zuul_route> {
	@ApiModelProperty(value="服务名")
	private String service_id;

	public String getService_id() {
		return service_id;
	}

	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

}
