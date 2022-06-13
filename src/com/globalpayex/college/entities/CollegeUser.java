package com.globalpayex.college.entities;

public class CollegeUser {

	public String name;
	public char gender;

	//composition realtion (HAS-A relation)
	//Student HAS-A Address, Professor HAS-A Address
	Address address;

	public CollegeUser(String name, char gender) {
		super();
		// address.se
		this.name = name;
		this.gender = gender;
	}
	
	


	public CollegeUser(String name, char gender, Address address) {
		this.name = name;
		this.gender = gender;
		this.address = address;
	}




	public String getDetails() {
//		this -> Student object, Professor Object, Other object
		return String.format("name: %s\nGender: %s\nAddress: %s", name, gender, 
						this.address != null ? this.address.getDetailsAddress() : "NA");
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return String.format("name: %s\nGender: %s", name, gender);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean isAddressPresent(){
		if(this.address != null){
			return true;
		}

		return false;
	}
}
