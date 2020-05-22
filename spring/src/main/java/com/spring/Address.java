package com.spring;

public class Address 
{
String home;
int number;
public Address() {
	super();
}
public Address(String home, int number) {
	super();
	this.home = home;
	this.number = number;
}
public String getHome() {
	return home;
}
public void setHome(String home) {
	this.home = home;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
@Override
public String toString() {
	return "Address [home=" + home + ", number=" + number + "]";
}

}
