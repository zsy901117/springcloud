package com.sg.dto;

/**
 * Created by zsy
 */
public class LoginDTO {
    private String code;
    
	private String access_token;
    
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

}
