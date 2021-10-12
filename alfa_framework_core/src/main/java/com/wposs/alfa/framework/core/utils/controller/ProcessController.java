package com.wposs.alfa.framework.core.utils.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public abstract class ProcessController<T> {


	private BindingResult bindingResult;
	private Object request;
	private RedirectAttributes redirectAttributes;

	public ProcessController( BindingResult bindingResult, RedirectAttributes redirectAttributes ) {
		this.setBindingResult(bindingResult);
		this.setRedirectAttributes(redirectAttributes);
	}

	// Para servicios con parametros de entrada
	public ProcessController( Object request, BindingResult bindingResult ) {
		this.setBindingResult(bindingResult);
		this.redirectAttributes = null;
		this.request = request;
	}
	
	// Para servicios sin parámetros de entrada
	public ProcessController( BindingResult bindingResult ) {
		this.setBindingResult(bindingResult);
		this.redirectAttributes = null;
	}

	// Para servicios sin parametros de entrada
	public ProcessController() {
		this.bindingResult = null;
		this.redirectAttributes = null;
	}

	public void onError( T response, BindingResult bindingResult ) throws Exception {}

	public void onExtendValidate( T response, BindingResult bindingResult )  throws Exception {}

	public abstract ResponseEntity<T> onProcess( T response ) throws Exception;

	public BindingResult getBindingResult() {
		return bindingResult;
	}

	public void setBindingResult(BindingResult bindingResult) {
		this.bindingResult = bindingResult;
	}

	public RedirectAttributes getRedirectAttributes() {
		return redirectAttributes;
	}

	public void setRedirectAttributes(RedirectAttributes redirectAttributes) {
		this.redirectAttributes = redirectAttributes;
	}
	
	public Object getRequest(){
		return this.request;
	}
	
}
