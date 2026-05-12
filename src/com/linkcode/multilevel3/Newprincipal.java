package com.linkcode.multilevel3;

public class Newprincipal {
	

	    private String name;
	    private int pno;
	    private String gender;

	    public Newprincipal(String name, int no, String gender) {
	        this.name = name;
	        this.pno = no;
	        this.gender = gender;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public int getPno() {
	        return pno;
	    }

	    public String getGender() {
	        return gender;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPno(int pno) {
	        this.pno = pno;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	}

