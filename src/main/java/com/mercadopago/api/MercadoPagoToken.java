package com.mercadopago.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.MoreObjects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MercadoPagoToken {

	@XmlElement(name = "access_token")
	private String accessToken;

	@XmlElement(name = "refresh_token")
	private String refreshToken;

	@XmlElement(name = "live_mode")
	private boolean liveMode;

	@XmlElement(name = "user_id")
	private Integer userId;

	@XmlElement(name = "token_type")
	private String tokenType;

	@XmlElement(name = "expires_in")
	private Integer expiresIn;

	@XmlElement(name = "scope")
	private String scope;

	public String getAccessToken() {
		return accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public boolean isLiveMode() {
		return liveMode;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getTokenType() {
		return tokenType;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public String getScope() {
		return scope;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
			.add("accessToken", accessToken)
			.add("refreshToken", refreshToken)
			.add("liveMode", liveMode)
			.add("userId", userId)
			.add("tokenType", tokenType)
			.add("expiresIn", expiresIn)
			.add("scope", scope)
		.toString();
	}
	
}
