package com.webjpa.demo.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class FareRule {

	private int fareId;
	private String fareCode;
	private BigDecimal basicFare;
	private BigDecimal taxFare;
	
	
	/**
	 * @return
	 */
	public int getFareId() {
		return fareId;
	}
	/**
	 * @param fareId
	 */
	public void setFareId(int fareId) {
		this.fareId = fareId;
	}
	/**
	 * @return
	 */
	public String getFareCode() {
		return fareCode;
	}
	/**
	 * @param fareCode
	 */
	public void setFareCode(String fareCode) {
		this.fareCode = fareCode;
	}
	/**
	 * @return
	 */
	public BigDecimal getBasicFare() {
		return basicFare;
	}
	/**
	 * @param basicFare
	 */
	public void setBasicFare(BigDecimal basicFare) {
		this.basicFare = basicFare;
	}
	/**
	 * @return
	 */
	public BigDecimal getTaxFare() {
		return taxFare;
	}
	/**
	 * @param taxFare
	 */
	public void setTaxFare(BigDecimal taxFare) {
		this.taxFare = taxFare;
	}
	@Override
	public String toString() {
		return "FareRule [fareId=" + fareId + ", fareCode=" + fareCode + ", basicFare=" + basicFare + ", taxFare="
				+ taxFare + ", getFareId()=" + getFareId() + ", getFareCode()=" + getFareCode() + ", getBasicFare()="
				+ getBasicFare() + ", getTaxFare()=" + getTaxFare() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public void testMethod() {
		System.out.println("Inside the fareRule testMethod()");
	}
	
}
