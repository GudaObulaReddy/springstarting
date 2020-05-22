package com.spring;

public class FirstSpring
{
 String name;
 int id;
 Address address;
 public FirstSpring(Address address)
 {
	 this.address=address;
}
 public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public FirstSpring()
 {
}
public FirstSpring(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "FirstSpring [name=" + name + ", id=" + id + ", address=" + address + "]";
}
 
}
