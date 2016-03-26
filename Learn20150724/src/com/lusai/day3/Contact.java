package com.lusai.day3;

public class Contact implements Info {
	


	private String address;
	private String telephone;
	private String zipcode;
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
	public Contact(String address,String telephone,String zipcode){
		this.setAddress(address);
		this.setTelephone(telephone);
		this.setZipcode(zipcode);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [address= " + address + ", telephone= " + telephone
				+ ", zipcode= " + zipcode + "]";
	}
	
	
}
