package com.pubsubpattern.app.model;

public class EnggStudent extends Student{
    String branch;

    public EnggStudent(String name, Integer rollNo, String branch) {
        super(name, rollNo);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
