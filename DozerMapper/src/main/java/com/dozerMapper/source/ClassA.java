package com.dozerMapper.source;

import org.dozer.Mapping;

public class ClassA {
	@Mapping("studentName")
	private String name;
	@Mapping("studentUsn")
	private String usn;
	@Mapping("studentAddress")
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}		// TODO Auto-generated method stub
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ClassA(String name, String usn, String address) {
		super();
		this.name = name;
		this.usn = usn;
		this.address = address;
	}
	
	public ClassA() {
		super();
	}
	@Override
	public String toString() {
		return "ClassA [name=" + name + ", usn=" + usn + ", address=" + address + "]";
	}
	
	

}
