package com.linkcode.multilevel3;

	public class NewTeacher extends NewHOD {

	    private String tName;
	    private String subname;
	    private int tconNo;

	    public NewTeacher(String tName, String subname, int tconno,
	                   String name, int no, String gender,
	                   String hname1, int id, String branch) {

	        super(name, no, gender, hname1, id, branch);

	        this.tName = tName;
	        this.subname = subname;
	        this.tconNo = tconno;
	    }

	    // Getters
	    public String gettName() {
	        return tName;
	    }

	    public String getSubname() {
	        return subname;
	    }

	    public int getTconNo() {
	        return tconNo;
	    }

	    // Setters
	    public void settName(String tName) {
	        this.tName = tName;
	    }

	    public void setSubname(String subname) {
	        this.subname = subname;
	    }

	    public void setTconNo(int tconNo) {
	        this.tconNo = tconNo;
	    }
	}

