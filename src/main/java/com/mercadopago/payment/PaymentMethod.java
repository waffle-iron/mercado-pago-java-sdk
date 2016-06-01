package com.mercadopago.payment;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethod {

	@XmlElement(name = "id")
	private String id;

	@XmlElement(name = "name")
	private String name;
	
	@XmlElement(name = "payment_type_id")
	private PaymentType type;
	
	@XmlElement(name = "status")
	private PaymentStatus status;
	
	@XmlElement(name = "secure_thumbnail")
	private String secureThumbnail;
	
	@XmlElement(name = "thumbnail")
	private String thumbnail;
	
	@XmlElement(name = "deferred_capture")
	private String deferredCapture;
	
	@XmlElement(name = "settings")
	private List<PaymentMethodSettings> settings;
	
	@XmlElement(name = "additional_info_needed")
	private List<String> additionalInfoNeeded;

	@XmlElement(name = "min_allowed_amount")
	private Integer minAllowedAmount;
	
	@XmlElement(name = "max_allowed_amount")
	private Integer maxAllowedAmount;
	
	@XmlElement(name = "accreditation_time")
	private Integer accreditationTime;
	
	public enum PaymentStatus {
		ACTIVE("active"), DEACTIVE("deactive"), TEMPORALLY_DEACTIVE("temporally_deactive");
		
		private String name;
		
		PaymentStatus(String name) {
			this.name = name;
		}
		
		@JsonValue
		public String getName() {
			return name;
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public PaymentType getType() {
		return type;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public String getSecureThumbnail() {
		return secureThumbnail;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public String getDeferredCapture() {
		return deferredCapture;
	}

	public List<PaymentMethodSettings> getSettings() {
		return settings;
	}
	
	public List<String> getAdditionalInfoNeeded() {
		return additionalInfoNeeded;
	}
	
	public Integer getMinAllowedAmount() {
		return minAllowedAmount;
	}
	
	public Integer getMaxAllowedAmount() {
		return maxAllowedAmount;
	}

	public Integer getAccreditationTime() {
		return accreditationTime;
	}

	@Override
	public String toString() {
		return "PaymentMethod [value=" + id + ", value=" + name + ", type=" + type + ", status=" + status
				+ ", secureThumbnail=" + secureThumbnail + ", thumbnail=" + thumbnail + ", deferredCapture="
				+ deferredCapture + ", settings=" + settings + ", additionalInfoNeeded=" + additionalInfoNeeded
				+ ", minAllowedAmount=" + minAllowedAmount + ", maxAllowedAmount=" + maxAllowedAmount
				+ ", accreditationTime=" + accreditationTime + "]";
	}
	
}
