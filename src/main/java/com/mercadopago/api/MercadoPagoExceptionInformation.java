package com.mercadopago.api;

import javax.xml.bind.annotation.XmlElement;

import com.google.common.base.MoreObjects;

public class MercadoPagoExceptionInformation {

	@XmlElement(name = "message")
	private String message;

	@XmlElement(name = "error")
	private String error;

	@XmlElement(name = "status")
	private String status;

	@XmlElement(name = "cause")
	private String[] causes;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String[] getCauses() {
		return causes;
	}

	public void setCauses(String[] causes) {
		this.causes = causes;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("message", message)
			.add("error", error)
			.add("status", status)
		.toString();
	}

}
