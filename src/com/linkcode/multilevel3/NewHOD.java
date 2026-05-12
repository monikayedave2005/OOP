package com.linkcode.multilevel3;

public class NewHOD extends Newprincipal {

	    private String hName;
	    private int hid;
	    private String branch;

	    public NewHOD(String name, int no, String gender,
	               String hname1, int id, String branch) {

	        super(name, no, gender);
	        this.hName = hname1;
	        this.hid = id;
	        this.branch = branch;
	    }

	    // Getters
	    public String gethName() {
	        return hName;
	    }

	    public int getHid() {
	        return hid;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    // Setters
	    public void sethName(String hName) {
	        this.hName = hName;
	    }

	    public void setHid(int hid) {
	        this.hid = hid;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }
	}

