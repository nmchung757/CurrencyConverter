/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */

package model;

public class UsdConverter {
	private double usd;
	private double euro;
	
	public UsdConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsdConverter(double usd) {
		super();
		this.usd = usd;
		setEuro(usd);
	}
	
	public double getUsd() {
		return usd;
	}
	public void setUsd(double usd) {
		this.usd = usd;
		setEuro(usd);
	}
	public double getEuro() {
		return euro;
	}
	public void setEuro(double usd) {
		final double EXCHANGE_RATE = 0.85;
		this.euro = usd * EXCHANGE_RATE;
	}
	
	@Override
	public String toString() {
		return "UsdConverter [usd=" + usd + ", euro=" + euro + "]";
	}
}
