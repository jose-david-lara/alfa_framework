package com.wposs.alfa.framework.core.utils.model;

import java.io.Serializable;
import java.util.Map;

public class BaseResponse<B extends Object> implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private boolean ok;
	private String msgError;
	private Integer errorCode;
	private Map<String,?> errorInformation; //NOSONAR
	private String token;
	private B model; //NOSONAR: No puede ser transcient
	
	public BaseResponse(){
		// No se procesa
	}

	public B getModel() {
		return model;
	}

	public void setModel(B model) {
		this.model = model;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Map<String,?> getErrorInformation() { //NOSONAR
		return errorInformation;
	}

	public void setErrorInformation(Map<String,?> errorInformation) {
		this.errorInformation = errorInformation;
	}

}
