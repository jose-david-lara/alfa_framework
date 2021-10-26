package com.wposs.alfa.framework.core.utils.spring;

import java.util.ArrayList;

public class ModelResponseWS {
	
	private boolean error;
	private String mensaje;
	private ArrayList<String> data;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public ArrayList<String> getData() {
		return data;
	}
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ModelResponseWS [error=" + error + ", mensaje=" + mensaje + ", data=" + data + "]";
	}
	

}
