package com.example.demo.test;

public class Emp {
int eno;
String ename;
public Emp(int eno, String ename) {
	super();
	this.eno = eno;
	this.ename = ename;
}
protected int getEno() {
	return eno;
}
protected void setEno(int eno) {
	this.eno = eno;
}
protected String getEname() {
	return ename;
}
protected void setEname(String ename) {
	this.ename = ename;
}

}
