/**
 * @author Noah Chung - nmchung
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */

package model;

public class EuroConverter {
	double euro;
	double usd;
	
	public EuroConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EuroConverter(double euro) {
		super();
		this.euro = euro;
		setUsd(euro);
	}
	
	public double getEuro() {
		return euro;
	}
	public void setEuro(double euro) {
		this.euro = euro;
		setUsd(euro);
	}
	public double getUsd() {
		return usd;
	}
	public void setUsd(double euro) {
		final double EXCHANGE_RATE = 1.17;
		this.usd = euro * EXCHANGE_RATE;
	}
	
	@Override
	public String toString() {
		return "EuroConverter [euro=" + euro + ", usd=" + usd + "]";
	}
}
